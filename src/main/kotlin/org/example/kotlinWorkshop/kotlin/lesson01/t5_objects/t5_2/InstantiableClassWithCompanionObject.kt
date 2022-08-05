package org.example.kotlinWorkshop.kotlin.lesson01.t5_objects.t5_2

class InstantiableClassWithCompanionObject(
    val property1: Int
) {
    companion object {
        const val AN_STRING = "an_string"

        fun someStaticMethod() {}
    }
}