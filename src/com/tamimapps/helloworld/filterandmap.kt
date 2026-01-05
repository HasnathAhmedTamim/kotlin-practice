package com.tamimapps.helloworld

fun main() {
    var a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//filter
    val filter = a.filter { i ->
        i % 2 == 0

    }
    println(filter)
//map
    var m = filter.map { i ->
        i * 2
    }
    println(m)
}