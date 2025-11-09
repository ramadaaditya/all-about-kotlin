package org.example.codewars

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return if (flowerA % 2 == 0 && flowerB % 2 == 1) {
        true
    } else if (flowerA % 2 == 1 && flowerB % 2 == 0) {
        false
    } else {
        false
    }
}


fun main() {
    println(loveFun(1, 2))
    println(1 % 2)
}