package org.example.kotlinWorkshop.kotlin.lesson01.t2_constructors.t2_3

fun main() {
    val someObjectBC = ClassWith2ConstructorsV2(30, "property2")
    println("prop1: ${someObjectBC.property1} prop2: ${someObjectBC.property2}")

    val someObjectBC2 = ClassWith2ConstructorsV2(property2 = "anotherProperty2")
    println("prop1: ${someObjectBC2.property1}  prop2: ${someObjectBC2.property2}")

}