package basic

fun main() {
    val name = "Alex"
    var result = if(name.length == 4){
        println("Name is four characters")
        name
    } else{
       println("Name is not four characters")
        name
    }

    println("Result: $result")

    val position = 1
    val medal = if(position == 1){
        "GOLD"
    } else if(position == 2){
        "SILVER"
    } else if(position == 3){
        "BRONZE"
    } else{
        "NO MEDAL"
    }


    val medal1 = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal1)
    println(medal)
}