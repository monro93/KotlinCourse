package org.example.kotlinWorkshop.kotlin.lesson02.t5_null.t5_1

class NullChainOperator(private val anObject: AnObject?) {
    inner class AnObject(val name: String?)

    fun getAnObjectNameOrDefault(): String? {
        return anObject?.name
    }
}