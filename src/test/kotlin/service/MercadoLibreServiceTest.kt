package service

import data.initSystem
import model.*
import java.time.LocalDateTime
import kotlin.test.*

fun getDraftNewUser(name: String): DraftNewUser {
    return DraftNewUser(
        name,
        "$name@example.com",
        "password_$name",
        "image.com/asd.png"
    )
}

fun getDraftProduct(name: String, categoryId: String = "c_1"): DraftProduct {
    return DraftProduct(
        name,
        "description: $name",
        10.0,
        mutableListOf("image.com/$name.png"),
        10,
        Shipping(100.0),
        mutableListOf(Characteristic("name1", "value1")),
        Category(categoryId, "cat1")
    )
}

class MercadoLibreServiceTest {

    @Test
    fun registerNewUserTest() {
        val mercadoLibreService = MercadoLibreService()
        assertEquals(mercadoLibreService.users.size, 0)
        val user = mercadoLibreService.registerNewUser(DraftNewUser(
            "name",
            "email@example.com",
            "password",
            "image.com/asd.png"
        ))
        assertEquals(mercadoLibreService.users.size, 1)
        assertEquals(user, mercadoLibreService.users[0])
    }

    @Test
    fun registerNewUserTwoTimesTest() {
        val mercadoLibreService = MercadoLibreService()
        assertEquals(mercadoLibreService.users.size, 0)
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        assertEquals(mercadoLibreService.users.size, 1)
        assertEquals(user, mercadoLibreService.users[0])
        assertFailsWith<UserException> {
            mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        }
    }

