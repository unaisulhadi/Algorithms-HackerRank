package kotlincode

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var min:Long = arr[0].toLong()
    var max:Long = min
    var sum:Long = min

    for (i in 1 until arr.size) {
        sum += arr[i].toLong()
        if (arr[i] < min) {
            min = arr[i].toLong()
        }
        if (arr[i] > max) {
            max = arr[i].toLong()
        }
    }

    println("${sum - max} ${sum - min}")


}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
