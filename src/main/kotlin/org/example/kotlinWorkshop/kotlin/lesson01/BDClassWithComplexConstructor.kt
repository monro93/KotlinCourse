package org.example.kotlinWorkshop.kotlin.lesson01

class BDClassWithComplexConstructor(
    property1: Int,
    var property2: String
) {
    val property1: Int

    init {
        this.property1 = property1 + 5
    }
}