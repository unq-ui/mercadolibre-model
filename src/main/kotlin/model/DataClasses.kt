package model

import java.time.LocalDateTime

class Category(val id: String, val name: String)

class Characteristic(val name: String, val value: String)

class Notification(val text: String)

class Shipping(var price: Number)

class Product(
    val id: String,
    val owner: User,
    var title: String,
    var description: String,
    var images: MutableList<String>,
    var stock: Int,
    var shipping: Shipping,
    var characteristics: MutableList<Characteristic>,
    var category: Category,
    val questions: MutableList<Question>,
)

class SaleHistory(
    val product: Product,
    val amount: Int,
    val payment: Payment,
    val date: LocalDateTime,
    val user: User,
)

class BuyHistory(
    val items: MutableList<Unit>,
    val payment: Payment,
    val date: LocalDateTime,
)

class Question (val id: String, val product: Product, val user: User, val text: String, var response: String?)

class User(
    val id: String,
    var name: String,
    val email: String,
    var password: String,
    val image: String,
    val buyHistory: MutableList<BuyHistory>,
    val products: MutableList<Product>,
    val likedProducts: MutableList<Product>,
    val salesHistory: MutableList<SaleHistory>
)

class Unit (val product: Product, var amount: Int)

class Cart(
    val user: User,
    val items: MutableList<Unit>
)

class Payment (
    val cardNumber: String,
    val expirationDate: LocalDateTime,
    val cvv: String,
    val name: String,
)