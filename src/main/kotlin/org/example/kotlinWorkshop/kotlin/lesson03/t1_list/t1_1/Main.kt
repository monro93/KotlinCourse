package org.example.kotlinWorkshop.kotlin.lesson03.t1_list.t1_1

fun main() {
    val classWithImmutableList = ClassWithImmutableList(listOf("something"))

    //method does not exist
    //classWithImmutableList.list.add("potato")

    println(classWithImmutableList.list)
}