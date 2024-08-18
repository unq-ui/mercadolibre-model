package data

class ProductJSON(
    val title: String,
    val description: String,
    val price: Double,
    val category: String,
    val stock: Int,
    val images: List<String>,
    val dimensions: Map<String, Double>,
)

val allProductJson = listOf(
    ProductJSON(
        title = "Essence Mascara Lash Princess",
        description = "The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects. Achieve dramatic lashes with this long-lasting and cruelty-free formula.",
        price = 9.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/beauty/Essence%20Mascara%20Lash%20Princess/1.png"
        ),
        category = "beauty",
        dimensions = mapOf(
            "width" to 23.17,
            "height" to 14.43,
            "depth" to 28.01
        ),
        stock = 5
    ), ProductJSON(
        title = "Eyeshadow Palette with Mirror",
        description = "The Eyeshadow Palette with Mirror offers a versatile range of eyeshadow shades for creating stunning eye looks. With a built-in mirror, it's convenient for on-the-go makeup application.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/beauty/Eyeshadow%20Palette%20with%20Mirror/1.png"
        ),
        category = "beauty",
        dimensions = mapOf(
            "width" to 12.42,
            "height" to 8.63,
            "depth" to 29.13
        ),
        stock = 44
    ), ProductJSON(
        title = "Powder Canister",
        description = "The Powder Canister is a finely milled setting powder designed to set makeup and control shine. With a lightweight and translucent formula, it provides a smooth and matte finish.",
        price = 14.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/beauty/Powder%20Canister/1.png"
        ),
        category = "beauty",
        dimensions = mapOf(
            "width" to 24.16,
            "height" to 10.7,
            "depth" to 11.07
        ),
        stock = 59
    ), ProductJSON(
        title = "Red Lipstick",
        description = "The Red Lipstick is a classic and bold choice for adding a pop of color to your lips. With a creamy and pigmented formula, it provides a vibrant and long-lasting finish.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/beauty/Red%20Lipstick/1.png"
        ),
        category = "beauty",
        dimensions = mapOf(
            "width" to 14.37,
            "height" to 13.94,
            "depth" to 14.6
        ),
        stock = 68
    ), ProductJSON(
        title = "Red Nail Polish",
        description = "The Red Nail Polish offers a rich and glossy red hue for vibrant and polished nails. With a quick-drying formula, it provides a salon-quality finish at home.",
        price = 8.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/beauty/Red%20Nail%20Polish/1.png"
        ),
        category = "beauty",
        dimensions = mapOf(
            "width" to 8.11,
            "height" to 10.89,
            "depth" to 29.06
        ),
        stock = 71
    ), ProductJSON(
        title = "Calvin Klein CK One",
        description = "CK One by Calvin Klein is a classic unisex fragrance, known for its fresh and clean scent. It's a versatile fragrance suitable for everyday wear.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/fragrances/Calvin%20Klein%20CK%20One/1.png", "https://cdn.dummyjson.com/products/images/fragrances/Calvin%20Klein%20CK%20One/2.png", "https://cdn.dummyjson.com/products/images/fragrances/Calvin%20Klein%20CK%20One/3.png"
        ),
        category = "fragrances",
        dimensions = mapOf(
            "width" to 11.53,
            "height" to 14.44,
            "depth" to 6.81
        ),
        stock = 17
    ), ProductJSON(
        title = "Chanel Coco Noir Eau De",
        description = "Coco Noir by Chanel is an elegant and mysterious fragrance, featuring notes of grapefruit, rose, and sandalwood. Perfect for evening occasions.",
        price = 129.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/fragrances/Chanel%20Coco%20Noir%20Eau%20De/1.png", "https://cdn.dummyjson.com/products/images/fragrances/Chanel%20Coco%20Noir%20Eau%20De/2.png", "https://cdn.dummyjson.com/products/images/fragrances/Chanel%20Coco%20Noir%20Eau%20De/3.png"
        ),
        category = "fragrances",
        dimensions = mapOf(
            "width" to 21.27,
            "height" to 28.0,
            "depth" to 11.89
        ),
        stock = 41
    ), ProductJSON(
        title = "Dior J'adore",
        description = "J'adore by Dior is a luxurious and floral fragrance, known for its blend of ylang-ylang, rose, and jasmine. It embodies femininity and sophistication.",
        price = 89.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/fragrances/Dior%20J'adore/1.png", "https://cdn.dummyjson.com/products/images/fragrances/Dior%20J'adore/2.png", "https://cdn.dummyjson.com/products/images/fragrances/Dior%20J'adore/3.png"
        ),
        category = "fragrances",
        dimensions = mapOf(
            "width" to 21.51,
            "height" to 7.0,
            "depth" to 26.51
        ),
        stock = 91
    ), ProductJSON(
        title = "Dolce Shine Eau de",
        description = "Dolce Shine by Dolce & Gabbana is a vibrant and fruity fragrance, featuring notes of mango, jasmine, and blonde woods. It's a joyful and youthful scent.",
        price = 69.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/fragrances/Dolce%20Shine%20Eau%20de/1.png", "https://cdn.dummyjson.com/products/images/fragrances/Dolce%20Shine%20Eau%20de/2.png", "https://cdn.dummyjson.com/products/images/fragrances/Dolce%20Shine%20Eau%20de/3.png"
        ),
        category = "fragrances",
        dimensions = mapOf(
            "width" to 17.0,
            "height" to 24.57,
            "depth" to 13.3
        ),
        stock = 3
    ), ProductJSON(
        title = "Gucci Bloom Eau de",
        description = "Gucci Bloom by Gucci is a floral and captivating fragrance, with notes of tuberose, jasmine, and Rangoon creeper. It's a modern and romantic scent.",
        price = 79.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/fragrances/Gucci%20Bloom%20Eau%20de/1.png", "https://cdn.dummyjson.com/products/images/fragrances/Gucci%20Bloom%20Eau%20de/2.png", "https://cdn.dummyjson.com/products/images/fragrances/Gucci%20Bloom%20Eau%20de/3.png"
        ),
        category = "fragrances",
        dimensions = mapOf(
            "width" to 22.28,
            "height" to 17.81,
            "depth" to 27.18
        ),
        stock = 93
    ), ProductJSON(
        title = "Annibale Colombo Bed",
        description = "The Annibale Colombo Bed is a luxurious and elegant bed frame, crafted with high-quality materials for a comfortable and stylish bedroom.",
        price = 1899.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/furniture/Annibale%20Colombo%20Bed/1.png", "https://cdn.dummyjson.com/products/images/furniture/Annibale%20Colombo%20Bed/2.png", "https://cdn.dummyjson.com/products/images/furniture/Annibale%20Colombo%20Bed/3.png"
        ),
        category = "furniture",
        dimensions = mapOf(
            "width" to 28.75,
            "height" to 26.88,
            "depth" to 24.47
        ),
        stock = 47
    ), ProductJSON(
        title = "Annibale Colombo Sofa",
        description = "The Annibale Colombo Sofa is a sophisticated and comfortable seating option, featuring exquisite design and premium upholstery for your living room.",
        price = 2499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/furniture/Annibale%20Colombo%20Sofa/1.png", "https://cdn.dummyjson.com/products/images/furniture/Annibale%20Colombo%20Sofa/2.png", "https://cdn.dummyjson.com/products/images/furniture/Annibale%20Colombo%20Sofa/3.png"
        ),
        category = "furniture",
        dimensions = mapOf(
            "width" to 20.97,
            "height" to 19.11,
            "depth" to 25.81
        ),
        stock = 16
    ), ProductJSON(
        title = "Bedside Table African Cherry",
        description = "The Bedside Table in African Cherry is a stylish and functional addition to your bedroom, providing convenient storage space and a touch of elegance.",
        price = 299.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/furniture/Bedside%20Table%20African%20Cherry/1.png", "https://cdn.dummyjson.com/products/images/furniture/Bedside%20Table%20African%20Cherry/2.png", "https://cdn.dummyjson.com/products/images/furniture/Bedside%20Table%20African%20Cherry/3.png"
        ),
        category = "furniture",
        dimensions = mapOf(
            "width" to 25.43,
            "height" to 20.2,
            "depth" to 24.95
        ),
        stock = 16
    ), ProductJSON(
        title = "Knoll Saarinen Executive Conference Chair",
        description = "The Knoll Saarinen Executive Conference Chair is a modern and ergonomic chair, perfect for your office or conference room with its timeless design.",
        price = 499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/furniture/Knoll%20Saarinen%20Executive%20Conference%20Chair/1.png", "https://cdn.dummyjson.com/products/images/furniture/Knoll%20Saarinen%20Executive%20Conference%20Chair/2.png", "https://cdn.dummyjson.com/products/images/furniture/Knoll%20Saarinen%20Executive%20Conference%20Chair/3.png"
        ),
        category = "furniture",
        dimensions = mapOf(
            "width" to 16.59,
            "height" to 21.46,
            "depth" to 29.07
        ),
        stock = 47
    ), ProductJSON(
        title = "Wooden Bathroom Sink With Mirror",
        description = "The Wooden Bathroom Sink with Mirror is a unique and stylish addition to your bathroom, featuring a wooden sink countertop and a matching mirror.",
        price = 799.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/furniture/Wooden%20Bathroom%20Sink%20With%20Mirror/1.png", "https://cdn.dummyjson.com/products/images/furniture/Wooden%20Bathroom%20Sink%20With%20Mirror/2.png", "https://cdn.dummyjson.com/products/images/furniture/Wooden%20Bathroom%20Sink%20With%20Mirror/3.png"
        ),
        category = "furniture",
        dimensions = mapOf(
            "width" to 7.32,
            "height" to 22.64,
            "depth" to 12.37
        ),
        stock = 95
    ), ProductJSON(
        title = "Apple",
        description = "Fresh and crisp apples, perfect for snacking or incorporating into various recipes.",
        price = 1.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Apple/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 8.29,
            "height" to 5.58,
            "depth" to 12.41
        ),
        stock = 9
    ), ProductJSON(
        title = "Beef Steak",
        description = "High-quality beef steak, great for grilling or cooking to your preferred level of doneness.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Beef%20Steak/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 23.35,
            "height" to 13.48,
            "depth" to 26.4
        ),
        stock = 96
    ), ProductJSON(
        title = "Cat Food",
        description = "Nutritious cat food formulated to meet the dietary needs of your feline friend.",
        price = 8.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Cat%20Food/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 15.4,
            "height" to 13.97,
            "depth" to 25.13
        ),
        stock = 13
    ), ProductJSON(
        title = "Chicken Meat",
        description = "Fresh and tender chicken meat, suitable for various culinary preparations.",
        price = 9.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Chicken%20Meat/1.png", "https://cdn.dummyjson.com/products/images/groceries/Chicken%20Meat/2.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 15.96,
            "height" to 29.24,
            "depth" to 26.25
        ),
        stock = 69
    ), ProductJSON(
        title = "Cooking Oil",
        description = "Versatile cooking oil suitable for frying, sautéing, and various culinary applications.",
        price = 4.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Cooking%20Oil/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 8.18,
            "height" to 27.45,
            "depth" to 27.88
        ),
        stock = 22
    ), ProductJSON(
        title = "Cucumber",
        description = "Crisp and hydrating cucumbers, ideal for salads, snacks, or as a refreshing side.",
        price = 1.49,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Cucumber/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 11.04,
            "height" to 20.5,
            "depth" to 8.18
        ),
        stock = 22
    ), ProductJSON(
        title = "Dog Food",
        description = "Specially formulated dog food designed to provide essential nutrients for your canine companion.",
        price = 10.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Dog%20Food/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 29.39,
            "height" to 29.77,
            "depth" to 20.54
        ),
        stock = 40
    ), ProductJSON(
        title = "Eggs",
        description = "Fresh eggs, a versatile ingredient for baking, cooking, or breakfast.",
        price = 2.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Eggs/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 12.3,
            "height" to 10.99,
            "depth" to 15.53
        ),
        stock = 10
    ), ProductJSON(
        title = "Fish Steak",
        description = "Quality fish steak, suitable for grilling, baking, or pan-searing.",
        price = 14.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Fish%20Steak/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 20.14,
            "height" to 8.4,
            "depth" to 10.01
        ),
        stock = 99
    ), ProductJSON(
        title = "Green Bell Pepper",
        description = "Fresh and vibrant green bell pepper, perfect for adding color and flavor to your dishes.",
        price = 1.29,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Green%20Bell%20Pepper/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 7.32,
            "height" to 14.31,
            "depth" to 21.38
        ),
        stock = 89
    ), ProductJSON(
        title = "Green Chili Pepper",
        description = "Spicy green chili pepper, ideal for adding heat to your favorite recipes.",
        price = 0.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Green%20Chili%20Pepper/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 18.67,
            "height" to 21.17,
            "depth" to 25.26
        ),
        stock = 8
    ), ProductJSON(
        title = "Honey Jar",
        description = "Pure and natural honey in a convenient jar, perfect for sweetening beverages or drizzling over food.",
        price = 6.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Honey%20Jar/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 26.53,
            "height" to 27.11,
            "depth" to 6.63
        ),
        stock = 25
    ), ProductJSON(
        title = "Ice Cream",
        description = "Creamy and delicious ice cream, available in various flavors for a delightful treat.",
        price = 5.49,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Ice%20Cream/1.png", "https://cdn.dummyjson.com/products/images/groceries/Ice%20Cream/2.png", "https://cdn.dummyjson.com/products/images/groceries/Ice%20Cream/3.png", "https://cdn.dummyjson.com/products/images/groceries/Ice%20Cream/4.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 17.66,
            "height" to 24.49,
            "depth" to 25.98
        ),
        stock = 76
    ), ProductJSON(
        title = "Juice",
        description = "Refreshing fruit juice, packed with vitamins and great for staying hydrated.",
        price = 3.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Juice/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 8.97,
            "height" to 12.26,
            "depth" to 15.05
        ),
        stock = 99
    ), ProductJSON(
        title = "Kiwi",
        description = "Nutrient-rich kiwi, perfect for snacking or adding a tropical twist to your dishes.",
        price = 2.49,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Kiwi/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 27.3,
            "height" to 7.48,
            "depth" to 15.08
        ),
        stock = 1
    ), ProductJSON(
        title = "Lemon",
        description = "Zesty and tangy lemons, versatile for cooking, baking, or making refreshing beverages.",
        price = 0.79,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Lemon/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 25.97,
            "height" to 27.47,
            "depth" to 6.31
        ),
        stock = 0
    ), ProductJSON(
        title = "Milk",
        description = "Fresh and nutritious milk, a staple for various recipes and daily consumption.",
        price = 3.49,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Milk/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 22.42,
            "height" to 20.9,
            "depth" to 12.48
        ),
        stock = 57
    ), ProductJSON(
        title = "Mulberry",
        description = "Sweet and juicy mulberries, perfect for snacking or adding to desserts and cereals.",
        price = 4.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Mulberry/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 11.12,
            "height" to 27.3,
            "depth" to 27.57
        ),
        stock = 79
    ), ProductJSON(
        title = "Nescafe Coffee",
        description = "Quality coffee from Nescafe, available in various blends for a rich and satisfying cup.",
        price = 7.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Nescafe%20Coffee/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 11.21,
            "height" to 24.54,
            "depth" to 15.05
        ),
        stock = 22
    ), ProductJSON(
        title = "Potatoes",
        description = "Versatile and starchy potatoes, great for roasting, mashing, or as a side dish.",
        price = 2.29,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Potatoes/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 20.0,
            "height" to 6.44,
            "depth" to 20.07
        ),
        stock = 8
    ), ProductJSON(
        title = "Protein Powder",
        description = "Nutrient-packed protein powder, ideal for supplementing your diet with essential proteins.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Protein%20Powder/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 5.62,
            "height" to 7.88,
            "depth" to 23.48
        ),
        stock = 65
    ), ProductJSON(
        title = "Red Onions",
        description = "Flavorful and aromatic red onions, perfect for adding depth to your savory dishes.",
        price = 1.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Red%20Onions/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 14.05,
            "height" to 17.13,
            "depth" to 14.05
        ),
        stock = 86
    ), ProductJSON(
        title = "Rice",
        description = "High-quality rice, a staple for various cuisines and a versatile base for many dishes.",
        price = 5.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Rice/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 28.86,
            "height" to 6.26,
            "depth" to 11.04
        ),
        stock = 49
    ), ProductJSON(
        title = "Soft Drinks",
        description = "Assorted soft drinks in various flavors, perfect for refreshing beverages.",
        price = 1.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Soft%20Drinks/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 15.73,
            "height" to 24.93,
            "depth" to 27.19
        ),
        stock = 78
    ), ProductJSON(
        title = "Strawberry",
        description = "Sweet and succulent strawberries, great for snacking, desserts, or blending into smoothies.",
        price = 3.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Strawberry/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 20.82,
            "height" to 15.81,
            "depth" to 14.89
        ),
        stock = 9
    ), ProductJSON(
        title = "Tissue Paper Box",
        description = "Convenient tissue paper box for everyday use, providing soft and absorbent tissues.",
        price = 2.49,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Tissue%20Paper%20Box/1.png", "https://cdn.dummyjson.com/products/images/groceries/Tissue%20Paper%20Box/2.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 24.1,
            "height" to 19.74,
            "depth" to 5.48
        ),
        stock = 97
    ), ProductJSON(
        title = "Water",
        description = "Pure and refreshing bottled water, essential for staying hydrated throughout the day.",
        price = 0.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/groceries/Water/1.png"
        ),
        category = "groceries",
        dimensions = mapOf(
            "width" to 25.46,
            "height" to 25.86,
            "depth" to 18.06
        ),
        stock = 95
    ), ProductJSON(
        title = "Decoration Swing",
        description = "The Decoration Swing is a charming addition to your home decor. Crafted with intricate details, it adds a touch of elegance and whimsy to any room.",
        price = 59.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/home-decoration/Decoration%20Swing/1.png", "https://cdn.dummyjson.com/products/images/home-decoration/Decoration%20Swing/2.png", "https://cdn.dummyjson.com/products/images/home-decoration/Decoration%20Swing/3.png"
        ),
        category = "home-decoration",
        dimensions = mapOf(
            "width" to 20.75,
            "height" to 11.18,
            "depth" to 7.92
        ),
        stock = 62
    ), ProductJSON(
        title = "Family Tree Photo Frame",
        description = "The Family Tree Photo Frame is a sentimental and stylish way to display your cherished family memories. With multiple photo slots, it tells the story of your loved ones.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/home-decoration/Family%20Tree%20Photo%20Frame/1.png"
        ),
        category = "home-decoration",
        dimensions = mapOf(
            "width" to 15.46,
            "height" to 26.32,
            "depth" to 17.1
        ),
        stock = 34
    ), ProductJSON(
        title = "House Showpiece Plant",
        description = "The House Showpiece Plant is an artificial plant that brings a touch of nature to your home without the need for maintenance. It adds greenery and style to any space.",
        price = 39.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/home-decoration/House%20Showpiece%20Plant/1.png", "https://cdn.dummyjson.com/products/images/home-decoration/House%20Showpiece%20Plant/2.png", "https://cdn.dummyjson.com/products/images/home-decoration/House%20Showpiece%20Plant/3.png"
        ),
        category = "home-decoration",
        dimensions = mapOf(
            "width" to 27.15,
            "height" to 14.43,
            "depth" to 10.05
        ),
        stock = 89
    ), ProductJSON(
        title = "Plant Pot",
        description = "The Plant Pot is a stylish container for your favorite plants. With a sleek design, it complements your indoor or outdoor garden, adding a modern touch to your plant display.",
        price = 14.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/home-decoration/Plant%20Pot/1.png", "https://cdn.dummyjson.com/products/images/home-decoration/Plant%20Pot/2.png", "https://cdn.dummyjson.com/products/images/home-decoration/Plant%20Pot/3.png", "https://cdn.dummyjson.com/products/images/home-decoration/Plant%20Pot/4.png"
        ),
        category = "home-decoration",
        dimensions = mapOf(
            "width" to 16.28,
            "height" to 8.72,
            "depth" to 18.47
        ),
        stock = 70
    ), ProductJSON(
        title = "Table Lamp",
        description = "The Table Lamp is a functional and decorative lighting solution for your living space. With a modern design, it provides both ambient and task lighting, enhancing the atmosphere.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/home-decoration/Table%20Lamp/1.png"
        ),
        category = "home-decoration",
        dimensions = mapOf(
            "width" to 29.6,
            "height" to 19.68,
            "depth" to 10.12
        ),
        stock = 84
    ), ProductJSON(
        title = "Bamboo Spatula",
        description = "The Bamboo Spatula is a versatile kitchen tool made from eco-friendly bamboo. Ideal for flipping, stirring, and serving various dishes.",
        price = 7.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Bamboo%20Spatula/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 27.97,
            "height" to 21.77,
            "depth" to 21.38
        ),
        stock = 0
    ), ProductJSON(
        title = "Black Aluminium Cup",
        description = "The Black Aluminium Cup is a stylish and durable cup suitable for both hot and cold beverages. Its sleek black design adds a modern touch to your drinkware collection.",
        price = 5.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Black%20Aluminium%20Cup/1.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Black%20Aluminium%20Cup/2.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 7.48,
            "height" to 23.98,
            "depth" to 12.84
        ),
        stock = 42
    ), ProductJSON(
        title = "Black Whisk",
        description = "The Black Whisk is a kitchen essential for whisking and beating ingredients. Its ergonomic handle and sleek design make it a practical and stylish tool.",
        price = 9.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Black%20Whisk/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 21.06,
            "height" to 15.46,
            "depth" to 13.28
        ),
        stock = 17
    ), ProductJSON(
        title = "Boxed Blender",
        description = "The Boxed Blender is a powerful and compact blender perfect for smoothies, shakes, and more. Its convenient design and multiple functions make it a versatile kitchen appliance.",
        price = 39.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Boxed%20Blender/1.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Boxed%20Blender/2.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Boxed%20Blender/3.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Boxed%20Blender/4.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 16.73,
            "height" to 10.93,
            "depth" to 14.75
        ),
        stock = 81
    ), ProductJSON(
        title = "Carbon Steel Wok",
        description = "The Carbon Steel Wok is a versatile cooking pan suitable for stir-frying, sautéing, and deep frying. Its sturdy construction ensures even heat distribution for delicious meals.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Carbon%20Steel%20Wok/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 14.69,
            "height" to 11.23,
            "depth" to 28.05
        ),
        stock = 2
    ), ProductJSON(
        title = "Chopping Board",
        description = "The Chopping Board is an essential kitchen accessory for food preparation. Made from durable material, it provides a safe and hygienic surface for cutting and chopping.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Chopping%20Board/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 24.38,
            "height" to 26.51,
            "depth" to 6.93
        ),
        stock = 53
    ), ProductJSON(
        title = "Citrus Squeezer Yellow",
        description = "The Citrus Squeezer in Yellow is a handy tool for extracting juice from citrus fruits. Its vibrant color adds a cheerful touch to your kitchen gadgets.",
        price = 8.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Citrus%20Squeezer%20Yellow/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 21.74,
            "height" to 7.6,
            "depth" to 18.04
        ),
        stock = 59
    ), ProductJSON(
        title = "Egg Slicer",
        description = "The Egg Slicer is a convenient tool for slicing boiled eggs evenly. It's perfect for salads, sandwiches, and other dishes where sliced eggs are desired.",
        price = 6.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Egg%20Slicer/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 17.18,
            "height" to 11.58,
            "depth" to 11.79
        ),
        stock = 30
    ), ProductJSON(
        title = "Electric Stove",
        description = "The Electric Stove provides a portable and efficient cooking solution. Ideal for small kitchens or as an additional cooking surface for various culinary needs.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Electric%20Stove/1.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Electric%20Stove/2.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Electric%20Stove/3.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Electric%20Stove/4.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 28.07,
            "height" to 11.43,
            "depth" to 20.68
        ),
        stock = 41
    ), ProductJSON(
        title = "Fine Mesh Strainer",
        description = "The Fine Mesh Strainer is a versatile tool for straining liquids and sifting dry ingredients. Its fine mesh ensures efficient filtering for smooth cooking and baking.",
        price = 9.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Fine%20Mesh%20Strainer/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 5.19,
            "height" to 9.64,
            "depth" to 20.53
        ),
        stock = 13
    ), ProductJSON(
        title = "Fork",
        description = "The Fork is a classic utensil for various dining and serving purposes. Its durable and ergonomic design makes it a reliable choice for everyday use.",
        price = 3.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Fork/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 23.61,
            "height" to 25.62,
            "depth" to 5.67
        ),
        stock = 10
    ), ProductJSON(
        title = "Glass",
        description = "The Glass is a versatile and elegant drinking vessel suitable for a variety of beverages. Its clear design allows you to enjoy the colors and textures of your drinks.",
        price = 4.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Glass/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 14.7,
            "height" to 18.98,
            "depth" to 21.93
        ),
        stock = 68
    ), ProductJSON(
        title = "Grater Black",
        description = "The Grater in Black is a handy kitchen tool for grating cheese, vegetables, and more. Its sleek design and sharp blades make food preparation efficient and easy.",
        price = 10.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Grater%20Black/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 12.6,
            "height" to 28.86,
            "depth" to 21.12
        ),
        stock = 80
    ), ProductJSON(
        title = "Hand Blender",
        description = "The Hand Blender is a versatile kitchen appliance for blending, pureeing, and mixing. Its compact design and powerful motor make it a convenient tool for various recipes.",
        price = 34.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Hand%20Blender/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 13.3,
            "height" to 6.21,
            "depth" to 16.77
        ),
        stock = 8
    ), ProductJSON(
        title = "Ice Cube Tray",
        description = "The Ice Cube Tray is a practical accessory for making ice cubes in various shapes. Perfect for keeping your drinks cool and adding a fun element to your beverages.",
        price = 5.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Ice%20Cube%20Tray/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 27.19,
            "height" to 20.42,
            "depth" to 17.45
        ),
        stock = 81
    ), ProductJSON(
        title = "Kitchen Sieve",
        description = "The Kitchen Sieve is a versatile tool for sifting and straining dry and wet ingredients. Its fine mesh design ensures smooth results in your cooking and baking.",
        price = 7.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Kitchen%20Sieve/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 22.94,
            "height" to 11.91,
            "depth" to 20.47
        ),
        stock = 33
    ), ProductJSON(
        title = "Knife",
        description = "The Knife is an essential kitchen tool for chopping, slicing, and dicing. Its sharp blade and ergonomic handle make it a reliable choice for food preparation.",
        price = 14.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Knife/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 11.63,
            "height" to 23.99,
            "depth" to 24.62
        ),
        stock = 59
    ), ProductJSON(
        title = "Lunch Box",
        description = "The Lunch Box is a convenient and portable container for packing and carrying your meals. With compartments for different foods, it's perfect for on-the-go dining.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Lunch%20Box/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 13.76,
            "height" to 18.36,
            "depth" to 27.9
        ),
        stock = 26
    ), ProductJSON(
        title = "Microwave Oven",
        description = "The Microwave Oven is a versatile kitchen appliance for quick and efficient cooking, reheating, and defrosting. Its compact size makes it suitable for various kitchen setups.",
        price = 89.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Microwave%20Oven/1.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Microwave%20Oven/2.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Microwave%20Oven/3.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Microwave%20Oven/4.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 9.61,
            "height" to 25.64,
            "depth" to 12.31
        ),
        stock = 27
    ), ProductJSON(
        title = "Mug Tree Stand",
        description = "The Mug Tree Stand is a stylish and space-saving solution for organizing your mugs. Keep your favorite mugs easily accessible and neatly displayed in your kitchen.",
        price = 15.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Mug%20Tree%20Stand/1.png", "https://cdn.dummyjson.com/products/images/kitchen-accessories/Mug%20Tree%20Stand/2.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 7.37,
            "height" to 13.1,
            "depth" to 12.0
        ),
        stock = 93
    ), ProductJSON(
        title = "Pan",
        description = "The Pan is a versatile and essential cookware item for frying, sautéing, and cooking various dishes. Its non-stick coating ensures easy food release and cleanup.",
        price = 24.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Pan/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 19.51,
            "height" to 17.96,
            "depth" to 23.24
        ),
        stock = 40
    ), ProductJSON(
        title = "Plate",
        description = "The Plate is a classic and essential dishware item for serving meals. Its durable and stylish design makes it suitable for everyday use or special occasions.",
        price = 3.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Plate/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 14.77,
            "height" to 21.78,
            "depth" to 29.1
        ),
        stock = 30
    ), ProductJSON(
        title = "Red Tongs",
        description = "The Red Tongs are versatile kitchen tongs suitable for various cooking and serving tasks. Their vibrant color adds a pop of excitement to your kitchen utensils.",
        price = 6.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Red%20Tongs/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 27.38,
            "height" to 20.49,
            "depth" to 26.65
        ),
        stock = 15
    ), ProductJSON(
        title = "Silver Pot With Glass Cap",
        description = "The Silver Pot with Glass Cap is a stylish and functional cookware item for boiling, simmering, and preparing delicious meals. Its glass cap allows you to monitor cooking progress.",
        price = 39.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Silver%20Pot%20With%20Glass%20Cap/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 9.58,
            "height" to 25.84,
            "depth" to 26.13
        ),
        stock = 37
    ), ProductJSON(
        title = "Slotted Turner",
        description = "The Slotted Turner is a kitchen utensil designed for flipping and turning food items. Its slotted design allows excess liquid to drain, making it ideal for frying and sautéing.",
        price = 8.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Slotted%20Turner/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 22.29,
            "height" to 24.06,
            "depth" to 7.05
        ),
        stock = 36
    ), ProductJSON(
        title = "Spice Rack",
        description = "The Spice Rack is a convenient organizer for your spices and seasonings. Keep your kitchen essentials within reach and neatly arranged with this stylish spice rack.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Spice%20Rack/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 20.73,
            "height" to 6.81,
            "depth" to 24.14
        ),
        stock = 24
    ), ProductJSON(
        title = "Spoon",
        description = "The Spoon is a versatile kitchen utensil for stirring, serving, and tasting. Its ergonomic design and durable construction make it an essential tool for every kitchen.",
        price = 4.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Spoon/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 8.45,
            "height" to 25.16,
            "depth" to 17.43
        ),
        stock = 51
    ), ProductJSON(
        title = "Tray",
        description = "The Tray is a functional and decorative item for serving snacks, appetizers, or drinks. Its stylish design makes it a versatile accessory for entertaining guests.",
        price = 16.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Tray/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 25.01,
            "height" to 5.72,
            "depth" to 5.25
        ),
        stock = 48
    ), ProductJSON(
        title = "Wooden Rolling Pin",
        description = "The Wooden Rolling Pin is a classic kitchen tool for rolling out dough for baking. Its smooth surface and sturdy handles make it easy to achieve uniform thickness.",
        price = 11.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Wooden%20Rolling%20Pin/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 19.66,
            "height" to 19.62,
            "depth" to 25.23
        ),
        stock = 80
    ), ProductJSON(
        title = "Yellow Peeler",
        description = "The Yellow Peeler is a handy tool for peeling fruits and vegetables with ease. Its bright yellow color adds a cheerful touch to your kitchen gadgets.",
        price = 5.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/kitchen-accessories/Yellow%20Peeler/1.png"
        ),
        category = "kitchen-accessories",
        dimensions = mapOf(
            "width" to 17.36,
            "height" to 17.41,
            "depth" to 27.38
        ),
        stock = 86
    ), ProductJSON(
        title = "Apple MacBook Pro 14 Inch Space Grey",
        description = "The MacBook Pro 14 Inch in Space Grey is a powerful and sleek laptop, featuring Apple's M1 Pro chip for exceptional performance and a stunning Retina display.",
        price = 1999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/laptops/Apple%20MacBook%20Pro%2014%20Inch%20Space%20Grey/1.png", "https://cdn.dummyjson.com/products/images/laptops/Apple%20MacBook%20Pro%2014%20Inch%20Space%20Grey/2.png", "https://cdn.dummyjson.com/products/images/laptops/Apple%20MacBook%20Pro%2014%20Inch%20Space%20Grey/3.png"
        ),
        category = "laptops",
        dimensions = mapOf(
            "width" to 12.38,
            "height" to 21.55,
            "depth" to 27.95
        ),
        stock = 39
    ), ProductJSON(
        title = "Asus Zenbook Pro Dual Screen Laptop",
        description = "The Asus Zenbook Pro Dual Screen Laptop is a high-performance device with dual screens, providing productivity and versatility for creative professionals.",
        price = 1799.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/laptops/Asus%20Zenbook%20Pro%20Dual%20Screen%20Laptop/1.png", "https://cdn.dummyjson.com/products/images/laptops/Asus%20Zenbook%20Pro%20Dual%20Screen%20Laptop/2.png", "https://cdn.dummyjson.com/products/images/laptops/Asus%20Zenbook%20Pro%20Dual%20Screen%20Laptop/3.png"
        ),
        category = "laptops",
        dimensions = mapOf(
            "width" to 19.67,
            "height" to 11.05,
            "depth" to 14.32
        ),
        stock = 38
    ), ProductJSON(
        title = "Huawei Matebook X Pro",
        description = "The Huawei Matebook X Pro is a slim and stylish laptop with a high-resolution touchscreen display, offering a premium experience for users on the go.",
        price = 1399.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/laptops/Huawei%20Matebook%20X%20Pro/1.png", "https://cdn.dummyjson.com/products/images/laptops/Huawei%20Matebook%20X%20Pro/2.png", "https://cdn.dummyjson.com/products/images/laptops/Huawei%20Matebook%20X%20Pro/3.png"
        ),
        category = "laptops",
        dimensions = mapOf(
            "width" to 22.11,
            "height" to 11.11,
            "depth" to 23.07
        ),
        stock = 34
    ), ProductJSON(
        title = "Lenovo Yoga 920",
        description = "The Lenovo Yoga 920 is a 2-in-1 convertible laptop with a flexible hinge, allowing you to use it as a laptop or tablet, offering versatility and portability.",
        price = 1099.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/laptops/Lenovo%20Yoga%20920/1.png", "https://cdn.dummyjson.com/products/images/laptops/Lenovo%20Yoga%20920/2.png", "https://cdn.dummyjson.com/products/images/laptops/Lenovo%20Yoga%20920/3.png"
        ),
        category = "laptops",
        dimensions = mapOf(
            "width" to 11.02,
            "height" to 14.45,
            "depth" to 24.09
        ),
        stock = 71
    ), ProductJSON(
        title = "New DELL XPS 13 9300 Laptop",
        description = "The New DELL XPS 13 9300 Laptop is a compact and powerful device, featuring a virtually borderless InfinityEdge display and high-end performance for various tasks.",
        price = 1499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/laptops/New%20DELL%20XPS%2013%209300%20Laptop/1.png", "https://cdn.dummyjson.com/products/images/laptops/New%20DELL%20XPS%2013%209300%20Laptop/2.png", "https://cdn.dummyjson.com/products/images/laptops/New%20DELL%20XPS%2013%209300%20Laptop/3.png"
        ),
        category = "laptops",
        dimensions = mapOf(
            "width" to 12.09,
            "height" to 6.43,
            "depth" to 15.69
        ),
        stock = 18
    ), ProductJSON(
        title = "Blue & Black Check Shirt",
        description = "The Blue & Black Check Shirt is a stylish and comfortable men's shirt featuring a classic check pattern. Made from high-quality fabric, it's suitable for both casual and semi-formal occasions.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shirts/Blue%20&%20Black%20Check%20Shirt/1.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Blue%20&%20Black%20Check%20Shirt/2.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Blue%20&%20Black%20Check%20Shirt/3.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Blue%20&%20Black%20Check%20Shirt/4.png"
        ),
        category = "shirts",
        dimensions = mapOf(
            "width" to 17.25,
            "height" to 27.31,
            "depth" to 20.88
        ),
        stock = 44
    ), ProductJSON(
        title = "Gigabyte Aorus Men Tshirt",
        description = "The Gigabyte Aorus Men Tshirt is a cool and casual shirt for gaming enthusiasts. With the Aorus logo and sleek design, it's perfect for expressing your gaming style.",
        price = 24.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shirts/Gigabyte%20Aorus%20Men%20Tshirt/1.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Gigabyte%20Aorus%20Men%20Tshirt/2.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Gigabyte%20Aorus%20Men%20Tshirt/3.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Gigabyte%20Aorus%20Men%20Tshirt/4.png"
        ),
        category = "shirts",
        dimensions = mapOf(
            "width" to 8.54,
            "height" to 23.52,
            "depth" to 5.66
        ),
        stock = 64
    ), ProductJSON(
        title = "Man Plaid Shirt",
        description = "The Man Plaid Shirt is a timeless and versatile men's shirt with a classic plaid pattern. Its comfortable fit and casual style make it a wardrobe essential for various occasions.",
        price = 34.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Plaid%20Shirt/1.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Plaid%20Shirt/2.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Plaid%20Shirt/3.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Plaid%20Shirt/4.png"
        ),
        category = "shirts",
        dimensions = mapOf(
            "width" to 29.56,
            "height" to 29.84,
            "depth" to 7.77
        ),
        stock = 65
    ), ProductJSON(
        title = "Man Short Sleeve Shirt",
        description = "The Man Short Sleeve Shirt is a breezy and stylish option for warm days. With a comfortable fit and short sleeves, it's perfect for a laid-back yet polished look.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Short%20Sleeve%20Shirt/1.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Short%20Sleeve%20Shirt/2.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Short%20Sleeve%20Shirt/3.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Man%20Short%20Sleeve%20Shirt/4.png"
        ),
        category = "shirts",
        dimensions = mapOf(
            "width" to 7.11,
            "height" to 28.63,
            "depth" to 27.54
        ),
        stock = 20
    ), ProductJSON(
        title = "Men Check Shirt",
        description = "The Men Check Shirt is a classic and versatile shirt featuring a stylish check pattern. Suitable for various occasions, it adds a smart and polished touch to your wardrobe.",
        price = 27.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shirts/Men%20Check%20Shirt/1.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Men%20Check%20Shirt/2.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Men%20Check%20Shirt/3.png", "https://cdn.dummyjson.com/products/images/mens-shirts/Men%20Check%20Shirt/4.png"
        ),
        category = "shirts",
        dimensions = mapOf(
            "width" to 18.43,
            "height" to 6.96,
            "depth" to 20.73
        ),
        stock = 69
    ), ProductJSON(
        title = "Nike Air Jordan 1 Red And Black",
        description = "The Nike Air Jordan 1 in Red and Black is an iconic basketball sneaker known for its stylish design and high-performance features, making it a favorite among sneaker enthusiasts and athletes.",
        price = 149.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Air%20Jordan%201%20Red%20And%20Black/1.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Air%20Jordan%201%20Red%20And%20Black/2.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Air%20Jordan%201%20Red%20And%20Black/3.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Air%20Jordan%201%20Red%20And%20Black/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 19.29,
            "height" to 13.2,
            "depth" to 29.13
        ),
        stock = 15
    ), ProductJSON(
        title = "Nike Baseball Cleats",
        description = "Nike Baseball Cleats are designed for maximum traction and performance on the baseball field. They provide stability and support for players during games and practices.",
        price = 79.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Baseball%20Cleats/1.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Baseball%20Cleats/2.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Baseball%20Cleats/3.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Nike%20Baseball%20Cleats/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 14.83,
            "height" to 19.16,
            "depth" to 28.98
        ),
        stock = 14
    ), ProductJSON(
        title = "Puma Future Rider Trainers",
        description = "The Puma Future Rider Trainers offer a blend of retro style and modern comfort. Perfect for casual wear, these trainers provide a fashionable and comfortable option for everyday use.",
        price = 89.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shoes/Puma%20Future%20Rider%20Trainers/1.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Puma%20Future%20Rider%20Trainers/2.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Puma%20Future%20Rider%20Trainers/3.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Puma%20Future%20Rider%20Trainers/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 14.58,
            "height" to 25.54,
            "depth" to 19.57
        ),
        stock = 10
    ), ProductJSON(
        title = "Sports Sneakers Off White & Red",
        description = "The Sports Sneakers in Off White and Red combine style and functionality, making them a fashionable choice for sports enthusiasts. The red and off-white color combination adds a bold and energetic touch.",
        price = 119.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20&%20Red/1.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20&%20Red/2.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20&%20Red/3.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20&%20Red/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 10.71,
            "height" to 19.23,
            "depth" to 19.85
        ),
        stock = 73
    ), ProductJSON(
        title = "Sports Sneakers Off White Red",
        description = "Another variant of the Sports Sneakers in Off White Red, featuring a unique design. These sneakers offer style and comfort for casual occasions.",
        price = 109.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20Red/1.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20Red/2.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20Red/3.png", "https://cdn.dummyjson.com/products/images/mens-shoes/Sports%20Sneakers%20Off%20White%20Red/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 18.32,
            "height" to 19.34,
            "depth" to 28.56
        ),
        stock = 75
    ), ProductJSON(
        title = "Brown Leather Belt Watch",
        description = "The Brown Leather Belt Watch is a stylish timepiece with a classic design. Featuring a genuine leather strap and a sleek dial, it adds a touch of sophistication to your look.",
        price = 89.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-watches/Brown%20Leather%20Belt%20Watch/1.png", "https://cdn.dummyjson.com/products/images/mens-watches/Brown%20Leather%20Belt%20Watch/2.png", "https://cdn.dummyjson.com/products/images/mens-watches/Brown%20Leather%20Belt%20Watch/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 18.39,
            "height" to 10.82,
            "depth" to 10.52
        ),
        stock = 69
    ), ProductJSON(
        title = "Longines Master Collection",
        description = "The Longines Master Collection is an elegant and refined watch known for its precision and craftsmanship. With a timeless design, it's a symbol of luxury and sophistication.",
        price = 1499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-watches/Longines%20Master%20Collection/1.png", "https://cdn.dummyjson.com/products/images/mens-watches/Longines%20Master%20Collection/2.png", "https://cdn.dummyjson.com/products/images/mens-watches/Longines%20Master%20Collection/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 5.83,
            "height" to 12.48,
            "depth" to 7.65
        ),
        stock = 65
    ), ProductJSON(
        title = "Rolex Cellini Date Black Dial",
        description = "The Rolex Cellini Date with Black Dial is a classic and prestigious watch. With a black dial and date complication, it exudes sophistication and is a symbol of Rolex's heritage.",
        price = 8999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Cellini%20Date%20Black%20Dial/1.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Cellini%20Date%20Black%20Dial/2.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Cellini%20Date%20Black%20Dial/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 12.17,
            "height" to 27.99,
            "depth" to 10.36
        ),
        stock = 84
    ), ProductJSON(
        title = "Rolex Cellini Moonphase",
        description = "The Rolex Cellini Moonphase is a masterpiece of horology, featuring a moon phase complication and exquisite design. It reflects Rolex's commitment to precision and elegance.",
        price = 12999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Cellini%20Moonphase/1.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Cellini%20Moonphase/2.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Cellini%20Moonphase/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 28.07,
            "height" to 13.43,
            "depth" to 10.81
        ),
        stock = 33
    ), ProductJSON(
        title = "Rolex Datejust",
        description = "The Rolex Datejust is an iconic and versatile timepiece with a date window. Known for its timeless design and reliability, it's a symbol of Rolex's watchmaking excellence.",
        price = 10999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Datejust/1.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Datejust/2.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Datejust/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 9.68,
            "height" to 7.29,
            "depth" to 5.67
        ),
        stock = 11
    ), ProductJSON(
        title = "Rolex Submariner Watch",
        description = "The Rolex Submariner is a legendary dive watch with a rich history. Known for its durability and water resistance, it's a symbol of adventure and exploration.",
        price = 13999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Submariner%20Watch/1.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Submariner%20Watch/2.png", "https://cdn.dummyjson.com/products/images/mens-watches/Rolex%20Submariner%20Watch/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 5.22,
            "height" to 27.59,
            "depth" to 16.93
        ),
        stock = 35
    ), ProductJSON(
        title = "Amazon Echo Plus",
        description = "The Amazon Echo Plus is a smart speaker with built-in Alexa voice control. It features premium sound quality and serves as a hub for controlling smart home devices.",
        price = 99.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Amazon%20Echo%20Plus/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Amazon%20Echo%20Plus/2.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 8.1,
            "height" to 7.74,
            "depth" to 5.68
        ),
        stock = 50
    ), ProductJSON(
        title = "Apple Airpods",
        description = "The Apple Airpods offer a seamless wireless audio experience. With easy pairing, high-quality sound, and Siri integration, they are perfect for on-the-go listening.",
        price = 129.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Airpods/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Airpods/2.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Airpods/3.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 22.62,
            "height" to 9.92,
            "depth" to 18.15
        ),
        stock = 93
    ), ProductJSON(
        title = "Apple AirPods Max Silver",
        description = "The Apple AirPods Max in Silver are premium over-ear headphones with high-fidelity audio, adaptive EQ, and active noise cancellation. Experience immersive sound in style.",
        price = 549.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20AirPods%20Max%20Silver/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 7.73,
            "height" to 18.36,
            "depth" to 17.87
        ),
        stock = 7
    ), ProductJSON(
        title = "Apple Airpower Wireless Charger",
        description = "The Apple AirPower Wireless Charger provides a convenient way to charge your compatible Apple devices wirelessly. Simply place your devices on the charging mat for effortless charging.",
        price = 79.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Airpower%20Wireless%20Charger/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 25.51,
            "height" to 20.44,
            "depth" to 26.48
        ),
        stock = 78
    ), ProductJSON(
        title = "Apple HomePod Mini Cosmic Grey",
        description = "The Apple HomePod Mini in Cosmic Grey is a compact smart speaker that delivers impressive audio and integrates seamlessly with the Apple ecosystem for a smart home experience.",
        price = 99.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20HomePod%20Mini%20Cosmic%20Grey/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 21.14,
            "height" to 12.62,
            "depth" to 20.13
        ),
        stock = 65
    ), ProductJSON(
        title = "Apple iPhone Charger",
        description = "The Apple iPhone Charger is a high-quality charger designed for fast and efficient charging of your iPhone. Ensure your device stays powered up and ready to go.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20iPhone%20Charger/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20iPhone%20Charger/2.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 28.77,
            "height" to 25.05,
            "depth" to 29.55
        ),
        stock = 4
    ), ProductJSON(
        title = "Apple MagSafe Battery Pack",
        description = "The Apple MagSafe Battery Pack is a portable and convenient way to add extra battery life to your MagSafe-compatible iPhone. Attach it magnetically for a secure connection.",
        price = 99.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20MagSafe%20Battery%20Pack/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20MagSafe%20Battery%20Pack/2.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 21.61,
            "height" to 7.98,
            "depth" to 9.32
        ),
        stock = 80
    ), ProductJSON(
        title = "Apple Watch Series 4 Gold",
        description = "The Apple Watch Series 4 in Gold is a stylish and advanced smartwatch with features like heart rate monitoring, fitness tracking, and a beautiful Retina display.",
        price = 349.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Watch%20Series%204%20Gold/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Watch%20Series%204%20Gold/2.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Apple%20Watch%20Series%204%20Gold/3.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 8.96,
            "height" to 28.26,
            "depth" to 26.46
        ),
        stock = 68
    ), ProductJSON(
        title = "Beats Flex Wireless Earphones",
        description = "The Beats Flex Wireless Earphones offer a comfortable and versatile audio experience. With magnetic earbuds and up to 12 hours of battery life, they are ideal for everyday use.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Beats%20Flex%20Wireless%20Earphones/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 23.49,
            "height" to 15.22,
            "depth" to 20.05
        ),
        stock = 49
    ), ProductJSON(
        title = "iPhone 12 Silicone Case with MagSafe Plum",
        description = "The iPhone 12 Silicone Case with MagSafe in Plum is a stylish and protective case designed for the iPhone 12. It features MagSafe technology for easy attachment of accessories.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/iPhone%2012%20Silicone%20Case%20with%20MagSafe%20Plum/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/iPhone%2012%20Silicone%20Case%20with%20MagSafe%20Plum/2.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/iPhone%2012%20Silicone%20Case%20with%20MagSafe%20Plum/3.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/iPhone%2012%20Silicone%20Case%20with%20MagSafe%20Plum/4.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 6.32,
            "height" to 23.37,
            "depth" to 21.62
        ),
        stock = 51
    ), ProductJSON(
        title = "Monopod",
        description = "The Monopod is a versatile camera accessory for stable and adjustable shooting. Perfect for capturing selfies, group photos, and videos with ease.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Monopod/1.png", "https://cdn.dummyjson.com/products/images/mobile-accessories/Monopod/2.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 8.42,
            "height" to 25.12,
            "depth" to 29.9
        ),
        stock = 96
    ), ProductJSON(
        title = "Selfie Lamp with iPhone",
        description = "The Selfie Lamp with iPhone is a portable and adjustable LED light designed to enhance your selfies and video calls. Attach it to your iPhone for well-lit photos.",
        price = 14.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Selfie%20Lamp%20with%20iPhone/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 13.38,
            "height" to 26.33,
            "depth" to 22.71
        ),
        stock = 89
    ), ProductJSON(
        title = "Selfie Stick Monopod",
        description = "The Selfie Stick Monopod is a extendable and foldable device for capturing the perfect selfie or group photo. Compatible with smartphones and cameras.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/Selfie%20Stick%20Monopod/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 6.11,
            "height" to 27.92,
            "depth" to 23.63
        ),
        stock = 33
    ), ProductJSON(
        title = "TV Studio Camera Pedestal",
        description = "The TV Studio Camera Pedestal is a professional-grade camera support system for smooth and precise camera movements in a studio setting. Ideal for broadcast and production.",
        price = 499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/mobile-accessories/TV%20Studio%20Camera%20Pedestal/1.png"
        ),
        category = "mobile-accessories",
        dimensions = mapOf(
            "width" to 29.9,
            "height" to 16.66,
            "depth" to 13.85
        ),
        stock = 45
    ), ProductJSON(
        title = "Generic Motorcycle",
        description = "The Generic Motorcycle is a versatile and reliable bike suitable for various riding preferences. With a balanced design, it provides a comfortable and efficient riding experience.",
        price = 3999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/motorcycle/Generic%20Motorcycle/1.png", "https://cdn.dummyjson.com/products/images/motorcycle/Generic%20Motorcycle/2.png", "https://cdn.dummyjson.com/products/images/motorcycle/Generic%20Motorcycle/3.png", "https://cdn.dummyjson.com/products/images/motorcycle/Generic%20Motorcycle/4.png"
        ),
        category = "motorcycle",
        dimensions = mapOf(
            "width" to 14.87,
            "height" to 16.41,
            "depth" to 12.98
        ),
        stock = 63
    ), ProductJSON(
        title = "Kawasaki Z800",
        description = "The Kawasaki Z800 is a powerful and agile sportbike known for its striking design and performance. It's equipped with advanced features, making it a favorite among motorcycle enthusiasts.",
        price = 8999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/motorcycle/Kawasaki%20Z800/1.png", "https://cdn.dummyjson.com/products/images/motorcycle/Kawasaki%20Z800/2.png", "https://cdn.dummyjson.com/products/images/motorcycle/Kawasaki%20Z800/3.png", "https://cdn.dummyjson.com/products/images/motorcycle/Kawasaki%20Z800/4.png"
        ),
        category = "motorcycle",
        dimensions = mapOf(
            "width" to 28.34,
            "height" to 11.9,
            "depth" to 8.19
        ),
        stock = 88
    ), ProductJSON(
        title = "MotoGP CI.H1",
        description = "The MotoGP CI.H1 is a high-performance motorcycle inspired by MotoGP racing technology. It offers cutting-edge features and precision engineering for an exhilarating riding experience.",
        price = 14999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/motorcycle/MotoGP%20CI.H1/1.png", "https://cdn.dummyjson.com/products/images/motorcycle/MotoGP%20CI.H1/2.png", "https://cdn.dummyjson.com/products/images/motorcycle/MotoGP%20CI.H1/3.png", "https://cdn.dummyjson.com/products/images/motorcycle/MotoGP%20CI.H1/4.png"
        ),
        category = "motorcycle",
        dimensions = mapOf(
            "width" to 27.4,
            "height" to 10.05,
            "depth" to 5.17
        ),
        stock = 85
    ), ProductJSON(
        title = "Scooter Motorcycle",
        description = "The Scooter Motorcycle is a practical and fuel-efficient bike ideal for urban commuting. It features a step-through design and user-friendly controls for easy maneuverability.",
        price = 2999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/motorcycle/Scooter%20Motorcycle/1.png", "https://cdn.dummyjson.com/products/images/motorcycle/Scooter%20Motorcycle/2.png", "https://cdn.dummyjson.com/products/images/motorcycle/Scooter%20Motorcycle/3.png", "https://cdn.dummyjson.com/products/images/motorcycle/Scooter%20Motorcycle/4.png"
        ),
        category = "motorcycle",
        dimensions = mapOf(
            "width" to 8.02,
            "height" to 10.2,
            "depth" to 17.22
        ),
        stock = 11
    ), ProductJSON(
        title = "Sportbike Motorcycle",
        description = "The Sportbike Motorcycle is designed for speed and agility, with a sleek and aerodynamic profile. It's suitable for riders looking for a dynamic and thrilling riding experience.",
        price = 7499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/motorcycle/Sportbike%20Motorcycle/1.png", "https://cdn.dummyjson.com/products/images/motorcycle/Sportbike%20Motorcycle/2.png", "https://cdn.dummyjson.com/products/images/motorcycle/Sportbike%20Motorcycle/3.png", "https://cdn.dummyjson.com/products/images/motorcycle/Sportbike%20Motorcycle/4.png"
        ),
        category = "motorcycle",
        dimensions = mapOf(
            "width" to 17.16,
            "height" to 15.02,
            "depth" to 15.03
        ),
        stock = 12
    ), ProductJSON(
        title = "Attitude Super Leaves Hand Soap",
        description = "Attitude Super Leaves Hand Soap is a natural and nourishing hand soap enriched with the goodness of super leaves. It cleanses and moisturizes your hands, leaving them feeling fresh and soft.",
        price = 8.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/skin-care/Attitude%20Super%20Leaves%20Hand%20Soap/1.png", "https://cdn.dummyjson.com/products/images/skin-care/Attitude%20Super%20Leaves%20Hand%20Soap/2.png", "https://cdn.dummyjson.com/products/images/skin-care/Attitude%20Super%20Leaves%20Hand%20Soap/3.png"
        ),
        category = "skin-care",
        dimensions = mapOf(
            "width" to 9.98,
            "height" to 14.56,
            "depth" to 19.38
        ),
        stock = 98
    ), ProductJSON(
        title = "Olay Ultra Moisture Shea Butter Body Wash",
        description = "Olay Ultra Moisture Shea Butter Body Wash is a luxurious body wash that hydrates and nourishes your skin with the moisturizing power of shea butter. Enjoy a rich lather and silky-smooth skin.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/skin-care/Olay%20Ultra%20Moisture%20Shea%20Butter%20Body%20Wash/1.png", "https://cdn.dummyjson.com/products/images/skin-care/Olay%20Ultra%20Moisture%20Shea%20Butter%20Body%20Wash/2.png", "https://cdn.dummyjson.com/products/images/skin-care/Olay%20Ultra%20Moisture%20Shea%20Butter%20Body%20Wash/3.png"
        ),
        category = "skin-care",
        dimensions = mapOf(
            "width" to 8.6,
            "height" to 28.86,
            "depth" to 22.75
        ),
        stock = 43
    ), ProductJSON(
        title = "Vaseline Men Body and Face Lotion",
        description = "Vaseline Men Body and Face Lotion is a specially formulated lotion designed to provide long-lasting moisture to men's skin. It absorbs quickly and helps keep the skin hydrated and healthy.",
        price = 9.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/skin-care/Vaseline%20Men%20Body%20and%20Face%20Lotion/1.png", "https://cdn.dummyjson.com/products/images/skin-care/Vaseline%20Men%20Body%20and%20Face%20Lotion/2.png", "https://cdn.dummyjson.com/products/images/skin-care/Vaseline%20Men%20Body%20and%20Face%20Lotion/3.png"
        ),
        category = "skin-care",
        dimensions = mapOf(
            "width" to 28.39,
            "height" to 25.58,
            "depth" to 15.49
        ),
        stock = 54
    ), ProductJSON(
        title = "iPhone 5s",
        description = "The iPhone 5s is a classic smartphone known for its compact design and advanced features during its release. While it's an older model, it still provides a reliable user experience.",
        price = 199.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/iPhone%205s/1.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%205s/2.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%205s/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 8.49,
            "height" to 25.34,
            "depth" to 18.12
        ),
        stock = 65
    ), ProductJSON(
        title = "iPhone 6",
        description = "The iPhone 6 is a stylish and capable smartphone with a larger display and improved performance. It introduced new features and design elements, making it a popular choice in its time.",
        price = 299.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/iPhone%206/1.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%206/2.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%206/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 16.21,
            "height" to 22.94,
            "depth" to 5.63
        ),
        stock = 99
    ), ProductJSON(
        title = "iPhone 13 Pro",
        description = "The iPhone 13 Pro is a cutting-edge smartphone with a powerful camera system, high-performance chip, and stunning display. It offers advanced features for users who demand top-notch technology.",
        price = 1099.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/iPhone%2013%20Pro/1.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%2013%20Pro/2.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%2013%20Pro/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 22.39,
            "height" to 9.77,
            "depth" to 19.6
        ),
        stock = 26
    ), ProductJSON(
        title = "iPhone X",
        description = "The iPhone X is a flagship smartphone featuring a bezel-less OLED display, facial recognition technology (Face ID), and impressive performance. It represents a milestone in iPhone design and innovation.",
        price = 899.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/iPhone%20X/1.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%20X/2.png", "https://cdn.dummyjson.com/products/images/smartphones/iPhone%20X/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 27.86,
            "height" to 8.53,
            "depth" to 17.07
        ),
        stock = 99
    ), ProductJSON(
        title = "Oppo A57",
        description = "The Oppo A57 is a mid-range smartphone known for its sleek design and capable features. It offers a balance of performance and affordability, making it a popular choice.",
        price = 249.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20A57/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20A57/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20A57/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 29.52,
            "height" to 11.25,
            "depth" to 14.41
        ),
        stock = 76
    ), ProductJSON(
        title = "Oppo F19 Pro Plus",
        description = "The Oppo F19 Pro Plus is a feature-rich smartphone with a focus on camera capabilities. It boasts advanced photography features and a powerful performance for a premium user experience.",
        price = 399.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20F19%20Pro%20Plus/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20F19%20Pro%20Plus/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20F19%20Pro%20Plus/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 20.35,
            "height" to 16.4,
            "depth" to 13.31
        ),
        stock = 92
    ), ProductJSON(
        title = "Oppo K1",
        description = "The Oppo K1 series offers a range of smartphones with various features and specifications. Known for their stylish design and reliable performance, the Oppo K1 series caters to diverse user preferences.",
        price = 299.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20K1/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20K1/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20K1/3.png", "https://cdn.dummyjson.com/products/images/smartphones/Oppo%20K1/4.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 21.83,
            "height" to 27.83,
            "depth" to 27.47
        ),
        stock = 61
    ), ProductJSON(
        title = "Realme C35",
        description = "The Realme C35 is a budget-friendly smartphone with a focus on providing essential features for everyday use. It offers a reliable performance and user-friendly experience.",
        price = 149.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Realme%20C35/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Realme%20C35/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Realme%20C35/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 21.74,
            "height" to 28.75,
            "depth" to 22.22
        ),
        stock = 81
    ), ProductJSON(
        title = "Realme X",
        description = "The Realme X is a mid-range smartphone known for its sleek design and impressive display. It offers a good balance of performance and camera capabilities for users seeking a quality device.",
        price = 299.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Realme%20X/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Realme%20X/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Realme%20X/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 29.32,
            "height" to 16.3,
            "depth" to 24.12
        ),
        stock = 87
    ), ProductJSON(
        title = "Realme XT",
        description = "The Realme XT is a feature-rich smartphone with a focus on camera technology. It comes equipped with advanced camera sensors, delivering high-quality photos and videos for photography enthusiasts.",
        price = 349.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Realme%20XT/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Realme%20XT/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Realme%20XT/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 28.82,
            "height" to 23.44,
            "depth" to 6.21
        ),
        stock = 53
    ), ProductJSON(
        title = "Samsung Galaxy S7",
        description = "The Samsung Galaxy S7 is a flagship smartphone known for its sleek design and advanced features. It features a high-resolution display, powerful camera, and robust performance.",
        price = 299.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S7/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S7/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S7/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 23.33,
            "height" to 27.33,
            "depth" to 27.02
        ),
        stock = 55
    ), ProductJSON(
        title = "Samsung Galaxy S8",
        description = "The Samsung Galaxy S8 is a premium smartphone with an Infinity Display, offering a stunning visual experience. It boasts advanced camera capabilities and cutting-edge technology.",
        price = 499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S8/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S8/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S8/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 6.88,
            "height" to 8.96,
            "depth" to 18.13
        ),
        stock = 75
    ), ProductJSON(
        title = "Samsung Galaxy S10",
        description = "The Samsung Galaxy S10 is a flagship device featuring a dynamic AMOLED display, versatile camera system, and powerful performance. It represents innovation and excellence in smartphone technology.",
        price = 699.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S10/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S10/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Samsung%20Galaxy%20S10/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 28.23,
            "height" to 7.35,
            "depth" to 10.68
        ),
        stock = 40
    ), ProductJSON(
        title = "Vivo S1",
        description = "The Vivo S1 is a stylish and mid-range smartphone offering a blend of design and performance. It features a vibrant display, capable camera system, and reliable functionality.",
        price = 249.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20S1/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20S1/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20S1/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 28.83,
            "height" to 26.69,
            "depth" to 23.12
        ),
        stock = 13
    ), ProductJSON(
        title = "Vivo V9",
        description = "The Vivo V9 is a smartphone known for its sleek design and emphasis on capturing high-quality selfies. It features a notch display, dual-camera setup, and a modern design.",
        price = 299.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20V9/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20V9/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20V9/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 27.29,
            "height" to 9.73,
            "depth" to 14.79
        ),
        stock = 19
    ), ProductJSON(
        title = "Vivo X21",
        description = "The Vivo X21 is a premium smartphone with a focus on cutting-edge technology. It features an in-display fingerprint sensor, a high-resolution display, and advanced camera capabilities.",
        price = 499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20X21/1.png", "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20X21/2.png", "https://cdn.dummyjson.com/products/images/smartphones/Vivo%20X21/3.png"
        ),
        category = "smartphones",
        dimensions = mapOf(
            "width" to 5.72,
            "height" to 16.47,
            "depth" to 27.76
        ),
        stock = 0
    ), ProductJSON(
        title = "American Football",
        description = "The American Football is a classic ball used in American football games. It is designed for throwing and catching, making it an essential piece of equipment for the sport.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/American%20Football/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 9.74,
            "height" to 23.16,
            "depth" to 26.86
        ),
        stock = 48
    ), ProductJSON(
        title = "Baseball Ball",
        description = "The Baseball Ball is a standard baseball used in baseball games. It features a durable leather cover and is designed for pitching, hitting, and fielding in the game of baseball.",
        price = 8.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Baseball%20Ball/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 21.26,
            "height" to 20.59,
            "depth" to 18.28
        ),
        stock = 71
    ), ProductJSON(
        title = "Baseball Glove",
        description = "The Baseball Glove is a protective glove worn by baseball players. It is designed to catch and field the baseball, providing players with comfort and control during the game.",
        price = 24.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Baseball%20Glove/1.png", "https://cdn.dummyjson.com/products/images/sports-accessories/Baseball%20Glove/2.png", "https://cdn.dummyjson.com/products/images/sports-accessories/Baseball%20Glove/3.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 15.64,
            "height" to 18.72,
            "depth" to 26.09
        ),
        stock = 43
    ), ProductJSON(
        title = "Basketball",
        description = "The Basketball is a standard ball used in basketball games. It is designed for dribbling, shooting, and passing in the game of basketball, suitable for both indoor and outdoor play.",
        price = 14.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Basketball/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 15.68,
            "height" to 23.18,
            "depth" to 16.25
        ),
        stock = 100
    ), ProductJSON(
        title = "Basketball Rim",
        description = "The Basketball Rim is a sturdy hoop and net assembly mounted on a basketball backboard. It provides a target for shooting and scoring in the game of basketball.",
        price = 39.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Basketball%20Rim/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 12.95,
            "height" to 15.58,
            "depth" to 15.23
        ),
        stock = 57
    ), ProductJSON(
        title = "Cricket Ball",
        description = "The Cricket Ball is a hard leather ball used in the sport of cricket. It is bowled and batted in the game, and its hardness and seam contribute to the dynamics of cricket play.",
        price = 12.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Ball/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 26.97,
            "height" to 13.92,
            "depth" to 26.59
        ),
        stock = 42
    ), ProductJSON(
        title = "Cricket Bat",
        description = "The Cricket Bat is an essential piece of cricket equipment used by batsmen to hit the cricket ball. It is made of wood and comes in various sizes and designs.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Bat/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 14.13,
            "height" to 25.99,
            "depth" to 9.02
        ),
        stock = 3
    ), ProductJSON(
        title = "Cricket Helmet",
        description = "The Cricket Helmet is a protective headgear worn by cricket players, especially batsmen and wicketkeepers. It provides protection against fast bowling and bouncers.",
        price = 44.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Helmet/1.png", "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Helmet/2.png", "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Helmet/3.png", "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Helmet/4.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 18.85,
            "height" to 16.08,
            "depth" to 6.2
        ),
        stock = 31
    ), ProductJSON(
        title = "Cricket Wicket",
        description = "The Cricket Wicket is a set of three stumps and two bails, forming a wicket used in the sport of cricket. Batsmen aim to protect the wicket while scoring runs.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Cricket%20Wicket/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 15.56,
            "height" to 7.36,
            "depth" to 6.91
        ),
        stock = 31
    ), ProductJSON(
        title = "Feather Shuttlecock",
        description = "The Feather Shuttlecock is used in the sport of badminton. It features natural feathers and is designed for high-speed play, providing stability and accuracy during matches.",
        price = 5.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Feather%20Shuttlecock/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 15.24,
            "height" to 28.04,
            "depth" to 13.49
        ),
        stock = 17
    ), ProductJSON(
        title = "Football",
        description = "The Football, also known as a soccer ball, is the standard ball used in the sport of football (soccer). It is designed for kicking and passing in the game.",
        price = 17.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Football/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 22.49,
            "height" to 7.19,
            "depth" to 13.42
        ),
        stock = 66
    ), ProductJSON(
        title = "Golf Ball",
        description = "The Golf Ball is a small ball used in the sport of golf. It features dimples on its surface, providing aerodynamic lift and distance when struck by a golf club.",
        price = 9.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Golf%20Ball/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 11.42,
            "height" to 18.98,
            "depth" to 7.29
        ),
        stock = 45
    ), ProductJSON(
        title = "Iron Golf",
        description = "The Iron Golf is a type of golf club designed for various golf shots. It features a solid metal head and is used for approach shots, chipping, and other golfing techniques.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Iron%20Golf/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 27.3,
            "height" to 14.38,
            "depth" to 23.56
        ),
        stock = 7
    ), ProductJSON(
        title = "Metal Baseball Bat",
        description = "The Metal Baseball Bat is a durable and lightweight baseball bat made from metal alloys. It is commonly used in baseball games for hitting and batting practice.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Metal%20Baseball%20Bat/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 29.14,
            "height" to 10.81,
            "depth" to 24.92
        ),
        stock = 37
    ), ProductJSON(
        title = "Tennis Ball",
        description = "The Tennis Ball is a standard ball used in the sport of tennis. It is designed for bouncing and hitting with tennis rackets during matches or practice sessions.",
        price = 6.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Tennis%20Ball/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 27.82,
            "height" to 27.05,
            "depth" to 28.32
        ),
        stock = 99
    ), ProductJSON(
        title = "Tennis Racket",
        description = "The Tennis Racket is an essential piece of equipment used in the sport of tennis. It features a frame with strings and a grip, allowing players to hit the tennis ball.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Tennis%20Racket/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 14.55,
            "height" to 27.86,
            "depth" to 19.37
        ),
        stock = 86
    ), ProductJSON(
        title = "Volleyball",
        description = "The Volleyball is a standard ball used in the sport of volleyball. It is designed for passing, setting, and spiking over the net during volleyball matches.",
        price = 11.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sports-accessories/Volleyball/1.png"
        ),
        category = "sports-accessories",
        dimensions = mapOf(
            "width" to 10.73,
            "height" to 17.62,
            "depth" to 16.97
        ),
        stock = 0
    ), ProductJSON(
        title = "Black Sun Glasses",
        description = "The Black Sun Glasses are a classic and stylish choice, featuring a sleek black frame and tinted lenses. They provide both UV protection and a fashionable look.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sunglasses/Black%20Sun%20Glasses/1.png", "https://cdn.dummyjson.com/products/images/sunglasses/Black%20Sun%20Glasses/2.png", "https://cdn.dummyjson.com/products/images/sunglasses/Black%20Sun%20Glasses/3.png"
        ),
        category = "sunglasses",
        dimensions = mapOf(
            "width" to 14.41,
            "height" to 22.93,
            "depth" to 9.36
        ),
        stock = 100
    ), ProductJSON(
        title = "Classic Sun Glasses",
        description = "The Classic Sun Glasses offer a timeless design with a neutral frame and UV-protected lenses. These sunglasses are versatile and suitable for various occasions.",
        price = 24.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sunglasses/Classic%20Sun%20Glasses/1.png", "https://cdn.dummyjson.com/products/images/sunglasses/Classic%20Sun%20Glasses/2.png", "https://cdn.dummyjson.com/products/images/sunglasses/Classic%20Sun%20Glasses/3.png"
        ),
        category = "sunglasses",
        dimensions = mapOf(
            "width" to 15.27,
            "height" to 7.88,
            "depth" to 7.94
        ),
        stock = 100
    ), ProductJSON(
        title = "Green and Black Glasses",
        description = "The Green and Black Glasses feature a bold combination of green and black colors, adding a touch of vibrancy to your eyewear collection. They are both stylish and eye-catching.",
        price = 34.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sunglasses/Green%20and%20Black%20Glasses/1.png", "https://cdn.dummyjson.com/products/images/sunglasses/Green%20and%20Black%20Glasses/2.png", "https://cdn.dummyjson.com/products/images/sunglasses/Green%20and%20Black%20Glasses/3.png"
        ),
        category = "sunglasses",
        dimensions = mapOf(
            "width" to 10.62,
            "height" to 22.49,
            "depth" to 28.91
        ),
        stock = 74
    ), ProductJSON(
        title = "Party Glasses",
        description = "The Party Glasses are designed to add flair to your party outfit. With unique shapes or colorful frames, they're perfect for adding a playful touch to your look during celebrations.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sunglasses/Party%20Glasses/1.png", "https://cdn.dummyjson.com/products/images/sunglasses/Party%20Glasses/2.png", "https://cdn.dummyjson.com/products/images/sunglasses/Party%20Glasses/3.png"
        ),
        category = "sunglasses",
        dimensions = mapOf(
            "width" to 17.04,
            "height" to 25.52,
            "depth" to 12.34
        ),
        stock = 35
    ), ProductJSON(
        title = "Sunglasses",
        description = "The Sunglasses offer a classic and simple design with a focus on functionality. These sunglasses provide essential UV protection while maintaining a timeless look.",
        price = 22.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/sunglasses/Sunglasses/1.png", "https://cdn.dummyjson.com/products/images/sunglasses/Sunglasses/2.png", "https://cdn.dummyjson.com/products/images/sunglasses/Sunglasses/3.png"
        ),
        category = "sunglasses",
        dimensions = mapOf(
            "width" to 8.15,
            "height" to 28.81,
            "depth" to 8.4
        ),
        stock = 59
    ), ProductJSON(
        title = "iPad Mini 2021 Starlight",
        description = "The iPad Mini 2021 in Starlight is a compact and powerful tablet from Apple. Featuring a stunning Retina display, powerful A-series chip, and a sleek design, it offers a premium tablet experience.",
        price = 499.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tablets/iPad%20Mini%202021%20Starlight/1.png", "https://cdn.dummyjson.com/products/images/tablets/iPad%20Mini%202021%20Starlight/2.png", "https://cdn.dummyjson.com/products/images/tablets/iPad%20Mini%202021%20Starlight/3.png", "https://cdn.dummyjson.com/products/images/tablets/iPad%20Mini%202021%20Starlight/4.png"
        ),
        category = "tablets",
        dimensions = mapOf(
            "width" to 24.9,
            "height" to 11.83,
            "depth" to 17.08
        ),
        stock = 32
    ), ProductJSON(
        title = "Samsung Galaxy Tab S8 Plus Grey",
        description = "The Samsung Galaxy Tab S8 Plus in Grey is a high-performance Android tablet by Samsung. With a large AMOLED display, powerful processor, and S Pen support, it's ideal for productivity and entertainment.",
        price = 599.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20S8%20Plus%20Grey/1.png", "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20S8%20Plus%20Grey/2.png", "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20S8%20Plus%20Grey/3.png", "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20S8%20Plus%20Grey/4.png"
        ),
        category = "tablets",
        dimensions = mapOf(
            "width" to 18.5,
            "height" to 24.49,
            "depth" to 10.45
        ),
        stock = 76
    ), ProductJSON(
        title = "Samsung Galaxy Tab White",
        description = "The Samsung Galaxy Tab in White is a sleek and versatile Android tablet. With a vibrant display, long-lasting battery, and a range of features, it offers a great user experience for various tasks.",
        price = 349.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20White/1.png", "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20White/2.png", "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20White/3.png", "https://cdn.dummyjson.com/products/images/tablets/Samsung%20Galaxy%20Tab%20White/4.png"
        ),
        category = "tablets",
        dimensions = mapOf(
            "width" to 12.42,
            "height" to 10.22,
            "depth" to 23.37
        ),
        stock = 0
    ), ProductJSON(
        title = "Blue Frock",
        description = "The Blue Frock is a charming and stylish dress for various occasions. With a vibrant blue color and a comfortable design, it adds a touch of elegance to your wardrobe.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tops/Blue%20Frock/1.png", "https://cdn.dummyjson.com/products/images/tops/Blue%20Frock/2.png", "https://cdn.dummyjson.com/products/images/tops/Blue%20Frock/3.png", "https://cdn.dummyjson.com/products/images/tops/Blue%20Frock/4.png"
        ),
        category = "tops",
        dimensions = mapOf(
            "width" to 22.85,
            "height" to 26.97,
            "depth" to 12.29
        ),
        stock = 37
    ), ProductJSON(
        title = "Girl Summer Dress",
        description = "The Girl Summer Dress is a cute and breezy dress designed for warm weather. With playful patterns and lightweight fabric, it's perfect for keeping cool and stylish during the summer.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tops/Girl%20Summer%20Dress/1.png", "https://cdn.dummyjson.com/products/images/tops/Girl%20Summer%20Dress/2.png", "https://cdn.dummyjson.com/products/images/tops/Girl%20Summer%20Dress/3.png", "https://cdn.dummyjson.com/products/images/tops/Girl%20Summer%20Dress/4.png"
        ),
        category = "tops",
        dimensions = mapOf(
            "width" to 8.02,
            "height" to 5.01,
            "depth" to 20.55
        ),
        stock = 20
    ), ProductJSON(
        title = "Gray Dress",
        description = "The Gray Dress is a versatile and chic option for various occasions. With a neutral gray color, it can be dressed up or down, making it a wardrobe staple for any fashion-forward individual.",
        price = 34.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tops/Gray%20Dress/1.png", "https://cdn.dummyjson.com/products/images/tops/Gray%20Dress/2.png", "https://cdn.dummyjson.com/products/images/tops/Gray%20Dress/3.png", "https://cdn.dummyjson.com/products/images/tops/Gray%20Dress/4.png"
        ),
        category = "tops",
        dimensions = mapOf(
            "width" to 13.86,
            "height" to 19.2,
            "depth" to 8.64
        ),
        stock = 81
    ), ProductJSON(
        title = "Short Frock",
        description = "The Short Frock is a playful and trendy dress with a shorter length. Ideal for casual outings or special occasions, it combines style and comfort for a fashionable look.",
        price = 24.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tops/Short%20Frock/1.png", "https://cdn.dummyjson.com/products/images/tops/Short%20Frock/2.png", "https://cdn.dummyjson.com/products/images/tops/Short%20Frock/3.png", "https://cdn.dummyjson.com/products/images/tops/Short%20Frock/4.png"
        ),
        category = "tops",
        dimensions = mapOf(
            "width" to 24.35,
            "height" to 8.49,
            "depth" to 5.89
        ),
        stock = 19
    ), ProductJSON(
        title = "Tartan Dress",
        description = "The Tartan Dress features a classic tartan pattern, bringing a timeless and sophisticated touch to your wardrobe. Perfect for fall and winter, it adds a hint of traditional charm.",
        price = 39.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/tops/Tartan%20Dress/1.png", "https://cdn.dummyjson.com/products/images/tops/Tartan%20Dress/2.png", "https://cdn.dummyjson.com/products/images/tops/Tartan%20Dress/3.png", "https://cdn.dummyjson.com/products/images/tops/Tartan%20Dress/4.png"
        ),
        category = "tops",
        dimensions = mapOf(
            "width" to 13.0,
            "height" to 28.67,
            "depth" to 6.45
        ),
        stock = 100
    ), ProductJSON(
        title = "300 Touring",
        description = "The 300 Touring is a stylish and comfortable sedan, known for its luxurious features and smooth performance.",
        price = 28999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/vehicle/300%20Touring/1.png", "https://cdn.dummyjson.com/products/images/vehicle/300%20Touring/2.png", "https://cdn.dummyjson.com/products/images/vehicle/300%20Touring/3.png", "https://cdn.dummyjson.com/products/images/vehicle/300%20Touring/4.png", "https://cdn.dummyjson.com/products/images/vehicle/300%20Touring/5.png", "https://cdn.dummyjson.com/products/images/vehicle/300%20Touring/6.png"
        ),
        category = "vehicle",
        dimensions = mapOf(
            "width" to 5.03,
            "height" to 6.98,
            "depth" to 8.65
        ),
        stock = 53
    ), ProductJSON(
        title = "Charger SXT RWD",
        description = "The Charger SXT RWD is a powerful and sporty rear-wheel-drive sedan, offering a blend of performance and practicality.",
        price = 32999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/vehicle/Charger%20SXT%20RWD/1.png", "https://cdn.dummyjson.com/products/images/vehicle/Charger%20SXT%20RWD/2.png", "https://cdn.dummyjson.com/products/images/vehicle/Charger%20SXT%20RWD/3.png", "https://cdn.dummyjson.com/products/images/vehicle/Charger%20SXT%20RWD/4.png", "https://cdn.dummyjson.com/products/images/vehicle/Charger%20SXT%20RWD/5.png", "https://cdn.dummyjson.com/products/images/vehicle/Charger%20SXT%20RWD/6.png"
        ),
        category = "vehicle",
        dimensions = mapOf(
            "width" to 27.01,
            "height" to 11.43,
            "depth" to 23.25
        ),
        stock = 85
    ), ProductJSON(
        title = "Dodge Hornet GT Plus",
        description = "The Dodge Hornet GT Plus is a compact and agile hatchback, perfect for urban driving with a touch of sportiness.",
        price = 24999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/vehicle/Dodge%20Hornet%20GT%20Plus/1.png", "https://cdn.dummyjson.com/products/images/vehicle/Dodge%20Hornet%20GT%20Plus/2.png", "https://cdn.dummyjson.com/products/images/vehicle/Dodge%20Hornet%20GT%20Plus/3.png", "https://cdn.dummyjson.com/products/images/vehicle/Dodge%20Hornet%20GT%20Plus/4.png", "https://cdn.dummyjson.com/products/images/vehicle/Dodge%20Hornet%20GT%20Plus/5.png", "https://cdn.dummyjson.com/products/images/vehicle/Dodge%20Hornet%20GT%20Plus/6.png"
        ),
        category = "vehicle",
        dimensions = mapOf(
            "width" to 14.26,
            "height" to 20.05,
            "depth" to 14.21
        ),
        stock = 81
    ), ProductJSON(
        title = "Durango SXT RWD",
        description = "The Durango SXT RWD is a spacious and versatile SUV, known for its strong performance and family-friendly features.",
        price = 36999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/vehicle/Durango%20SXT%20RWD/1.png", "https://cdn.dummyjson.com/products/images/vehicle/Durango%20SXT%20RWD/2.png", "https://cdn.dummyjson.com/products/images/vehicle/Durango%20SXT%20RWD/3.png", "https://cdn.dummyjson.com/products/images/vehicle/Durango%20SXT%20RWD/4.png", "https://cdn.dummyjson.com/products/images/vehicle/Durango%20SXT%20RWD/5.png", "https://cdn.dummyjson.com/products/images/vehicle/Durango%20SXT%20RWD/6.png"
        ),
        category = "vehicle",
        dimensions = mapOf(
            "width" to 17.45,
            "height" to 22.98,
            "depth" to 20.63
        ),
        stock = 0
    ), ProductJSON(
        title = "Pacifica Touring",
        description = "The Pacifica Touring is a stylish and well-equipped minivan, offering comfort and convenience for family journeys.",
        price = 31999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/vehicle/Pacifica%20Touring/1.png", "https://cdn.dummyjson.com/products/images/vehicle/Pacifica%20Touring/2.png", "https://cdn.dummyjson.com/products/images/vehicle/Pacifica%20Touring/3.png", "https://cdn.dummyjson.com/products/images/vehicle/Pacifica%20Touring/4.png", "https://cdn.dummyjson.com/products/images/vehicle/Pacifica%20Touring/5.png", "https://cdn.dummyjson.com/products/images/vehicle/Pacifica%20Touring/6.png"
        ),
        category = "vehicle",
        dimensions = mapOf(
            "width" to 21.11,
            "height" to 16.23,
            "depth" to 22.96
        ),
        stock = 22
    ), ProductJSON(
        title = "Blue Women's Handbag",
        description = "The Blue Women's Handbag is a stylish and spacious accessory for everyday use. With a vibrant blue color and multiple compartments, it combines fashion and functionality.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-bags/Blue%20Women's%20Handbag/1.png", "https://cdn.dummyjson.com/products/images/womens-bags/Blue%20Women's%20Handbag/2.png", "https://cdn.dummyjson.com/products/images/womens-bags/Blue%20Women's%20Handbag/3.png"
        ),
        category = "bags",
        dimensions = mapOf(
            "width" to 16.06,
            "height" to 14.91,
            "depth" to 28.61
        ),
        stock = 76
    ), ProductJSON(
        title = "Heshe Women's Leather Bag",
        description = "The Heshe Women's Leather Bag is a luxurious and high-quality leather bag for the sophisticated woman. With a timeless design and durable craftsmanship, it's a versatile accessory.",
        price = 129.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-bags/Heshe%20Women's%20Leather%20Bag/1.png", "https://cdn.dummyjson.com/products/images/womens-bags/Heshe%20Women's%20Leather%20Bag/2.png", "https://cdn.dummyjson.com/products/images/womens-bags/Heshe%20Women's%20Leather%20Bag/3.png"
        ),
        category = "bags",
        dimensions = mapOf(
            "width" to 24.49,
            "height" to 10.88,
            "depth" to 8.35
        ),
        stock = 9
    ), ProductJSON(
        title = "Prada Women Bag",
        description = "The Prada Women Bag is an iconic designer bag that exudes elegance and luxury. Crafted with precision and featuring the Prada logo, it's a statement piece for fashion enthusiasts.",
        price = 599.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-bags/Prada%20Women%20Bag/1.png", "https://cdn.dummyjson.com/products/images/womens-bags/Prada%20Women%20Bag/2.png", "https://cdn.dummyjson.com/products/images/womens-bags/Prada%20Women%20Bag/3.png"
        ),
        category = "bags",
        dimensions = mapOf(
            "width" to 23.45,
            "height" to 16.1,
            "depth" to 5.78
        ),
        stock = 43
    ), ProductJSON(
        title = "White Faux Leather Backpack",
        description = "The White Faux Leather Backpack is a trendy and practical backpack for the modern woman. With a sleek white design and ample storage space, it's perfect for both casual and on-the-go styles.",
        price = 39.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-bags/White%20Faux%20Leather%20Backpack/1.png", "https://cdn.dummyjson.com/products/images/womens-bags/White%20Faux%20Leather%20Backpack/2.png", "https://cdn.dummyjson.com/products/images/womens-bags/White%20Faux%20Leather%20Backpack/3.png"
        ),
        category = "bags",
        dimensions = mapOf(
            "width" to 9.35,
            "height" to 22.43,
            "depth" to 15.63
        ),
        stock = 89
    ), ProductJSON(
        title = "Women Handbag Black",
        description = "The Women Handbag in Black is a classic and versatile accessory that complements various outfits. With a timeless black color and functional design, it's a must-have in every woman's wardrobe.",
        price = 59.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-bags/Women%20Handbag%20Black/1.png", "https://cdn.dummyjson.com/products/images/womens-bags/Women%20Handbag%20Black/2.png", "https://cdn.dummyjson.com/products/images/womens-bags/Women%20Handbag%20Black/3.png"
        ),
        category = "bags",
        dimensions = mapOf(
            "width" to 15.31,
            "height" to 26.35,
            "depth" to 24.69
        ),
        stock = 24
    ), ProductJSON(
        title = "Black Women's Gown",
        description = "The Black Women's Gown is an elegant and timeless evening gown. With a sleek black design, it's perfect for formal events and special occasions, exuding sophistication and style.",
        price = 129.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-dresses/Black%20Women's%20Gown/1.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Black%20Women's%20Gown/2.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Black%20Women's%20Gown/3.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Black%20Women's%20Gown/4.png"
        ),
        category = "dresses",
        dimensions = mapOf(
            "width" to 22.4,
            "height" to 22.15,
            "depth" to 21.87
        ),
        stock = 59
    ), ProductJSON(
        title = "Corset Leather With Skirt",
        description = "The Corset Leather With Skirt is a bold and edgy ensemble that combines a stylish corset with a matching skirt. Ideal for fashion-forward individuals, it makes a statement at any event.",
        price = 89.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20Leather%20With%20Skirt/1.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20Leather%20With%20Skirt/2.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20Leather%20With%20Skirt/3.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20Leather%20With%20Skirt/4.png"
        ),
        category = "dresses",
        dimensions = mapOf(
            "width" to 19.1,
            "height" to 27.47,
            "depth" to 29.95
        ),
        stock = 59
    ), ProductJSON(
        title = "Corset With Black Skirt",
        description = "The Corset With Black Skirt is a chic and versatile outfit that pairs a fashionable corset with a classic black skirt. It offers a trendy and coordinated look for various occasions.",
        price = 79.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20With%20Black%20Skirt/1.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20With%20Black%20Skirt/2.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20With%20Black%20Skirt/3.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Corset%20With%20Black%20Skirt/4.png"
        ),
        category = "dresses",
        dimensions = mapOf(
            "width" to 9.79,
            "height" to 26.72,
            "depth" to 14.21
        ),
        stock = 67
    ), ProductJSON(
        title = "Dress Pea",
        description = "The Dress Pea is a stylish and comfortable dress with a pea pattern. Perfect for casual outings, it adds a playful and fun element to your wardrobe, making it a great choice for day-to-day wear.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-dresses/Dress%20Pea/1.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Dress%20Pea/2.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Dress%20Pea/3.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Dress%20Pea/4.png"
        ),
        category = "dresses",
        dimensions = mapOf(
            "width" to 22.66,
            "height" to 19.32,
            "depth" to 6.3
        ),
        stock = 29
    ), ProductJSON(
        title = "Marni Red & Black Suit",
        description = "The Marni Red & Black Suit is a sophisticated and fashion-forward suit ensemble. With a combination of red and black tones, it showcases a modern design for a bold and confident look.",
        price = 179.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-dresses/Marni%20Red%20&%20Black%20Suit/1.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Marni%20Red%20&%20Black%20Suit/2.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Marni%20Red%20&%20Black%20Suit/3.png", "https://cdn.dummyjson.com/products/images/womens-dresses/Marni%20Red%20&%20Black%20Suit/4.png"
        ),
        category = "dresses",
        dimensions = mapOf(
            "width" to 24.67,
            "height" to 16.15,
            "depth" to 14.69
        ),
        stock = 15
    ), ProductJSON(
        title = "Green Crystal Earring",
        description = "The Green Crystal Earring is a dazzling accessory that features a vibrant green crystal. With a classic design, it adds a touch of elegance to your ensemble, perfect for formal or special occasions.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-jewellery/Green%20Crystal%20Earring/1.png", "https://cdn.dummyjson.com/products/images/womens-jewellery/Green%20Crystal%20Earring/2.png", "https://cdn.dummyjson.com/products/images/womens-jewellery/Green%20Crystal%20Earring/3.png"
        ),
        category = "jewellery",
        dimensions = mapOf(
            "width" to 19.73,
            "height" to 14.54,
            "depth" to 15.92
        ),
        stock = 1
    ), ProductJSON(
        title = "Green Oval Earring",
        description = "The Green Oval Earring is a stylish and versatile accessory with a unique oval shape. Whether for casual or dressy occasions, its green hue and contemporary design make it a standout piece.",
        price = 24.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-jewellery/Green%20Oval%20Earring/1.png", "https://cdn.dummyjson.com/products/images/womens-jewellery/Green%20Oval%20Earring/2.png", "https://cdn.dummyjson.com/products/images/womens-jewellery/Green%20Oval%20Earring/3.png"
        ),
        category = "jewellery",
        dimensions = mapOf(
            "width" to 28.22,
            "height" to 18.32,
            "depth" to 11.64
        ),
        stock = 89
    ), ProductJSON(
        title = "Tropical Earring",
        description = "The Tropical Earring is a fun and playful accessory inspired by tropical elements. Featuring vibrant colors and a lively design, it's perfect for adding a touch of summer to your look.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-jewellery/Tropical%20Earring/1.png", "https://cdn.dummyjson.com/products/images/womens-jewellery/Tropical%20Earring/2.png", "https://cdn.dummyjson.com/products/images/womens-jewellery/Tropical%20Earring/3.png"
        ),
        category = "jewellery",
        dimensions = mapOf(
            "width" to 25.36,
            "height" to 29.46,
            "depth" to 15.58
        ),
        stock = 76
    ), ProductJSON(
        title = "Black & Brown Slipper",
        description = "The Black & Brown Slipper is a comfortable and stylish choice for casual wear. Featuring a blend of black and brown colors, it adds a touch of sophistication to your relaxation.",
        price = 19.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-shoes/Black%20&%20Brown%20Slipper/1.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Black%20&%20Brown%20Slipper/2.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Black%20&%20Brown%20Slipper/3.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Black%20&%20Brown%20Slipper/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 9.73,
            "height" to 15.4,
            "depth" to 6.3
        ),
        stock = 80
    ), ProductJSON(
        title = "Calvin Klein Heel Shoes",
        description = "Calvin Klein Heel Shoes are elegant and sophisticated, designed for formal occasions. With a classic design and high-quality materials, they complement your stylish ensemble.",
        price = 79.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-shoes/Calvin%20Klein%20Heel%20Shoes/1.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Calvin%20Klein%20Heel%20Shoes/2.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Calvin%20Klein%20Heel%20Shoes/3.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Calvin%20Klein%20Heel%20Shoes/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 15.41,
            "height" to 18.83,
            "depth" to 18.69
        ),
        stock = 99
    ), ProductJSON(
        title = "Golden Shoes Woman",
        description = "The Golden Shoes for Women are a glamorous choice for special occasions. Featuring a golden hue and stylish design, they add a touch of luxury to your outfit.",
        price = 49.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-shoes/Golden%20Shoes%20Woman/1.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Golden%20Shoes%20Woman/2.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Golden%20Shoes%20Woman/3.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Golden%20Shoes%20Woman/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 15.32,
            "height" to 27.84,
            "depth" to 21.06
        ),
        stock = 99
    ), ProductJSON(
        title = "Pampi Shoes",
        description = "Pampi Shoes offer a blend of comfort and style for everyday use. With a versatile design, they are suitable for various casual occasions, providing a trendy and relaxed look.",
        price = 29.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-shoes/Pampi%20Shoes/1.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Pampi%20Shoes/2.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Pampi%20Shoes/3.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Pampi%20Shoes/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 22.13,
            "height" to 23.43,
            "depth" to 28.61
        ),
        stock = 36
    ), ProductJSON(
        title = "Red Shoes",
        description = "The Red Shoes make a bold statement with their vibrant red color. Whether for a party or a casual outing, these shoes add a pop of color and style to your wardrobe.",
        price = 34.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-shoes/Red%20Shoes/1.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Red%20Shoes/2.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Red%20Shoes/3.png", "https://cdn.dummyjson.com/products/images/womens-shoes/Red%20Shoes/4.png"
        ),
        category = "shoes",
        dimensions = mapOf(
            "width" to 29.75,
            "height" to 12.3,
            "depth" to 26.41
        ),
        stock = 53
    ), ProductJSON(
        title = "IWC Ingenieur Automatic Steel",
        description = "The IWC Ingenieur Automatic Steel watch is a durable and sophisticated timepiece. With a stainless steel case and automatic movement, it combines precision and style for watch enthusiasts.",
        price = 4999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-watches/IWC%20Ingenieur%20Automatic%20Steel/1.png", "https://cdn.dummyjson.com/products/images/womens-watches/IWC%20Ingenieur%20Automatic%20Steel/2.png", "https://cdn.dummyjson.com/products/images/womens-watches/IWC%20Ingenieur%20Automatic%20Steel/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 12.27,
            "height" to 5.91,
            "depth" to 8.71
        ),
        stock = 85
    ), ProductJSON(
        title = "Rolex Cellini Moonphase",
        description = "The Rolex Cellini Moonphase watch is a masterpiece of horology. Featuring a moon phase complication, it showcases the craftsmanship and elegance that Rolex is renowned for.",
        price = 15999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-watches/Rolex%20Cellini%20Moonphase/1.png", "https://cdn.dummyjson.com/products/images/womens-watches/Rolex%20Cellini%20Moonphase/2.png", "https://cdn.dummyjson.com/products/images/womens-watches/Rolex%20Cellini%20Moonphase/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 22.54,
            "height" to 20.15,
            "depth" to 25.37
        ),
        stock = 66
    ), ProductJSON(
        title = "Rolex Datejust Women",
        description = "The Rolex Datejust Women's watch is an iconic timepiece designed for women. With a timeless design and a date complication, it offers both elegance and functionality.",
        price = 10999.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-watches/Rolex%20Datejust%20Women/1.png", "https://cdn.dummyjson.com/products/images/womens-watches/Rolex%20Datejust%20Women/2.png", "https://cdn.dummyjson.com/products/images/womens-watches/Rolex%20Datejust%20Women/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 14.53,
            "height" to 29.73,
            "depth" to 10.22
        ),
        stock = 31
    ), ProductJSON(
        title = "Watch Gold for Women",
        description = "The Gold Women's Watch is a stunning accessory that combines luxury and style. Featuring a gold-plated case and a chic design, it adds a touch of glamour to any outfit.",
        price = 799.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-watches/Watch%20Gold%20for%20Women/1.png", "https://cdn.dummyjson.com/products/images/womens-watches/Watch%20Gold%20for%20Women/2.png", "https://cdn.dummyjson.com/products/images/womens-watches/Watch%20Gold%20for%20Women/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 5.9,
            "height" to 13.64,
            "depth" to 23.65
        ),
        stock = 94
    ), ProductJSON(
        title = "Women's Wrist Watch",
        description = "The Women's Wrist Watch is a versatile and fashionable timepiece for everyday wear. With a comfortable strap and a simple yet elegant design, it complements various styles.",
        price = 129.99,
        images = listOf(
            "https://cdn.dummyjson.com/products/images/womens-watches/Women's%20Wrist%20Watch/1.png", "https://cdn.dummyjson.com/products/images/womens-watches/Women's%20Wrist%20Watch/2.png", "https://cdn.dummyjson.com/products/images/womens-watches/Women's%20Wrist%20Watch/3.png"
        ),
        category = "watches",
        dimensions = mapOf(
            "width" to 24.74,
            "height" to 25.89,
            "depth" to 8.18
        ),
        stock = 55
    )
)