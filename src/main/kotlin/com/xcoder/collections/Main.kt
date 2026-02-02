package com.xcoder.collections

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    println()

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println()

    // Use lambda expressions to filter and mp collections:
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}