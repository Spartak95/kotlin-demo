package com.xcoder.basic.syntax.annotations

annotation class Deprecated(
    val message: String,
    val replaceWith: ReplaceWith = ReplaceWith(""),
)