package org.example.kotlinWorkshop.kotlin.exercises01

import org.example.kotlinWorkshop.java.exercises01.E1Dog
import org.example.kotlinWorkshop.java.exercises01.E1DogIdentification
import org.example.kotlinWorkshop.java.exercises01.E1DogRace

fun main(){
    val dog = E1Dog(
        E1DogIdentification("Rufus", 3),
        E1DogRace.GOLDEN_RETRIEVER,
        "Owner"
    )

    println(dog)
    dog.makeSound()
    dog.dig()
    dog.owner = "NewOwner"
    println(dog)
}