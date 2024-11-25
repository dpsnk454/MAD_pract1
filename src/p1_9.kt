fun findLargestElement(array: IntArray): Int {
    var largest = array[0]
    for (element in array) {
        if (element > largest) {
            largest = element
        }
    }
    return largest
}
fun main() {
    val numbers = intArrayOf(100, 8, 20, 13)
    val largestElement = findLargestElement(numbers)
    println("Array: ${numbers.joinToString(", ")}")
    println("Largest Element: $largestElement")
}