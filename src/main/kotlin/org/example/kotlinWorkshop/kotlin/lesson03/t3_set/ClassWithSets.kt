package org.example.kotlinWorkshop.kotlin.lesson03.t3_set

class ClassWithSets() {
    val immutableSet: Set<String> = setOf("hi", "hello")
    val mutableSet: MutableSet<String> = mutableSetOf("hi", "hello")

    init {
        mutableSet.add("hi");
        //do not exist
        //immutableSet.add("hi");
    }

}