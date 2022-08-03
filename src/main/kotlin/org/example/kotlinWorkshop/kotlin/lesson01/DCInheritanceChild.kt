package org.example.kotlinWorkshop.kotlin.lesson01

class DCInheritanceChild(property1: Int, val property2: String): DCInheritanceOpenClass(property1) {
    override fun getAnString(): String {
        return "This is implemented"
    }
}