package org.example.kotlinWorkshop.kotlin.lesson01.t4_inheritance.t4_3

fun main() {
    val aChild = InheritanceChild(0, "something")

    if(aChild is InheritanceChild) {
        println("I'm a DCInheritanceChild")
    }

    if(aChild is InheritanceOpenClass) {
        println("I'm a DCInheritanceOpenClass")
    }

    //Let's get fancy

    if(aChild is Any) {
        println("I'm Any")
    }

    if(aChild == null) {
        println("I'm null")
    }

    if(aChild is Nothing) {
        println("I'm Nothing")
    }

    //Nulls
    if(null is Any) {
        println("Null is Any")
    }

    if(null is Nothing) {
        println("Null is Nothing")
    }

    //void function
    val value = voidFunction()
    if(value is Nothing) {
        println("Value is Nothing")
    }

    if(value is Unit) {
        println("Value is Unit")
    }

    //Nothing else

    //val value2 = voidFunctionException()
    //val value3 = nothingFunctionException()
}

fun voidFunction() {

}

fun voidFunctionException() {
    throw Exception()
}

fun nothingFunctionException(): Nothing {
    throw Exception()
}