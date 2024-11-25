fun main()
{
    println("Enter month:")
    val month=readLine()!!.toString()
    when(month){
        "1" -> println("January")
        "2" -> println("Febuaray")
        "3" -> println("March")
        "4" -> println("April")
        "5" -> println("May")
        "6" -> println("June")
        "7" -> println("July")
        "8" -> println("August")
        else -> println("enter prpoer number")
    }
}