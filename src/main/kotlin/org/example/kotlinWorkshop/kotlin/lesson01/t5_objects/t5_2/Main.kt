package org.example.kotlinWorkshop.kotlin.lesson01.t5_objects.t5_2

import org.example.kotlinWorkshop.java.lesson01.t5_objects.t5_2.InstantiableClassWithStatic


fun main() {
    //java class with static const and method
    println(InstantiableClassWithStatic.AN_STRING)
    InstantiableClassWithStatic.someStaticMethod()
    //allowed:
    val javaInstance = InstantiableClassWithStatic(23)
    //you cannot call the static properties in a non-static way:
    //javaInstance.AN_STRING
    //javaInstance.someStaticMethod()

    //kotlin class with companion object
    println(InstantiableClassWithCompanionObject.AN_STRING)
    InstantiableClassWithCompanionObject.someStaticMethod()
    //allowed:
    val kotlinInstance = InstantiableClassWithCompanionObject(12)
    //you cannot call the static properties in a non-static way:
    //kotlinInstance.AN_STRING
    //kotlinInstance.someStaticMethod()
}