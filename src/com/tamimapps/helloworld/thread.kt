package com.tamimapps.helloworld

import kotlin.concurrent.thread

fun main() {
    println("Thread is ${Thread.currentThread().name}")
    println("Clicked switch")

    Thread(object : Runnable {
        override fun run() {
            Thread.sleep(1000)
            println("Light running")
        }
    }).start()
    Thread.sleep(2000)
    println("Done")

    thread {
        println("Thread is ${Thread.currentThread().name}")
        println("Clicked switch")
    }


}