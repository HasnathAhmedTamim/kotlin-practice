package com.tamimapps.helloworld

import kotlin.reflect.typeOf


fun main() {
    val myUserName: String = "Hasnath Ahmed"
    val myId: Int = 1010101
    var price: Double = 100.56

    val myPurchaseArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val mydoublePurchaseArray: DoubleArray = doubleArrayOf(30.45, 45.30)
    val allTpeArray: Array<Any> = arrayOf(false, 34.5f, "tamim")
    val number1: String = "11a"
    val number2: String = "22"

//    val covertNumberSum: Int = number1.toInt() + number2.toInt()
//    println(covertNumberSum)


    try {
        val sum = number1.toInt() + number2.toInt()
        println("Sum = $sum")
    } catch (e: NumberFormatException) {
        println("Conversion failed: Invalid number ${e.message}")
    }
    val a = 103
    val b = 1012

//    condition
//
//    val c: Int = if (a < b) {
//        val sum = a + b
//        sum
//    } else {
//        0   // must return an Int
//    }
//
//    println(c)


//    println(a == b)

//    println(allTpeArray.contentToString())
//    println("my purchase array is ${myPurchaseArray.contentToString()} and /n my double purchase array ${mydoublePurchaseArray.contentToString()}")
//    println("My username is $myUserName and ID is $myId")
//    println("My username is $price")

//   println("Hello World! This is my value that is :  ${args[0]} and second is ${args[1]}")


//    when

    var myData: Int = 391

    when (myData) {
//        multi branch
        100, 202 -> println("This is 100")
        101, 391 -> println("$myData is found")
        else -> println("$myData is not found")

    }
//range
    var number: Int = 40

    when (number) {
        in 1..5 -> println("range is low")
        in 6..10 -> println("range is high")
        else -> println("found $number in the range")

    }

//    statement / expression
    var lang: String = "Kotlin"

    val storeLang: String = when (lang) {
        "Kotlin" -> "Kotlin"
        "Java" -> "Java"
        else -> {
            "wrong"
        }
    }
    println(storeLang)

//    for in loop
    val countryList: Array<String> = arrayOf("Ban", "Eng", "Jap")

    for (i in countryList.indices) {
        println("$i country is ${countryList[i]}")
    }

//    for each loop

    val cusDatas: Array<Any> = arrayOf("c1", "c2", "c3")

    cusDatas.forEachIndexed { index, cusData -> println("$index is ${cusData}") }

//    break / continue / return

    val testDatas: Array<Any> = arrayOf("test1", "test2", "test3", "test4", "test5")

//    break
    run mytestdata@{
        testDatas.forEach {
            if (it == "test3") {
                return@mytestdata
            }
            println(it)
        }
    }

    val testDatas2 = arrayOf("t1", "t2", "t3", "t4", "t5")
//continue with two for each
    testDatas2.forEach myloop@{ outer ->

        testDatas2.forEach { inner ->
            if (outer == "t3") {
                return@myloop
            }
        }
//        if (it == "t3") {
//            return@forEach   // continue
//        }
        println(outer)
    }


}
