package org.example.kotlinWorkshop.kotlin.lesson01.t3_data_class

fun main() {
    val dataClass1 = DataClass(0, "something")
    val dataClass2 = DataClass(intProperty = 1, stringProperty = "something else")
    val dataClass3 = DataClass(stringProperty = "something else again", intProperty = 2)
    val dataClass4 = dataClass3.copy(intProperty = 3) // we modify the value of dataClass2
    val dataClass5 = dataClass4.copy(intProperty = 2) // we modify the value of dataClass4 to be the same as 2 again

    println(dataClass1)
    println(dataClass2)
    println(dataClass3)
    println(dataClass4)
    println(dataClass5)
    println("is dataClass1 equals to dataClass2? -> ${dataClass1 == dataClass2}")
    println("is dataClass3 equals to dataClass5? -> ${dataClass3 == dataClass5}")
}