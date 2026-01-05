package com.tamimapps.helloworld

fun main() {

    println("----- Immutable List -----")
    val immutableNames = listOf("Tamim", "Ahmed", "Rahim")
    println(immutableNames)

    // immutableNames.add("Karim") ❌ not allowed

    println("\n----- Mutable List -----")
    val mutableNames = mutableListOf("Tamim", "Ahmed")
    mutableNames.add("Rahim")
    mutableNames.remove("Ahmed")
    println(mutableNames)

    println("\n----- Immutable Set -----")
    val immutableNumbers = setOf(1, 2, 3, 3, 4)
    println(immutableNumbers) // duplicate auto removed

    println("\n----- Mutable Set -----")
    val mutableNumbers = mutableSetOf(1, 2)
    mutableNumbers.add(2) // ignored
    mutableNumbers.add(3)
    println(mutableNumbers)

    println("\n----- Immutable Map -----")
    val immutableUsers = mapOf(
        1 to "Tamim",
        2 to "Ahmed"
    )
    println(immutableUsers)

    println("\n----- Mutable Map -----")
    val mutableUsers = mutableMapOf(
        1 to "Tamim"
    )
    mutableUsers[2] = "Rahim"
    mutableUsers.remove(1)
    println(mutableUsers)

    println("\n----- Common Collection Functions -----")

    immutableNames.forEach {
        println(it)
    }

    val nameLengths = immutableNames.map { it.length }
    println("Name Lengths: $nameLengths")

    val longNames = immutableNames.filter { it.length > 4 }
    println("Long Names: $longNames")

    val foundName = immutableNames.find { it == "Tamim" }
    println("Found Name: $foundName")

    val containsAhmed = immutableNames.contains("Ahmed")
    println("Contains Ahmed: $containsAhmed")

    println("\n----- Mutable Collection Operations -----")
    val editNames = mutableListOf("Tamim", "Ahmed")
    editNames.add("Karim")
    editNames.remove("Tamim")
    println(editNames)

    editNames.clear()
    println("After Clear: $editNames")

    println("\n----- Real Interview Example -----")
    val students = mutableListOf("Tamim", "Ahmed", "Tamim")
    val uniqueStudents = students.toSet()
    println("Unique Students: $uniqueStudents")
}
