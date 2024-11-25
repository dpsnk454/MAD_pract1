fun main() {
    var a = 5
    var b = 10
    println("Original values: a = $a, b = $b")
    swapWithoutThirdVariable(a, b)
    swapWithThirdVariable(a, b)
}
fun swapWithoutThirdVariable(a: Int, b: Int) {
    var x = a
    var y = b
    println("\nSwapping without third variable:")
    println("Before Swap: a = $x, b = $y")
    x = x + y
    y = x - y
    x = x - y
    println("After Swap: a = $x, b = $y")
}
fun swapWithThirdVariable(a: Int, b: Int) {
    var x = a
    var y = b
    println("\nSwapping with third variable:")
    println("Before Swap: a = $x, b = $y")
    val temp = x
    x = y
    y = temp
    println("After Swap: a = $x, b = $y")
} 