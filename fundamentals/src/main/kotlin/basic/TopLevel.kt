package basic
import basic.printName

val fullname = "dotieuthien"

fun main() {
    printName(fullname)
    val num = topLevelFunction()
    println("Num is: $num")
}

fun topLevelFunction(): Int {
    return (0..100).random()
}