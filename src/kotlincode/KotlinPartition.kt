package kotlincode

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val (even, odd) = numbers.partition { it % 2 == 0 }

    println(even)
    println(odd)

    val new = numbers.groupBy { key -> key % 2 == 0 }

    val odds = new[false]
    val evens = new[true]

    println(odds)
    println(evens)

    println(new)

}