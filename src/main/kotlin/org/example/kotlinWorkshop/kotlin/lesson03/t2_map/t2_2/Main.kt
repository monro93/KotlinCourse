package org.example.kotlinWorkshop.kotlin.lesson03.t2_map.t2_2

fun main() {
    val classWithMutableMap = ClassWithMutableMap(
        mutableMapOf("some_key" to "some_value", "another_key" to "another_value")
    )

    classWithMutableMap.map.put("another_new_key", "new_value")
    classWithMutableMap.map["new_key"] = "new_value"

    println(classWithMutableMap.map)
}