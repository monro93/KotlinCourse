package org.example.kotlinWorkshop.kotlin.lesson01.t1_hello_world

fun main () {
    //No "new" keyword
    var instance : ClassEmptyConstructor = ClassEmptyConstructor()
    //We do not need to define the type when the compiler can know it, like in this case
    val instance2 = ClassEmptyConstructor()

    instance2.sayHello()
}