package data

import model.*
import service.MercadoLibreService
import java.time.LocalDateTime
import kotlin.math.roundToInt
import kotlin.random.Random

val random = Random(100)

fun getPayment () = Payment("1111-1111-1111-1111", LocalDateTime.of(2025, 11, 1, 0, 0), "123", "Example")

fun randomNumber(min: Double, max: Double): Double {
  return random.nextDouble(min, max + 1)
}

fun getNewPrice(price: Double): Double = randomNumber(price / 2, price * 2)

fun getRandomQuestion() = getAllComments().random(random)

fun getAllDraftProducts(allCategories: List<Category>): List<DraftProduct> {
  return allProductJson.map {
    DraftProduct(
      title = it.title,
      description = it.description,
      price = it.price,
      images = it.images.toMutableList(),
      stock = it.stock,
      shipping = Shipping(0.0),
      characteristics = it.dimensions.map { (key,value) -> Characteristic(key, "$value") }.toMutableList(),
      category = allCategories.find { cat -> cat.name == it.category }!!,
    )
  }
}

fun addAllCategories(mercadoLibreService: MercadoLibreService) {
  val categories = listOf(
    "beauty",
    "fragrances",
    "furniture",
    "groceries",
    "home-decoration",
    "kitchen-accessories",
    "laptops",
    "shirts",
    "shoes",
    "watches",
    "mobile-accessories",
    "motorcycle",
    "skin-care",
    "smartphones",
    "sports-accessories",
    "sunglasses",
    "tablets",
    "tops",
    "vehicle",
    "bags",
    "dresses",
    "jewellery",
  )
  categories.forEach { mercadoLibreService.addCategory(it) }
}

fun addAllUsers(mercadoLibreService: MercadoLibreService) {
  allUsers.map {
    DraftNewUser(
      name = "${it.firstName} ${it.lastName}",
      email = it.email,
      password = it.password,
      image = it.image,
    )
  }.forEach {
    mercadoLibreService.registerNewUser(it)
  }
}

fun addAllProducts(mercadoLibreService: MercadoLibreService) {
  val draftProducts = getAllDraftProducts(mercadoLibreService.categories)
  mercadoLibreService.users.map { user ->
    draftProducts.shuffled(random).take(20).forEach {
      it.price = getNewPrice(it.price)
      it.shipping.price = randomNumber(0.0, 1000.0)
      mercadoLibreService.addProduct(user.id, it)
    }
  }
}

fun addQuestions(mercadoLibreService: MercadoLibreService) {
  mercadoLibreService.users.map { user ->
    mercadoLibreService.products
      .filter { it.owner != user }
      .shuffled(random)
      .take(30)
      .forEach { product ->
        mercadoLibreService.addQuestion(user.id, product.id, getRandomQuestion())
      }
  }
}

fun addAnswers(mercadoLibreService: MercadoLibreService) {
  mercadoLibreService.users.map { user ->
    user.products
      .filter { it.questions.size > 3 }
      .forEach { product ->
        product.questions.shuffled(random).take(3).forEach {
          mercadoLibreService.addAnswer(user.id, product.id, it.id, getRandomQuestion())
        }
      }
  }
}

fun addPurchases(mercadoLibreService: MercadoLibreService) {
  mercadoLibreService.users
    .shuffled(random)
    .take((mercadoLibreService.users.size * 0.7).roundToInt())
    .map { user ->
      mercadoLibreService.products
        .filter { it.owner.id != user.id }
        .shuffled(random)
        .take(10)
        .forEach { product ->
          val amount = random.nextInt(1, 10)
          if (product.stock >= amount) {
            mercadoLibreService.updateItemCart(user.id, product.id, amount)
          }
        }
      if (random.nextBoolean()) {
        mercadoLibreService.purchase(user.id, getPayment())
      }
    }
}

fun addLikes(mercadoLibreService: MercadoLibreService) {
  mercadoLibreService.users
    .shuffled(random)
    .take((mercadoLibreService.users.size * 0.7).roundToInt())
    .forEach{ user ->
      mercadoLibreService.products
        .shuffled(random)
        .take(20)
        .forEach { product ->
          mercadoLibreService.toggleLike(user.id, product.id)
        }
    }
}

fun initSystem(): MercadoLibreService {
  val mercadoLibreService = MercadoLibreService()
  addAllCategories(mercadoLibreService)
  addAllUsers(mercadoLibreService)
  addAllProducts(mercadoLibreService)
  addQuestions(mercadoLibreService)
  addAnswers(mercadoLibreService)
  addPurchases(mercadoLibreService)
  addLikes(mercadoLibreService)
  return mercadoLibreService
}

fun main() {
  initSystem()
}