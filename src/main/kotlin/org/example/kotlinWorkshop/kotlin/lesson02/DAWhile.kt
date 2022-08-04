package org.example.kotlinWorkshop.kotlin.lesson02

class DAWhile {
    fun whileLoop() {
        var x = 5
        while (x > 0) {
            println(x)
            x--
        }
    }


    fun doWhileLoop() {
        var x = 5
        do {
            println(x)
            x--
        } while (x > 0)
    }
}