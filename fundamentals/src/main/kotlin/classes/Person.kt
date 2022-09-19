package classes

class Person(
    val name: String = "",
    val age: Int = 0,
) {
    var email: String = ""
    var nameLength: Int = 0
    init {
        println("Inside Init Block")
        nameLength = name.length
    }
    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0,
    // khi viết this(_name, _age) thì kotlin sẽ hiểu tự gán cho bằng name và age
    ): this(_name, _age) {
        email = _email
    }
    fun action() {
        println("Walking")
    }
}

class Item() {
    var name: String = ""
    var price: Double = 0.0
    get(){
        println("Inside Getter")
        return field
    }
    set(value) {
        if(value >= 0.0) {
            println("Inside Setter")
            field = value
        }else {
            throw IllegalArgumentException("Negative Price is not Allowed!")
        }
    }

    constructor(_name: String): this() {
        name = _name
    }
}

fun main() {
    val person = Person("dotieuthien", 25)
    person.action()
    println("Name: ${person.name} and the age is: ${person.age}")

    val person2 = Person(_email = "dotieuthien9997@gmail.com", "dotieuthien", 25)
    println("Name: ${person2.name} and the age is: ${person2.age} and the email is ${person2.email} " +
            "and the nameLength is ${person2.nameLength}")

    val item = Item("Iphone")
    println("Item name is: ${item.name}")
    item.name = "Iphone 14"
    println("Item name is: ${item.name}")
    item.price = 10.0
    println(item.price)
}