# Lesson 02 - Conditionals and Loops
## A - if
### AA - Basic if
The basic if, else-if, else statement works exactly the same than in Java (and most of the languages)

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/AABasicIf.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/AABasicIf.java)

### AB - If as an expression
If in Kotlin can be used as an expression (as all the conditionals, we will see it in a while), that means that we can assign a value directly to an if or return it in a function
[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/ABIfAsExpression.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/ABIfAsExpression.java)

### AC - Ternary Operator
Kotlin does not have ternary operator, it has been requested in the community and maybe they add it in the future, but for now it does not have it. But we can take advantage of the if as an expression to use it as it was an uglier ternary

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/ACTernaryOperator.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/ACTernaryOperator.java)

## B - When
`When` on Kotlin is like a switch with vitamins. You can do the same that you can do on a switch but is more lax on the condition, you can apply different type of conditions at the same time. Java historically was very ugly, but luckily it improved to a better way to read it. `When` can be used as an expression, like the if.

I introduced here the ranges, but let's see them better at the following example.

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/BAWhen.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/BASwitch.java)

## C - For
### CA - Iterative for
The for loop in kotlin works with ranges. You iterate over all the elements of a collection always, this is a bit different from Java where you iterate until the condition is false.   
There are two multiple easy ways to define ranges in Kotlin (In all the examples Y > X):
* With two dots: `X..Y` where X and Y are numbers, this range will contain the two numbers. 
* With the until keyword: `X until Y` this will contain X but not Y
* With the downTo keyword: `Y downTo X` this will contain Y and X it will iterate downwards, from the bigger to the smaller
* We can add the step modifier to any of the previous to make jumps bigger than 1: `X..Y step 2`, `Y downTo X step -3`

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/CAFor.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/CAFor.java)

### CB - For each
The for each in Kotlin is the same as the for, remember that before we were iterating on ranges that they are collection in their own too.  
We have the functional forEach too in Kotlin and I will use it to introduce you to functional Kotlin.     
As you can see, one of the first difference with Java is that we don't need to define the variable that we are applying the function over, by default Kotlin creates a variable with the name `it` that contains the iterated element. Another difference is that the function is outside the argument of the function, is enveloped with curvy brackets instead `{}`.   
We can send directly a function that has one parameter, and it will be called automatically, similar to Java. 

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/CBForEach.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/CBForEach.java)

## D - While
The while and do-while works like any other language, and they don't have anything in special. You can use the `break` and `continue` statements too.

[Kotlin](../src/main/kotlin/org/example/kotlinWorkshop/kotlin/lesson02/DAWhile.kt) - [Java](../src/main/java/org/example/kotlinWorkshop/java/lesson02/DAWhile.java)


---
[Go to exercises](./Exercises02.md) - [Next Lesson](./Lesson03.md) - [Previous Lesson](./Lesson01.md) - [Back to main](../README.md)