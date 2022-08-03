package org.example.kotlinWorkshop.kotlin.lesson01

fun main() {
    val someObjectBC = BCClassWith2ConstructorsV2(30, "property2")
    println("prop1: ${someObjectBC.property1} prop2: ${someObjectBC.property2}")

    val someObjectBC2 = BCClassWith2ConstructorsV2(property2 = "anotherProperty2")
    println("prop1: ${someObjectBC2.property1}  prop2: ${someObjectBC2.property2}")

}