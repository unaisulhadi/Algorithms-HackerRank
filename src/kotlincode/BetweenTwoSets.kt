package kotlincode

import kotlin.math.abs

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

    var result = 0
    var multiple = 0
    var lcm = a[0]
    var gcd = b[0]

    for(item in a){
        lcm = getLCM(lcm,item)
    }

    for(item in b){
        gcd = getGCD(gcd,item)
    }

    while (multiple <= gcd){
        multiple += lcm
        if(gcd % multiple == 0){
            result++
        }

    }
    return result

}

fun getGCD(n1: Int, n2: Int): Int {
    return if (n2 == 0) {
        n1
    } else getGCD(n2, n1 % n2)
}

fun getLCM(n1: Int, n2: Int): Int {
    return if (n1 == 0 || n2 == 0) 0 else {
        val gcd = getGCD(n1, n2)
        abs(n1 * n2) / gcd
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}