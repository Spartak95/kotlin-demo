package com.xcoder.basic.syntax.visibility.modifiers

class SubClass: Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5 // 'b' is protected
    override val c = 7 // 'c' is internal
}