    @Test
    fun getUserTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user = mercadoLibreService.getUser("example@example.com", "password_example")
        assertEquals(registerUser, user)
    }

    @Test
    fun getUserWithWrongEmailTest() {
        val mercadoLibreService = MercadoLibreService()
        mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        assertFailsWith<UserException> {
            mercadoLibreService.getUser("example1@example.com", "password_example")
        }
    }

    @Test
    fun getUserWithWrongPasswordTest() {
        val mercadoLibreService = MercadoLibreService()
        mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        assertFailsWith<UserException> {
            mercadoLibreService.getUser("example@example.com", "password_example1")
        }
    }

    @Test
    fun getUserByIdTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user = mercadoLibreService.getUser("u_1")
        assertEquals(registerUser, user)
    }

    @Test
    fun getUserByIdWithoutUserTest() {
        val mercadoLibreService = MercadoLibreService()
        assertFailsWith<UserException> {
            mercadoLibreService.getUser("u_1")
        }
    }

    @Test
    fun toggleLikeTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val product = mercadoLibreService.addProduct(registerUser.id, getDraftProduct("product"))
        assertEquals(registerUser.likedProducts.size, 0)
        mercadoLibreService.toggleLike(registerUser.id, product.id)
        assertEquals(registerUser.likedProducts.size, 1)
        mercadoLibreService.toggleLike(registerUser.id, product.id)
        assertEquals(registerUser.likedProducts.size, 0)
    }

    @Test
    fun addCategoryTest() {
        val mercadoLibreService = MercadoLibreService()
        assertEquals(mercadoLibreService.categories.size, 0)
        val category = mercadoLibreService.addCategory("cat1")
        assertEquals(mercadoLibreService.categories.size, 1)
        assertEquals(category, mercadoLibreService.categories[0])
    }

    @Test
    fun addCategoryTwoTimesTest() {
        val mercadoLibreService = MercadoLibreService()
        assertEquals(mercadoLibreService.categories.size, 0)
        mercadoLibreService.addCategory("cat1")
        assertEquals(mercadoLibreService.categories.size, 1)
        assertFailsWith<CategoryException> {
            mercadoLibreService.addCategory("cat1")
        }
    }

    @Test
    fun getAllCategoriesTest() {
        val mercadoLibreService = MercadoLibreService()
        assertEquals(mercadoLibreService.getAllCategories().size, 0)
        mercadoLibreService.addCategory("cat1")
        assertEquals(mercadoLibreService.getAllCategories().size, 1)
    }

    @Test
    fun getCategoryTest() {
        val mercadoLibreService = MercadoLibreService()
        val category = mercadoLibreService.addCategory("cat1")
        assertEquals(mercadoLibreService.getCategory("c_1"), category)
    }

    @Test
    fun getCategoryWrongIdTest() {
        val mercadoLibreService = MercadoLibreService()
        assertFailsWith<CategoryException> {
            mercadoLibreService.getCategory("c_1")
        }
    }

    @Test
    fun addProductTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        assertEquals(mercadoLibreService.products.size, 0)
        assertEquals(registerUser.products.size, 0)
        val product = mercadoLibreService.addProduct(registerUser.id, getDraftProduct("product"))
        assertEquals(mercadoLibreService.products.size, 1)
        assertEquals(product, mercadoLibreService.products[0])
        assertEquals(registerUser.products.size, 1)
        assertEquals(registerUser.products[0], product)
    }

    @Test
    fun editProductTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val product = mercadoLibreService.addProduct(registerUser.id, getDraftProduct("product"))
        assertEquals(mercadoLibreService.products.size, 1)
        mercadoLibreService.editProduct(registerUser.id, product.id, getDraftProduct("product2"))
        assertEquals(mercadoLibreService.products.size, 1)
        assertEquals(product.title, "product2")
    }

    @Test
    fun editProductNotOwnerTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val anotherUser = mercadoLibreService.registerNewUser(getDraftNewUser("user"))
        val product = mercadoLibreService.addProduct(registerUser.id, getDraftProduct("product"))
        assertEquals(mercadoLibreService.products.size, 1)
        assertFailsWith<ProductException> {
            mercadoLibreService.editProduct(anotherUser.id, product.id, getDraftProduct("product2"))
        }
    }

    @Test
    fun getProductTest() {
        val mercadoLibreService = MercadoLibreService()
        val registerUser = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val registerProduct = mercadoLibreService.addProduct(registerUser.id, getDraftProduct("product"))
        val product = mercadoLibreService.getProduct(registerProduct.id)
        assertEquals(registerProduct, product)
    }

    @Test
    fun getProductWithWrongIdTest() {
        val mercadoLibreService = MercadoLibreService()
        assertFailsWith<ProductException> {
            mercadoLibreService.getProduct("p_1")
        }
    }

    @Test
    fun getProductsByUserTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user2 = mercadoLibreService.registerNewUser(getDraftNewUser("user1"))
        val user3 = mercadoLibreService.registerNewUser(getDraftNewUser("user2"))
        val productFromUser = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        val productFromUser2 = mercadoLibreService.addProduct(user2.id, getDraftProduct("product2"))

        val response = mercadoLibreService.getProductsByUser(user.id, 1)
        assertEquals(productFromUser, response.items[0])

        val response2 = mercadoLibreService.getProductsByUser(user2.id, 1)
        assertEquals(productFromUser2, response2.items[0])

        val response3 = mercadoLibreService.getProductsByUser(user3.id, 1)
        assertEquals(response3.items.size, 0)
    }

    @Test
    fun getProductsByUserWithWrongPageTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))

        assertFailsWith<PageException> {
            mercadoLibreService.getProductsByUser(user.id, -1)
        }

        assertFailsWith<PageException> {
            mercadoLibreService.getProductsByUser(user.id, 0)
        }

        val response = mercadoLibreService.getProductsByUser(user.id, 10)
        assertEquals(response.items.size, 0)
    }

    @Test
    fun getProductsByCategoryTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val productFromUser = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        val product2FromUser = mercadoLibreService.addProduct(user.id, getDraftProduct("product2", "c_2"))

        val response = mercadoLibreService.getProductsByCategory("c_1", 1)
        assertEquals(productFromUser, response.items[0])

        val response2 = mercadoLibreService.getProductsByCategory("c_2", 1)
        assertEquals(product2FromUser, response2.items[0])
    }

    @Test
    fun searchProductTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        mercadoLibreService.addProduct(user.id, getDraftProduct("product2", "c_2"))
        mercadoLibreService.addProduct(user.id, getDraftProduct("product3"))
        mercadoLibreService.addProduct(user.id, getDraftProduct("pepe", "c_2"))

        var result = mercadoLibreService.searchProducts("product", 1)
        assertEquals(result.items.size, 3)
        result = mercadoLibreService.searchProducts("description", 1)
        assertEquals(result.items.size, 4)
        result = mercadoLibreService.searchProducts("pepe", 1)
        assertEquals(result.items.size, 1)
    }

    @Test
    fun updateItemCartTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        val p2 = mercadoLibreService.addProduct(user.id, getDraftProduct("product2", "c_2"))

        var cart = mercadoLibreService.updateItemCart(user.id, p1.id, 1)
        assertEquals(cart.items.size, 1)
        assertEquals(cart.items[0].product, p1)
        assertEquals(cart.items[0].amount, 1)

        cart = mercadoLibreService.updateItemCart(user.id, p1.id, 2)
        assertEquals(cart.items.size, 1)
        assertEquals(cart.items[0].product, p1)
        assertEquals(cart.items[0].amount, 2)

        cart = mercadoLibreService.updateItemCart(user.id, p2.id, 10)
        assertEquals(cart.items.size, 2)
        assertEquals(cart.items[0].product, p1)
        assertEquals(cart.items[0].amount, 2)
        assertEquals(cart.items[1].product, p2)
        assertEquals(cart.items[1].amount, 10)
    }

    @Test
    fun deleteItemFromCartTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))

        var cart = mercadoLibreService.updateItemCart(user.id, p1.id, 1)
        assertEquals(cart.items.size, 1)
        assertEquals(cart.items[0].product, p1)
        assertEquals(cart.items[0].amount, 1)

        cart = mercadoLibreService.deleteItemFromCart(user.id, p1.id)
        assertEquals(cart.items.size, 0)

        cart = mercadoLibreService.deleteItemFromCart(user.id, p1.id)
        assertEquals(cart.items.size, 0)
    }

    @Test
    fun getCartTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        assertEquals(mercadoLibreService.carts.size, 0)
        val cart = mercadoLibreService.getCart(user.id)
        assertEquals(mercadoLibreService.carts.size, 1)
        assertEquals(mercadoLibreService.carts[0], cart)
    }

    @Test
    fun purchaseTest() {
        val mercadoLibreService = MercadoLibreService()
        val seller = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val buyer = mercadoLibreService.registerNewUser(getDraftNewUser("user"))
        val p1 = mercadoLibreService.addProduct(seller.id, getDraftProduct("product"))
        mercadoLibreService.updateItemCart(buyer.id, p1.id, 1)

        assertEquals(seller.salesHistory.size, 0)
        assertEquals(buyer.buyHistory.size, 0)
        assertEquals(p1.stock, 10)

        val payment = Payment("3333", LocalDateTime.now(), "333", "pepe")
        mercadoLibreService.purchase(buyer.id, payment)

        assertEquals(seller.salesHistory.size, 1)
        assertEquals(seller.salesHistory[0].amount, 1)
        assertEquals(seller.salesHistory[0].user, buyer)
        assertEquals(seller.salesHistory[0].product, p1)
        assertEquals(seller.salesHistory[0].payment, payment)

        assertEquals(buyer.buyHistory.size, 1)
        assertEquals(buyer.buyHistory[0].items[0].product, p1)

        assertEquals(p1.stock, 9)
    }

    @Test
    fun purchaseWithoutItemsTest() {
        val mercadoLibreService = MercadoLibreService()
        val buyer = mercadoLibreService.registerNewUser(getDraftNewUser("user"))
        assertFailsWith<BuyException> {
            mercadoLibreService.purchase(buyer.id, Payment("3333", LocalDateTime.now(), "333", "pepe"))
        }
    }

    @Test
    fun purchaseMoreItemsThanStockTest() {
        val mercadoLibreService = MercadoLibreService()
        val seller = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val buyer = mercadoLibreService.registerNewUser(getDraftNewUser("user"))
        val p1 = mercadoLibreService.addProduct(seller.id, getDraftProduct("product"))
        mercadoLibreService.updateItemCart(buyer.id, p1.id, 100)

        assertFailsWith<BuyException> {
            mercadoLibreService.purchase(buyer.id, Payment("3333", LocalDateTime.now(), "333", "pepe"))
        }
    }

    @Test
    fun addQuestionTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user2 = mercadoLibreService.registerNewUser(getDraftNewUser("user"))

        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))

        assertEquals(p1.questions.size, 0)
        mercadoLibreService.addQuestion(user2.id, p1.id, "question?")
        assertEquals(p1.questions.size, 1)
        assertEquals(p1.questions[0].user, user2)
        assertEquals(p1.questions[0].text, "question?")
        assertNull(p1.questions[0].response)
    }

    @Test
    fun addQuestionSameUserTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        assertFailsWith<QuestionException> {
            mercadoLibreService.addQuestion(user.id, p1.id, "question?")
        }
    }

    @Test
    fun addAnswerTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user2 = mercadoLibreService.registerNewUser(getDraftNewUser("user"))

        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        mercadoLibreService.addQuestion(user2.id, p1.id, "question?")
        val question = p1.questions[0]
        assertNull(question.response)

        mercadoLibreService.addAnswer(user.id, p1.id, question.id, "answer")

        assertNotNull(question.response)
        assertEquals(question.response, "answer")
    }

    @Test
    fun addAnswerNotOwnerTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user2 = mercadoLibreService.registerNewUser(getDraftNewUser("user"))

        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))
        mercadoLibreService.addQuestion(user2.id, p1.id, "question?")
        val question = p1.questions[0]
        assertNull(question.response)

        assertFailsWith<QuestionException> {
            mercadoLibreService.addAnswer(user2.id, p1.id, question.id, "answer")
        }
    }

    @Test
    fun addAnswerQuestionNotFoundTest() {
        val mercadoLibreService = MercadoLibreService()
        val user = mercadoLibreService.registerNewUser(getDraftNewUser("example"))
        val user2 = mercadoLibreService.registerNewUser(getDraftNewUser("user"))

        val p1 = mercadoLibreService.addProduct(user.id, getDraftProduct("product"))

        assertFailsWith<QuestionException> {
            mercadoLibreService.addAnswer(user2.id, p1.id, "q_1", "answer")
        }
    }

    @Test
    fun getRelatedProductsTest() {
        val mercadoLibreService = initSystem()
        assertEquals(mercadoLibreService.getRelatedProducts("p_90").size, 10)
    }
}