package org.example.kotlinWorkshop.kotlin.lesson01

fun main() {
    val dataClass1 = CADataClass(0, "something")
    val dataClass2 = CADataClass(intProperty = 1, stringProperty = "seomthing else")
    val dataClass3 = CADataClass(stringProperty = "seomthing else again", intProperty = 2)
    val dataClass4 = dataClass3.copy(intProperty = 3)
    val dataClass5 = dataClass3.copy(intProperty = 2)

    println(dataClass1)
    println(dataClass2)
    println(dataClass3)
    println(dataClass4)
    println(dataClass5)
    println("is dataClass1 equals to dataClass2? -> ${dataClass1 == dataClass2}")
    println("is dataClass3 equals to dataClass5? -> ${dataClass3 == dataClass5}")
}