package org.example.kotlinWorkshop.kotlin.lesson02

class ACTernaryOperator {
    var value: Int? = null

    fun assignBigger(first: Int, second: Int) {
        value = if (first > second) first else second
    }
}