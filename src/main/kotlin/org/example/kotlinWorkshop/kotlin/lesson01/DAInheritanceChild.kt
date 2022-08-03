package org.example.kotlinWorkshop.kotlin.lesson01

class DAInheritanceChild(property1: Int, val property2: String): DAInheritanceParent(property1) {
    override fun getAnString(): String {
        return property2
    }
}