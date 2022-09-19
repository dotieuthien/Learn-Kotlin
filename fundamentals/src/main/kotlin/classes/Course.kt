package classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
)

fun main() {
    val course = Course(1, "Kotlin", "ABC")
    println(course)

    val course1 = Course(1, "Kotlin", "ABC")
    println(course1)

    println("Checking Object Equality: ${course == course1}")

    val course2 = course1.copy(3)
    print(course2)
}