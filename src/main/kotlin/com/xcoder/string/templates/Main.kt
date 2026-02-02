package com.xcoder.string.templates

fun main() {
    var a = 1
    // simple name is template
    val s1 = "a is $a"
    println(s1)

    a = 2
    // arbitrary expression in template
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)
}