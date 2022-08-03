package org.example.kotlinWorkshop.kotlin.lesson01

fun main() {
    val someObjectBB = BBClassWith2Constructors(30, "property2")
    println("prop1: ${someObjectBB.property1} prop2: ${someObjectBB.property2}")

    val someObjectBB2 = BBClassWith2Constructors("anotherProperty2")
    println("prop1: ${someObjectBB2.property1}  prop2: ${someObjectBB2.property2}")

}