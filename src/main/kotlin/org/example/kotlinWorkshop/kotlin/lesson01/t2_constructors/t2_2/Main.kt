package org.example.kotlinWorkshop.kotlin.lesson01.t2_constructors.t2_2

fun main() {
    val someObjectBB = ClassWith2Constructors(30, "property2")
    println("prop1: ${someObjectBB.property1} prop2: ${someObjectBB.property2}")

    val someObjectBB2 = ClassWith2Constructors("anotherProperty2")
    println("prop1: ${someObjectBB2.property1}  prop2: ${someObjectBB2.property2}")

}