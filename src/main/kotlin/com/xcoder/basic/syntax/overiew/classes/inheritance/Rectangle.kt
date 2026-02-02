package com.xcoder.basic.syntax.overiew.classes.inheritance

class Rectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}