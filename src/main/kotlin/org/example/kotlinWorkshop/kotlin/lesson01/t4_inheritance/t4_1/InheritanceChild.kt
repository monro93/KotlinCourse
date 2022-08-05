package org.example.kotlinWorkshop.kotlin.lesson01.t4_inheritance.t4_1

class InheritanceChild(property1: Int, val property2: String): InheritanceParent(property1) {
    override fun getAnString(): String {
        return property2
    }
}