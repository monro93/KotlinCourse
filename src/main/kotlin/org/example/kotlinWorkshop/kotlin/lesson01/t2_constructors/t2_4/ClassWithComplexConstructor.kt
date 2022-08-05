package org.example.kotlinWorkshop.kotlin.lesson01.t2_constructors.t2_4

class ClassWithComplexConstructor(
    property1: Int,
    var property2: String
) {
    val propertyAttribute: Int

    init {
        this.propertyAttribute = property1 + 5
    }
}