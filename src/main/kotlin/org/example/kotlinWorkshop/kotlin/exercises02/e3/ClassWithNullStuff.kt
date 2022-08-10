package org.example.kotlinWorkshop.kotlin.exercises02.e3

class ClassWithNullStuff(
    child: Child?
) {
    data class Child(
        val name: String,
        val preferredName: String?
    )

    fun getChildName(): String {
        return ""
    }
}