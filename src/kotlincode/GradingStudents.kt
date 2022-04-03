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
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    var fiveMultiples = mutableListOf<Int>()
    for (i in 8..20) {
        fiveMultiples.add(i * 5)
    }
    println(fiveMultiples)

    var newGrades = mutableListOf<Int>()

    for (grade in grades) {

        if (grade < 38) {
            println("$grade FAILED")
            newGrades.add(grade)
        }

        if (fiveMultiples.contains(grade)) {
            println("$grade NO CHANGE")
            newGrades.add(grade)
        } else {

            var nextMultipleOfFive = 0;
            for(multiple in fiveMultiples){
                if(grade < multiple){
                    continue
                }
                if(grade > multiple){
                    nextMultipleOfFive = multiple;
                    break
                }
            }

            if(nextMultipleOfFive - grade < 3){
                newGrades.add(nextMultipleOfFive)
            }else{
                newGrades.add(grade)
            }

        }

    }

    return newGrades.toTypedArray();
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
