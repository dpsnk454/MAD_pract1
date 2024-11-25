fun main() {
    val intArray = intArrayOf(7, 3, 5, 2)
    println("Original array: ${intArray.joinToString(", ")}")
    println("Array with joinToString: ${intArray.joinToString(", ")}")
    println("Array with contentToString: ${intArray.contentToString()}")
    println("Array with Arrays.deepToString: ${java.util.Arrays.deepToString(arrayOf(intArray))}")
    println("Array elements using range:")
    intArray.indices.forEach { i -> println("Element at index $i: ${intArray[i]}") }
    println("Array elements using downTo:")
    (intArray.size - 1 downTo 0).forEach { i -> println("Element at index $i: ${intArray[i]}") }
    println("Array elements using until:")
    (0 until intArray.size).forEach { i -> println("Element at index $i: ${intArray[i]}") }
    val sortedArrayBuiltIn = intArray.sortedArray()
    println("Sorted array using built-in function: ${sortedArrayBuiltIn.joinToString(", ")}")
    val arrayToSort = intArray.copyOf()
    bubbleSort(arrayToSort)
    println("Sorted array without built-in function: ${arrayToSort.joinToString(", ")}")
}
fun bubbleSort(array: IntArray) {
    for (i in array.indices) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                array[j] = array[j].also { array[j] = array[j + 1]; array[j + 1] = it }
            }
        }
    }
}