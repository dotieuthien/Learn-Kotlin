package classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT,
)


enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING,
}

fun main() {
    val course = Course(1, "Kotlin", "ABC")
    println(course)

    val course1 = Course(1, "Kotlin", "ABC")
    println(course1)

    println("Checking Object Equality: ${course == course1}")

    val course2 = course1.copy(3)
    print(course2)

    val marketingCourse = Course(
        1,
        "Facebook Ads",
        "dotieuthien",
        CourseCategory.MARKETING)
    print(marketingCourse)
}