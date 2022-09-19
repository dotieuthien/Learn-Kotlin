package classes

object Authen {
    fun authenticate(userName: String, pasword: String) {
        println("User authenticate for user name: $userName")
    }
}

fun main() {
    Authen.authenticate("dotieuthien", "abcdef")
}