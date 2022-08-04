package org.example.kotlinWorkshop.kotlin.lesson02

class BAWhen {
    fun printAOn123Bon4AndCOn569OrXOtherwiseNormal(number: Int) {
        when (number) {
            1, 2, 3 -> println("A")
            4 -> println("B")
            5, 6, 9 -> println("C")
            else -> println("X")
        }
    }

    fun printAOn123Bon4AndCOn569OrXOtherwiseWithRanges(number: Int) {
        when (number) {
            in 1..3 -> println("A")
            4 -> println("B")
            5, 6, 9 -> println("C")
            else -> println("X")
        }
    }

    fun printAOOn123Bon4AndCOOn569OrXOOtherwiseAsExpression(number: Int) {
        println(
            when (number) {
                in 1.. 3 -> "A"
                4 -> "B"
                5, 6, 9 -> "C"
                else -> "X"
            }
        )
    }
}