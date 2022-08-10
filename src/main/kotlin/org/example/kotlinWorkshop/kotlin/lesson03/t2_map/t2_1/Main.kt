package org.example.kotlinWorkshop.kotlin.lesson03.t2_map.t2_1

fun main() {
    val classWithImmutableMap = ClassWithImmutableMap(
        mapOf("some_key" to "some_value", "another_key" to "another_value")
    )

    //do not exist
    //classWithImmutableMap.map.put("another_new_key", "new_value")
    //classWithImmutableMap.map.["another_new_key"] =  "new_value"

    println(classWithImmutableMap.map)
    println(classWithImmutableMap.map.get("some_key"))
    println(classWithImmutableMap.map["another_key"])
}