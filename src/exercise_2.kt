open class Product(val name: String, var quantity: Int, var amountPerQuantity: Double) {
    constructor(name: String, quantity: Int) : this(name, quantity, 0.0) {
    }
    override fun toString(): String {
        return "Product(name='$name', quantity=$quantity, amountPerQuantity=$amountPerQuantity)"
    }
}
class Laptop(name: String, quantity: Int, amountPerQuantity: Double, val cpuName: String, val ramSize:
Int, val hddSize: Int) : Product(name, quantity, amountPerQuantity) {
    constructor(name: String, quantity: Int, cpuName: String, ramSize: Int, hddSize: Int) : this(name,
        quantity, 0.0, cpuName, ramSize, hddSize) {
    }
    override fun toString(): String {
        return "${super.toString()}, Laptop(cpuName='$cpuName', ramSize=$ramSize, hddSize=$hddSize)"
        
    }
}
fun main() {
    val laptops = arrayListOf(
        Laptop("Dell XPS", 10, 1500.0, "Intel i7", 16, 512),
        Laptop("MacBook Pro", 5, 2500.0, "Apple M1", 16, 1024),
        Laptop("HP Spectre", 8, 1200.0, "Intel i5", 8, 256),
        Laptop("Lenovo ThinkPad", 12, 1000.0, "Intel i7", 32, 1024),
        Laptop("Asus ZenBook", 7, 1400.0, "Intel i7", 16, 512)
    )
    laptops.forEach { println(it) }
}