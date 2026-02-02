package com.xcoder.conditional.expressions

fun main() {
    val maxOf = maxOf(1, 2)
    println(maxOf)
    val anotherMaxOf = anotherMaxOf(1, 2)
    println(anotherMaxOf)
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun anotherMaxOf(a: Int, b: Int) = if (a > b) a else b