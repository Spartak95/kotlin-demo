package com.xcoder.basic.syntax.overiew.loop

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    // or
    println()

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}