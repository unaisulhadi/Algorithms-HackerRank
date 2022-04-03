package kotlincode

fun main() {

    val fruits = listOf("Apple", "Mango", "Banana", "Cherry")

    for (index in 0..fruits.size - 1) {
        val fruit = fruits[index]
        println("$index: $fruit")
    }

    for (index in 0 until fruits.size) {
        val fruit = fruits[index]
        println("$index: $fruit")
    }

    for (index in 0 until fruits.lastIndex) {
        val fruit = fruits[index]
        println("$index: $fruit")
    }

    for (index in fruits.indices) {
        val fruit = fruits[index]
        println("$index: $fruit")
    }

    for ((index, fruit) in fruits.withIndex()) {
        println("$index: $fruit")
    }

    fruits.forEachIndexed { index, fruit ->
        println("$index: $fruit")
    }


    //OUTPUT
//    0: Apple
//    1: Mango
//    2: Banana
//    3: Cherry


}

data class Item(
    val id: Int,
    var selectionStatus: Boolean
){
    override fun toString(): String {
        return "$id : $selectionStatus"
    }
}