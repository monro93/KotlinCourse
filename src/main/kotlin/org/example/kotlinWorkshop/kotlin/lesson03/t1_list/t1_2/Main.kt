package org.example.kotlinWorkshop.kotlin.lesson03.t1_list.t1_2

fun main() {
    val classWithMutableList = ClassWithMutableList(mutableListOf("something"))

    //now we can add elements
    classWithMutableList.list.add("potato")

    println(classWithMutableList.list)
}