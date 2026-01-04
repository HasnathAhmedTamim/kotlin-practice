package com.tamimapps.helloworld

fun main() {

//   1
    val res1 = mybalance1(5, 10)
    println("from step 1 : $res1")

//    2

    mybalance2(5, 10) { myres ->
        println("from step 2 : $myres")
    }

//    3
    mybalance3(5, {
        println("from step 3 : $it")
    }, 10)

//    4
    mybalance4(5, temp = { myres, mystr ->
        println("from step 4 : $myres $mystr")

    }, 10)

//    5
    mybalance5(5, temp = { item, itemstr ->

        println("from step 5 : $item and $itemstr")
        item + 7

    }, 10)

}

//higher order function


//normal function

fun mybalance1(a: Int, b: Int): Int {
    return a + b
}

//higher order function as a last parameter lambda
fun mybalance2(
    a: Int, b: Int, temp: (Int) -> Unit

) {
    val r = a + b
    temp(r)
}

//higher order function before last parameter (lambda)
fun mybalance3(
    a: Int, temp: (Int) -> Unit, b: Int

) {
    val r = a + b
    temp(r)
}

///higher order function multiple parameter (lambda)
fun mybalance4(
    a: Int, temp: (Int, String) -> Unit, b: Int

) {
    val r = a + b
    temp(r, "hi from mybalance4")
}

///higher order function multiple parameter with no Unit (lambda)
fun mybalance5(
    a: Int, temp: (Int, String) -> Int, b: Int

) {
    val r = a + b
    val nonUnit = temp(r, "hi from mybalance4")

    println("from non unit function $nonUnit")
}