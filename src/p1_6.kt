fun main(){
    println("Enter number1")
    val number1=readLine()!!.toInt()
    println("Enter number2")
    val number2=readLine()!!.toInt()
    var result:Int
    result = number1 + number2
    println("number1 + number2 = $result")
    result = number1 - number2
    println("number1 - number2 = $result")
    result = number1 * number2
    println("number1 * number2 = $result")
    result = number1 / number2
    println("number1 / number2 = $result")
    result = number1 % number2
    println("number1 % number2 = $result")
} 