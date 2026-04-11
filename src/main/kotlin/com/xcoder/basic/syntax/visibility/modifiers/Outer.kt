package com.xcoder.basic.syntax.visibility.modifiers

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}