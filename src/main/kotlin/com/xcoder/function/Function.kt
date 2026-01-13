package com.xcoder.function

fun main() {
    println(sum(1, 2))
    println(multiply(1, 2))
    printSum(1, 2)
    printMultiply(1, 2)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printMultiply(a: Int, b: Int) {
    println("multiply of $a and $b is ${a * b}")
}