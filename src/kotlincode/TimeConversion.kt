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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here

    val amPm = s.drop(8)
    val timeWithoutAmPm = s.dropLast(2)
    val splittedTime = timeWithoutAmPm.split(':')

    val hours = splittedTime[0]
    val mins = splittedTime[1]
    val seconds = splittedTime[2]

    println(hours+" "+mins+" "+seconds+" "+amPm)

    var newHour = hours.toInt().toTimeFormat()

    if (amPm == "AM" && hours.toInt() == 12) {
        newHour = (12 - hours.toInt()).toTimeFormat()
    } else if (amPm == "PM" && hours.toInt() < 12 ) {
        newHour = (12 + hours.toInt()).toTimeFormat()
    }

    return "$newHour:$mins:$seconds"
}

fun Int.toTimeFormat(): String {
    return if (this.toString().length == 1) {
        "0$this"
    } else {
        this.toString()
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
