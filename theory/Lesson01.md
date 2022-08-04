# Lesson 01 - Variables and Classes

## A - Hello world of OOP
Creating the simplest class in Kotlin is very similar to java, the only difference is that the visibility in Kotlin is public by default. We don't need to define the return type of the method when it is void(Unit in Kotlin), and the print is less verbose than in Java.  

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/AAClassEmptyConstructor.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/AAClassEmptyConstructor.java) 

## B - Constructors
### BA - Default constructor
Normally when you create a class you will want some attributes and a constructor to initialise the properties and some getter and setter to access and modify that properties.
Java does nothing for us, it expects that we define everything everytime that we define a new type. Kotlin helps us to make the process easier, shorter and faster.
So in Kotlin we can define the attributes, the getters, setters and constructor in the same line, to do that it uses 2 keywords when defining a property `var` and `val`.      

If a variable is defined with `var`it means that is modifiable, so if we use this keyword on the constructor, it will generate a getter and setter for us in order to access and modify the attribute. If we use `val` instead, we are saying that variable is not modifiable, so when we do that Kotlin will generate only a getter for us.

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/BAClassWithConstructor.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/BAClassWithConstructor.java)

### BB - 2 constructors
Apart from the default constructor, that usually is the one with all the arguments, we can have more constructors with more or less arguments. In Kotlin, we will do that with the reserved keyword `constructor`, and we can call the main constructor with a colon `:` and `this()` with the desired arguments.

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/BBClassWith2Constructors.kt) - [Main](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/BBMain.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/BBClassWith2Constructors.java)

### BC - Named parameters
But if what we want is a constructor with less parameters than the original one with some default value, we can take advantage of another feature of Kotlin and is what we call `named arguments` this can be used in any method call including the constructor. What this allows us is to define the order of the arguments in a call as we please, so if one argument has a default value, we just don't need to add it to the call.  

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/BCClassWith2ConstructorsV2.kt) - [Main](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/BCMain.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/BBClassWith2Constructors.java)

### BD - Complex constructors
Sometimes we want that in the constructor we do some modification of a property before we save it as an attribute. This can be done in Kotlin with the `init` method, is will be called just before the assignation and you will have available all the variables that you send in the constructor. Notice that in this example the property1 does not have neither `val` or `var` this is becasue we don't want this argument to be mapped to an attribute, is just a variable sent to the constructor.   

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/BDClassWithComplexConstructor.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/BDClassWithComplexConstructor.java)

## C - Data Class
There is a special type of class in Kotlin that is called `data class` , it represents the classic POJO's of java, and it simplifies the creation of this type of class adding automatically an `equals` method, implementing `Serializable` an adding the `toString`. It adds another method called `copy` that using the named parameters that we saw on BC, allows us to create another copy of the object with only the modified properties that we want. In Java classically this has been a bit annoying to create with the constructor, getter, equals, toString, etc, but there are some stuff that help us too, like the `@Value` annotation of `lombok` library or the new type added in Java 17 getting inspired from Kotlin that is called `record`.

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/CADataClass.kt) - [Main](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/CAMain.kt) - [Java (Classic)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/CADataClass.java) - [Java (@Value)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/CADataClassV2.java) - [Java (Record)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/CADataClassV3.java)

## D - Inheritance
### DA - Abstract class
Abstract classes on Kotlin are very similar to Java. We add the modifier `abstract` before the class and on the abstract methods.   
When we extend the class we use a colon `:` instead of `extends` in Java. We must specify the `override` keyword on the method definition that we are overriding.  

[Kotlin (parent)](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DAInheritanceParent.kt) - [Kotlin (child)](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DAInheritanceChild.kt) - [Java (parent)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/DAInheritanceParent.java) - [Java (child)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/DAInheritanceChild.java)

### DB - Interfaces
As you can see the interfaces are very similar to java, we define the `interface` keyword instead of `class` and all the methods are abstract by default. You cannot see that in the example that I've prepared, but the methods of an interface in Kotlin CAN have implementation, this is different to Java. The implementation will be used as default if you don't override the method.   
Another difference is when we implement the interface, Kotlin does not make distinction, so we use the colon `:` again instead of the `implements` keyword.  

[Kotlin (interface)](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DBInheritanceInterface.kt) - [Kotlin (child)](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DBInheritanceChild.kt) - [Java (interface)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/DBInheritanceInterface.java) - [Java (child)](../src/main/java/org/example/kotlinWorkshop/java/lesson01/DBInheritanceChild.java)

### DC - Final and open classes
There is something that I didn't tell you until now because I did not want to confuse you, but now is time: classes in Kotlin are final by default. What does that mean? A final class is a class that cannot be extended. This is controversial on the development community, and I have my opinion, but I let you formulate yours, you can check the explanation of the two sides on [Martin Fowler webpage](https://martinfowler.com/bliki/Seal.html).
Regardless of which side you're on, Kotlin is closed by default, so if you want to extend a class that is not abstract or an interface, you have to add the modifier `open` to the class and to the method that you are planning to override.    

[Kotlin (open class)](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DCInheritanceOpenClass.kt) - [Kotlin (child)](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DCInheritanceChild.kt)

I want to take advantage on the fact that now we know the bases of extension (there is an advanced topic about generics that I want to see further) to introduce to some concepts:
* Do you remember Data classes (C)?, ok so this classes cannot be extended, even if you try to put the `open` modifier
* The `is` keyword is used in Kotlin in a similar way to `instanceof` in Java
* The `Any` type is the parent of all the types in Kotlin and is used in places that typically you would use `Object` in Java
* In Kotlin all the types are objects. Even more that in Java. Here the primitive types does not exist, do you want an int? use the object Int; same for double, long, etc. Even the void is an object (Unit). There is one exception tho, and this is the `null` this is the only thing that will return you false when you check if `is Any`
* There is a special Type in Kotlin named `Nothing`. This type is used when an execution does not finish, and you explicitly want to mark it, so for instance when a method throws an exception or when you have an infinite loop. This type cannot be instantiated in any way.

[Main](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/DCMain.kt)

## E - Objects
### EA - Singletons
I have to be honest with you, I don't like that they use the name Objects to refer to this, that's why I let that to the end of the classes' lesson. Objects in Kotlin are singletons, or static classes as you may know from another languages. You cannot create an instance of an object, it has to be called statically always. They are used to define constants, static variables and methods. The difference between a constant and a static variable in kotlin is that the constants are store in the ROM and have to be available on compile time and the static variables are stored in the RAM, and they could store runtime values.

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/EAObjects.kt) - [Main](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/EAMain.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/EASingleton.java)

### EB - Static components inside an instantiable class
Usually you don't have singletons (they even do not exist as a type in Java), you will have classes that maybe have a constant private or public because you don't to repeat the value, or you want to give semantic to the constant, this is allowed in Kotlin too. To archive that you have to create a `companion object` inside your class. After you will call it exactly in the same way as if the class that contains the companion was an object itself (this is true only from Kotlin to Kotlin, if you are calling a Kotlin class with a companion object from any other language from the JVM, you will have to pass per the companion object, for instance: `EBInstantiableClassWithStatic.Companion.AN_STRING`).

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/EAObjects.kt) - [Main](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/EAMain.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/EASingleton.java)

## F - Enums
Enums are pretty similar to Java, the most remarkable difference is that they are considered classes in Kotlin. They are called in the same way as Objects.  

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson01/FEnum.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson01/FEnum.java)

---

[Go to exercises](./Exercises01.md) - [Next Lesson](./Lesson02.md) - [Back to main](../README.md)