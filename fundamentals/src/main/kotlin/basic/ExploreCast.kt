package basic

import classes.Course

fun main() {
    val course = Course(1, "Kotlin", "ABC")
    println(course)
    checkType(course)
    checkType("dotieuthien")

    castNumber(1.0)
}

fun checkType(type: Any) {
    when(type) {
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {
    when(any) {
        any as Double -> println("Value is Double")
    }
}