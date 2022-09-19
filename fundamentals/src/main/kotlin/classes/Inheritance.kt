package classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    var isLoggedOut: Boolean = true
    open fun login(){
        println("Inside user login")
    }
}

class Student(name: String): User(name) {
    override var isLoggedIn: Boolean = false
    companion object {
        val numOfEnrolledCourses = 10
        fun country() = "Vietnam"
    }
    override fun login() {
        println("Inside student login")
    }

    fun callSuperLogin() {
        println("Logged in in super is: ${super.isLoggedIn}")
        println("Logged out in super is: ${super.isLoggedOut}")
        super.login()
    }
}
class Instructor(name: String): User(name)

fun main() {
    val student = Student("dotieuthien")
    println("Name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in value is: ${student.isLoggedIn}")
    student.isLoggedOut = false
    println("Logged out value is: ${student.isLoggedOut}")

    val country = Student.country()
    val numOfEnrolledCourses = Student.numOfEnrolledCourses
    println("$country $numOfEnrolledCourses")

    student.callSuperLogin()
}