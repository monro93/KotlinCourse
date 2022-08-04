package org.example.kotlinWorkshop.kotlin.lesson02

class ABIfAsExpression {
    var value: Int? = null

    fun assignBigger(first: Int, second: Int) {
        value = if (first > second) {
            first
        } else {
            second
        }
    }
}