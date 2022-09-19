package basic

import java.time.LocalDate

fun main() {
    printName("dotieuthien")
    val result = addition1(1, 2)
    println(result)

    printPersonDetails("dotieuthien", "dotieuthien9997@gmail.com")
}

fun addition(x: Int, y: Int): Int {
    //TODO("Not yet implemented")
    return x + y
}

fun addition1(x: Int, y: Int): Int = x + y

fun printName(name: String) {
    println("Name is: $name")
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and the dob is $dob")
}