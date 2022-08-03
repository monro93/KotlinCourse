package org.example.kotlinWorkshop.kotlin.lesson01

class BBClassWith2Constructors(
    val property1: Int,
    var property2: String
) {

    constructor(property2: String) : this(0, property2)
}