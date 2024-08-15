package model

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
