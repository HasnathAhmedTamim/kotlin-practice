package com.tamimapps.helloworld

fun main() {

    // Task 1
    val countries = listOf("Bangladesh", "India", "Japan", "USA", "UK")
    countries.forEach { println(it) }

// Task 2
    val fruits = mutableListOf("Apple", "Banana")
    fruits.add("Mango")
    fruits.remove("Banana")
    println(fruits)

// Task 3
    val nums = setOf(1, 2, 2, 3, 3, 4)
    println(nums)

// Task 4
    val users = mutableMapOf(1 to "Tamim", 2 to "Ahmed")
    users[3] = "Rahim"
    users.remove(1)
    users.forEach { (k, v) -> println("$k -> $v") }

// Task 5
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)

// Task 6
    val names = listOf("Tamim", "Ahmed", "Rahim")
    val lengths = names.map { it.length }
    println(lengths)

// Task 7
    val result = names.find { it == "Ahmed" } ?: "Not found"
    println(result)

// Task 8
    val students = listOf("Tamim", "Ahmed", "Tamim", "Rahim")
    println(students.toSet())

// Task 9
    val scores = mutableListOf(45, 60, 30, 80, 90)
    scores.removeIf { it < 50 }
    println(scores)

// Task 10
    val immutable = listOf(1, 2, 3)
    val mutable = immutable.toMutableList()
    println(mutable.filter {
        it % 2 == 0
    })
}