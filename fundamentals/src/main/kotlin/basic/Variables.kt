package basic

fun main() {
    // immutable variable
    val name: String = "thien"
    //name = "khoi"
    println(name)

    // mutable variable
    var fullname : String = "dotieuthien"
    println(fullname)
    fullname = "dotieukhoi"
    println(fullname)

    //val salary = 1000L
    val salary = 1000
    println(salary)

    val course = "kotlin course"
    println("course : $course and the course length is ${course.length}")

    val multiline = "ABC \n DEF"
    println(multiline)

    val multiline1 = """
        ABC
        DEF
    """.trimIndent()
    println(multiline1)
}