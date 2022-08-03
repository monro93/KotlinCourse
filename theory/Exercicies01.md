# Exercises 01 - Variables and Classes

## E1
Convert the classes that start as E1 in [this package](../src/main/java/org/example/kotlinWorkshop/java/exercises01) to kotlin in the following package:  [this package](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/exercises01). Do not use the ide auto-convert. Once they are migrated, remove the imports in this file  [E1main.kt](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/exercises01/E1main.kt) and ensure that the code works

## E2
Create the following classes in Kotlin in [this package](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/exercises01): 
* E2Country - Enum with the values ES, AR, TR, SA
* E2Name - With the parameters firstName String, lastName String and secondLastName String optional
* E2Person - abstract with a E2Name and an abstract method called `greet` that will return a String
* E2Employee - extends from E2Person with E2Country. Not abstract. When it greets, should say its full name
* E2Developer - extends from E2Employee with programming language as String. when it greet should say its full name and their favorite language

Once they are created, uncomment the file [E2main.kt](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/exercises01/E2main.kt) and  finish the code adding yourself to make it work.

---

[Go to lesson](./Lesson01.md) - [Next Lesson](./Lesson02.md) - [Back to main](../README.md)