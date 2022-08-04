package org.example.kotlinWorkshop.kotlin.lesson02

class AABasicIf {
    fun whoIsBigger(first: Int, second: Int) {
        if (first > second) {
            println("first is bigger")
        } else if (first == second) {
            println("Numbers are equal")
        } else {
            println("second is bigger")
        }
    }
}