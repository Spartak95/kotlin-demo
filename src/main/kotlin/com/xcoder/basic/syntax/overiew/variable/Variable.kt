package com.xcoder.basic.syntax.overiew.variable

// You can declare variables at the top level
val PI = 3.14
var u = 0

fun main() {
    // Declares the variable x and initialize it with the value 5
    val x: Int = 5
    // 5

    // Declares the variable y and initialize it with the value of 5
    var y: Int = 5
    // Reassigns a new value of 6 to the variable y
    y += 1
    // 6

    // Declares the variable z with the value of 5; `Int` type is inferred
    val z = 5
    // 5

    // Initializes the variable k at the moment of declaration; type is not required
    val k = 5
    // Declares the variable r without initialization; type is required
    val r: Int
    // Initializes the variable r after declaration
    r = 3
    // 5
    // 3
}