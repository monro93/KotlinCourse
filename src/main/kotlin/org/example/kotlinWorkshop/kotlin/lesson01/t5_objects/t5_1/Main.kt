package org.example.kotlinWorkshop.kotlin.lesson01.t5_objects.t5_1

import org.example.kotlinWorkshop.java.lesson01.t5_objects.t5_1.StaticClass

fun main() {
    //java singleton
    println(StaticClass.AN_STRING)
    StaticClass.someStaticMethod()
    //not allowed:
    //val eaSingleton = EASingleton()

    //kotlin object
    println(Objects.AN_STRING)
    Objects.someStaticMethod()
    //not allowed:
    //val eaObject = EAObjects()
}