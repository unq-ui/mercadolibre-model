package service

import model.*
import utilities.Page
import utilities.getPage
import java.time.LocalDateTime

class MercadoLibreService {
    private val idGenerator = IdGenerator()
    val products: MutableList<Product> = mutableListOf()
    val users: MutableList<User> = mutableListOf()
    val categories: MutableList<Category> = mutableListOf()
    val carts: MutableList<Cart> = mutableListOf()

    fun registerNewUser(draftNewUser: DraftNewUser): User {
        if (users.any { it.email == draftNewUser.email}) {
            throw UserException("The email is already registered.")
        }
        val user = User(
            idGenerator.nextUserId(),
            draftNewUser.name,
            draftNewUser.email,
            draftNewUser.password,
            draftNewUser.image,
            mutableListOf(),
            mutableListOf(),
            mutableListOf(),
            mutableListOf(),
        )
        users.add(user)
        return user
    }

    fun getUser(email: String, password: String): User {
        return users.find { it.email == email && it.password == password } ?: throw UserException("Not found")
    }

    fun getUser(id: String): User {
        return users.find { it.id == id } ?: throw UserException("Not found")
    }

    fun toggleLike(idUser: String, idProduct: String): User {
        val user = getUser(idUser)
        val product = getProduct(idProduct)
        if (!user.likedProducts.remove(product)) {
            user.likedProducts.add(product)
        }
        return user
    }

    fun addCategory(name: String): Category {
        if (categories.any { it.name == name}) {
            throw CategoryException("The category already exists.")
        }
        val category = Category(idGenerator.nextCategoryId(), name)
        categories.add(category)
        return category
    }

    fun getAllCategories(): List<Category> = categories

    fun addProduct(userId: String, draftProduct: DraftProduct): Product {
        val user = getUser(userId)
        val product = Product(
            idGenerator.nextProductId(),
            user,
            draftProduct.title,
            draftProduct.description,
            draftProduct.images,
            draftProduct.stock,
            draftProduct.price,
            draftProduct.shipping,
            draftProduct.characteristics,
            draftProduct.category,
            mutableListOf()
        )
        user.products.add(product)
        products.add(product)

        return product
    }

    fun editProduct(userId: String, productId: String, draftProduct: DraftProduct): Product {
        val user = getUser(userId)
        val product = getProduct(productId)
        if (product.owner.id != user.id) throw ProductException("Not allowed.")
        product.title = draftProduct.title
        product.description = draftProduct.description
        product.images = draftProduct.images
        product.stock = draftProduct.stock
        product.shipping = draftProduct.shipping
        product.characteristics = draftProduct.characteristics
        product.category = draftProduct.category
        return product
    }

    fun getProduct(id: String): Product {
        return products.find { it.id == id } ?: throw ProductException("Not found")
    }

    fun getProductsByUser(idUser: String, pageNumber: Int): Page<Product> {
        val filteredProducts = products.filter { it.owner.id == idUser }
        return getPage(filteredProducts, pageNumber)
    }

    fun getProductsByCategory(idCategory: String, pageNumber: Int): Page<Product> {
        val filteredProducts = products.filter { it.category.id == idCategory }
        return getPage(filteredProducts, pageNumber)
    }

    fun searchProducts(text: String, pageNumber: Int): Page<Product> {
        val filteredProducts = products.filter { it.title.contains(text, true) || it.description.contains(text, true)}
        return getPage(filteredProducts, pageNumber)
    }

    fun updateItemCart(userId: String, productId: String, amount: Int): Cart {
        val cart = getCart(userId)
        val product = getProduct(productId)
        cart.items.removeIf { it.product.id == productId }
        cart.items.add(Unit(product, amount))
        return cart
    }

    fun deleteItemFromCart(userId: String, productId: String): Cart {
        val cart = getCart(userId)
        val product = getProduct(productId)
        cart.items.removeIf { it.product.id == product.id }
        return cart
    }

    fun getCart(id: String): Cart {
        return carts.find { it.user.id == id } ?: run {
            val cart =  Cart(getUser(id), mutableListOf())
            carts.add(cart)
            return cart
        }
    }

    fun buy(idUser: String, payment: Payment) {
        val user = getUser(idUser)
        val cart = getCart(idUser)
        if (cart.items.isEmpty()) throw BuyException("Cart is empty")
        if (cart.items.all { it.product.stock >= it.amount }) {
            cart.items.forEach {
                it.product.stock -= it.amount
                it.product.owner.salesHistory.add(
                    SaleHistory(it.product, it.amount, payment, LocalDateTime.now(), cart.user)
                )
            }
            user.buyHistory.add(BuyHistory(cart.items, payment, LocalDateTime.now()))
            carts.remove(cart)
        } else {
            throw BuyException("Unable to complete the purchase because one or more items are out of stock.")
        }
    }

    fun addQuestion(idUser: String, idProduct: String, question: String): Product {
        val user = getUser(idUser)
        val product = getProduct(idProduct)
        if (product.owner.id == idUser) throw QuestionException("Not allowed.")
        product.questions.add(Question(idGenerator.nextQuestionId(), product, user, question, null))
        return product
    }

    fun addAnswer(idUser: String, idProduct: String, idQuestion: String, text: String): Product {
        val user = getUser(idUser)
        val product = getProduct(idProduct)
        if (product.owner.id != user.id) throw QuestionException("Not allowed.")
        val question = product.questions.find { it.id == idQuestion } ?: throw QuestionException("Not found question")
        question.response = text
        return product
    }
}