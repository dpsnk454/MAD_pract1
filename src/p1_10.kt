class Car(
    val type: String,
    val model: String,
    private val originalPrice: Double,
    var owner: String,
    var milesDriven: Int
) {
    fun getCarInfo(): String {
        return "Type: $type, Model: $model, Owner: $owner, Miles Driven: $milesDriven"
    }

    fun getOriginalPrice(): Double {
        return originalPrice
    }

    fun getCurrentPrice(): Double {
        val depreciation = (milesDriven / 10000.0) * 0.1 * originalPrice
        return originalPrice - depreciation
    }

    fun displayCarInfo() {
        println(getCarInfo())
        println("Original Price: $${getOriginalPrice()}")
        println("Current Price: $${getCurrentPrice()}")
    }
}

fun main() {
    val car1 = Car("BMW", "2018", 100000.0, "Aarvi", 105)
    car1.displayCarInfo()

    val car2 = Car("BMW", "2019", 400000.0, "Bindu", 20)
    car2.displayCarInfo()

    val car3 = Car("Toyota", "2017", 1080000.0, "Priyanshi", 100)
    car3.displayCarInfo()

    val car4 = Car("Maruti", "2020", 4000000.0, "Drasti", 200)
    car4.displayCarInfo()
}
