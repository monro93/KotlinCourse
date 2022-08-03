package org.example.kotlinWorkshop.kotlin.lesson01

import org.example.kotlinWorkshop.java.lesson01.EASingleton

fun main() {
    //java singleton
    println(EASingleton.AN_STRING)
    EASingleton.someStaticMethod()
    //not allowed:
    //val eaSingleton = EASingleton()

    //kotlin object
    println(EAObjects.AN_STRING)
    EAObjects.someStaticMethod()
    //not allowed:
    //val eaObject = EAObjects()
}