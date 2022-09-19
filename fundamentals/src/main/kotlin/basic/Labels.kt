package basic

fun main() {
    for (i in 1..5){
        println("i: $i")
        if (i == 3) break
    }

    label()

    for (i in 1..5){
        println("i in return: $i")
        if (i == 3) return
    }
}

fun label() {
    loop@ for (i in 1..5){
        println("i in label: $i")
        if (i == 3) break@loop
    }
}