package service

import model.*
import utilities.Page
import utilities.getPage
import java.time.LocalDateTime
import info.debatty.java.stringsimilarity.*;

class MercadoLibreService {
    private val idGenerator = IdGenerator()
    val products: MutableList<Product> = mutableListOf()
    val users: MutableList<User> = mutableListOf()
    val categories: MutableList<Category> = mutableListOf()
    val carts: MutableList<Cart> = mutableListOf()

    /**
     * Registers a new user.
     * @param draftNewUser The draft user data.
     * @return The registered user.
     * @throws UserException if the email is already registered.
     */
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

    /**
     * Retrieves a user by email and password.
     * @param email The user's email.
     * @param password The user's password.
     * @return The user.
     * @throws UserException if the user is not found.
     */
    fun getUser(email: String, password: String): User {
        return users.find { it.email == email && it.password == password } ?: throw UserException("Not found")
    }

    /**
     * Retrieves a user by id.
     * @param id The user's id.
     * @return The user.
     * @throws UserException if the user is not found.
     */
    fun getUser(id: String): User {
        return users.find { it.id == id } ?: throw UserException("Not found")
    }

    /**
     * Toggles the like status of a product for a user.
     * @param idUser The user's ID.
     * @param idProduct The product's ID.
     * @return The updated user.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun toggleLike(idUser: String, idProduct: String): User {
        val user = getUser(idUser)
        val product = getProduct(idProduct)
        if (!user.likedProducts.remove(product)) {
            user.likedProducts.add(product)
        }
        return user
    }

    /**
     * Adds a new category.
     * @param name The category name.
     * @return The added category.
     * @throws CategoryException if the category already exists.
     */
    fun addCategory(name: String): Category {
        if (categories.any { it.name == name}) {
            throw CategoryException("The category already exists.")
        }
        val category = Category(idGenerator.nextCategoryId(), name)
        categories.add(category)
        return category
    }

    /**
     * Retrieves all categories.
     * @return The list of categories.
     */
    fun getAllCategories(): List<Category> = categories

    /**
     * Retrieves a category by ID.
     * @param id The category's ID.
     * @return The category.
     * @throws CategoryException if the category is not found.
     */
    fun getCategory(id: String): Category {
        return categories.find { it.id == id } ?: throw CategoryException("Not found")
    }

    /**
     * Adds a new product.
     * @param userId The user's ID.
     * @param draftProduct The draft product data.
     * @return The added product.
     * @throws UserException if the user is not found.
     */
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

    /**
     * Edits an existing product.
     * @param userId The user's ID.
     * @param productId The product's ID.
     * @param draftProduct The draft product data.
     * @return The edited product.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     * @throws ProductException if the user is not the owner of the product.
     */
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

    /**
     * Retrieves a product by ID.
     * @param id The product's ID.
     * @return The product.
     * @throws ProductException if the product is not found.
     */
    fun getProduct(id: String): Product {
        return products.find { it.id == id } ?: throw ProductException("Not found")
    }

    /**
     * Retrieves all products with pagination.
     * @param pageNumber The page number.
     * @return A page of products.
     */
    fun getAllProducts(pageNumber: Int): Page<Product> = getPage(products, pageNumber)

    /**
     * Retrieves related products to a product.
     * @param idProduct The product's ID.
     * @return The list of related products (max 10 products).
     * @throws ProductException if the product is not found.
    */
    fun getRelatedProducts(idProduct: String): List<Product> {
        val product = getProduct(idProduct)
        val relatedProducts = products.filter {
            Levenshtein().distance(it.title, product.title) < 3 && it.id != product.id
        }
        return relatedProducts.take(10)
    }

    /**
     * Retrieves products by user ID with pagination.
     * @param idUser The user's ID.
     * @param pageNumber The page number.
     * @return A Page of products.
     */
    fun getProductsByUser(idUser: String, pageNumber: Int): Page<Product> {
        val filteredProducts = products.filter { it.owner.id == idUser }
        return getPage(filteredProducts, pageNumber)
    }

    /**
     * Retrieves products by category ID with pagination.
     * @param idCategory The category's ID.
     * @param pageNumber The page number.
     * @return A page of products.
     */
    fun getProductsByCategory(idCategory: String, pageNumber: Int): Page<Product> {
        val filteredProducts = products.filter { it.category.id == idCategory }
        return getPage(filteredProducts, pageNumber)
    }

    /**
     * Searches for products by text with pagination.
     * @param text The search text.
     * @param pageNumber The page number.
     * @return A page of products.
     */
    fun searchProducts(text: String, pageNumber: Int): Page<Product> {
        val filteredProducts = products.filter { it.title.contains(text, true) || it.description.contains(text, true)}
        return getPage(filteredProducts, pageNumber)
    }

    /**
     * Updates the quantity of a product in the user's cart.
     * @param userId The user's ID.
     * @param productId The product's ID.
     * @param amount The quantity to update.
     * @return The updated cart.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun updateItemCart(userId: String, productId: String, amount: Int): Cart {
        val cart = getCart(userId)
        val product = getProduct(productId)
        cart.items.removeIf { it.product.id == productId }
        cart.items.add(Item(product, amount))
        return cart
    }

    /**
     * Deletes a product from the user's cart.
     * @param userId The user's ID.
     * @param productId The product's ID.
     * @return The updated cart.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun deleteItemFromCart(userId: String, productId: String): Cart {
        val cart = getCart(userId)
        val product = getProduct(productId)
        cart.items.removeIf { it.product.id == product.id }
        return cart
    }

    /**
     * Retrieves the cart for a user.
     * @param id The user's ID.
     * @return The cart.
     * @throws UserException if the user is not found.
     */
    fun getCart(id: String): Cart {
        return carts.find { it.user.id == id } ?: run {
            val cart =  Cart(getUser(id), mutableListOf())
            carts.add(cart)
            return cart
        }
    }

    /**
     * Completes a purchase for a user.
     * @param idUser The user's ID.
     * @param payment The payment information.
     * @throws BuyException if the cart is empty or items are out of stock.
     * @throws UserException if the user is not found.
     */
    fun purchase(idUser: String, payment: Payment) {
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

    /**
     * Adds a question to a product.
     * @param idUser The user's ID.
     * @param idProduct The product's ID.
     * @param question The question text.
     * @return The updated product.
     * @throws QuestionException if the user is the owner of the product.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun addQuestion(idUser: String, idProduct: String, question: String): Product {
        val user = getUser(idUser)
        val product = getProduct(idProduct)
        if (product.owner.id == idUser) throw QuestionException("Not allowed.")
        product.questions.add(Question(idGenerator.nextQuestionId(), product, user, question, null))
        return product
    }

    /**
     * Adds an answer to a question on a product.
     * @param idUser The user's ID.
     * @param idProduct The product's ID.
     * @param idQuestion The question's ID.
     * @param text The answer text.
     * @return The updated product.
     * @throws QuestionException if the user is not the owner of the product or the question is not found.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun addAnswer(idUser: String, idProduct: String, idQuestion: String, text: String): Product {
        val user = getUser(idUser)
        val product = getProduct(idProduct)
        if (product.owner.id != user.id) throw QuestionException("Not allowed.")
        val question = product.questions.find { it.id == idQuestion } ?: throw QuestionException("Not found question")
        question.response = text
        return product
    }
}