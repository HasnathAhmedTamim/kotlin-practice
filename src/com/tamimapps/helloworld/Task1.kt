package com.tamimapps.helloworld

fun main() {
    run mytaskReturn@{

        do {
            print("Enter Your Number (or type exit): ")
            val firstNumber = readLine()?.trim() ?: continue

            if (firstNumber.equals("exit", true)) {
                println("Program exited.")
                return@mytaskReturn
            }

            print("Enter your operator (+ - * /): ")
            val operator = readLine()?.trim() ?: continue

            print("Enter your Second Number: ")
            val secondNumber = readLine()?.trim() ?: continue

            val num1 = firstNumber.toDoubleOrNull()
            val num2 = secondNumber.toDoubleOrNull()

            if (num1 == null || num2 == null) {
                println("Invalid number input")
                continue
            }

            val result = when (operator) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> {
                    if (num2 == 0.0) {
                        println("Cannot divide by zero")
                        continue
                    }
                    num1 / num2
                }

                else -> {
                    println("Invalid operator")
                    continue
                }
            }

            println("Result: $result")

        } while (true)
    }
}
