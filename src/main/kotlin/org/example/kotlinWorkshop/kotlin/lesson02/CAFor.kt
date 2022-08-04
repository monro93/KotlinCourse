package org.example.kotlinWorkshop.kotlin.lesson02

class CAFor {
    fun printXTimes(toPrint: String?, times: Int) {
        for (i in 0 until times) {
            println(toPrint)
        }
    }

    fun printXTimesAlternative(toPrint: String?, times: Int) {
        for (i in 0..times - 1) {
            println(toPrint)
        }
    }
}
