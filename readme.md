# UNQ » UIs » Dominio » MercadoLibre
[![](https://jitpack.io/v/unq-ui/mercadolibre-model.svg)](https://jitpack.io/#unq-ui/mercadolibre-model)

Construcción de Interfaces de Usuario, Universidad Nacional de Quilmes.

### Dependencia

Agregar el repositorio:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Agregar la dependencia:

```xml
<dependency>
    <groupId>com.github.unq-ui</groupId>
    <artifactId>??</artifactId>
    <version>??</version>
</dependency>
```

### Interfaz de uso

```kotlin
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
    fun registerNewUser(draftNewUser: DraftNewUser): User

    /**
     * Retrieves a user by email and password.
     * @param email The user's email.
     * @param password The user's password.
     * @return The user.
     * @throws UserException if the user is not found.
     */
    fun getUser(email: String, password: String): User

    /**
     * Retrieves a user by id.
     * @param id The user's id.
     * @return The user.
     * @throws UserException if the user is not found.
     */
    fun getUser(id: String): User

    /**
     * Toggles the like status of a product for a user.
     * @param idUser The user's ID.
     * @param idProduct The product's ID.
     * @return The updated user.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun toggleLike(idUser: String, idProduct: String): User

    /**
     * Adds a new category.
     * @param name The category name.
     * @return The added category.
     * @throws CategoryException if the category already exists.
     */
    fun addCategory(name: String): Category

    /**
     * Retrieves all categories.
     * @return The list of categories.
     */
    fun getAllCategories(): List<Category>

    /**
     * Adds a new product.
     * @param userId The user's ID.
     * @param draftProduct The draft product data.
     * @return The added product.
     * @throws UserException if the user is not found.
     */
    fun addProduct(userId: String, draftProduct: DraftProduct): Product

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
    fun editProduct(userId: String, productId: String, draftProduct: DraftProduct): Product

    /**
     * Retrieves a product by ID.
     * @param id The product's ID.
     * @return The product.
     * @throws ProductException if the product is not found.
     */
    fun getProduct(id: String): Product

    /**
     * Retrieves products by user ID with pagination.
     * @param idUser The user's ID.
     * @param pageNumber The page number.
     * @return A Page of products.
     */
    fun getProductsByUser(idUser: String, pageNumber: Int): Page<Product>

    /**
     * Retrieves products by category ID with pagination.
     * @param idCategory The category's ID.
     * @param pageNumber The page number.
     * @return A page of products.
     */
    fun getProductsByCategory(idCategory: String, pageNumber: Int): Page<Product>

    /**
     * Searches for products by text with pagination.
     * @param text The search text.
     * @param pageNumber The page number.
     * @return A page of products.
     */
    fun searchProducts(text: String, pageNumber: Int): Page<Product>

    /**
     * Updates the quantity of a product in the user's cart.
     * @param userId The user's ID.
     * @param productId The product's ID.
     * @param amount The quantity to update.
     * @return The updated cart.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun updateItemCart(userId: String, productId: String, amount: Int): Cart

    /**
     * Deletes a product from the user's cart.
     * @param userId The user's ID.
     * @param productId The product's ID.
     * @return The updated cart.
     * @throws UserException if the user is not found.
     * @throws ProductException if the product is not found.
     */
    fun deleteItemFromCart(userId: String, productId: String): Cart

    /**
     * Retrieves the cart for a user.
     * @param id The user's ID.
     * @return The cart.
     * @throws UserException if the user is not found.
     */
    fun getCart(id: String): Cart

    /**
     * Completes a purchase for a user.
     * @param idUser The user's ID.
     * @param payment The payment information.
     * @throws BuyException if the cart is empty or items are out of stock.
     * @throws UserException if the user is not found.
     */
    fun purchase(idUser: String, payment: Payment)

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
    fun addQuestion(idUser: String, idProduct: String, question: String): Product

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
    fun addAnswer(idUser: String, idProduct: String, idQuestion: String, text: String): Product
}
```

### Iniciar el sistema con datos

```kotlin
val system = initSystem()
```

[Ver usuarios del sistema](https://github.com/unq-ui/mercadolibre-model/blob/main/resources/users.json)

### Modelo

```kotlin
class Product(
    val id: String,
    val owner: User,
    var title: String,
    var description: String,
    var images: MutableList<String>,
    var stock: Int,
    var price: Double,
    var shipping: Shipping,
    var characteristics: MutableList<Characteristic>,
    var category: Category,
    val questions: MutableList<Question>,
)

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

class Category(val id: String, val name: String)

class Characteristic(val name: String, val value: String)

class Shipping(var price: Double)

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
```

* El MercadoLibreService es el encargado de setear los ids de cada elemento que se agrega el sistema.
* Para simplificar se utilizan objetos draft

```kotlin
class DraftNewUser(
    val name: String,
    val email: String,
    val password: String,
    val image: String,
)

class DraftProduct(
    val title: String,
    val description: String,
    var price: Double,
    val images: MutableList<String>,
    val stock: Int,
    val shipping: Shipping,
    val characteristics: MutableList<Characteristic>,
    val category: Category,
)
```
