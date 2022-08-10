package org.example.kotlinWorkshop.kotlin.lesson03.t4_functional

fun main() {
    val list = listOf("apple", "pear", "peach", "banana", "watermelon")

    println("get the ones starting by p:")
    println(list.filter { it.startsWith("p") })

    println("get the last one starting by p:")
    println(list.last { it.startsWith("p") })

    println("get the first starting by y or null:")
    println(list.firstOrNull{it.startsWith("y")})

    println("New list with 'I like ' as a prefix")
    println(list.map { "I like $it" })

    println("New list with the length of the words")
    println(list.map { it.length })

    println("New map with the length of the words and the name")
    println(list.associateWith { it.length })
}