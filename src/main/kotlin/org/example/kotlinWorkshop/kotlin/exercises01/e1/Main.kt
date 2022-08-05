package org.example.kotlinWorkshop.kotlin.exercises01.e1

import org.example.kotlinWorkshop.java.exercises01.e1.Dog
import org.example.kotlinWorkshop.java.exercises01.e1.DogIdentification
import org.example.kotlinWorkshop.java.exercises01.e1.DogRace

fun main(){
    val dog = Dog(
        DogIdentification(
            "Rufus",
            3
        ),
        DogRace.GOLDEN_RETRIEVER,
        "Owner"
    )

    println(dog)
    dog.makeSound()
    dog.dig()
    dog.owner = "NewOwner"
    println(dog)
}