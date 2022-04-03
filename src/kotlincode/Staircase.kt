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
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {

    for (i in 1..n) {
        for(j in 1..n-i){
            print(" ")
        }
        for(k in 1..i){
            print("#")
        }
        println()
    }


}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}