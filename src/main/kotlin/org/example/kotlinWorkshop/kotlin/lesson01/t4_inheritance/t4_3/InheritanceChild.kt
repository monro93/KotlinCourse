package org.example.kotlinWorkshop.kotlin.lesson01.t4_inheritance.t4_3

class InheritanceChild(property1: Int, val property2: String): InheritanceOpenClass(property1) {
    override fun getAnString(): String {
        return "This is implemented"
    }
}