package org.example.kotlinWorkshop.kotlin.lesson02

class CBForEach {
    fun printAll(list: List<String?>) {
        for (item in list) {
            println(item)
        }
    }

    fun printAllFunctional(list: List<String?>) {
        list.forEach { println(it) }
    }

    fun printAllFunctional2(list: List<String?>) {
        list.forEach(::println)
    }
}