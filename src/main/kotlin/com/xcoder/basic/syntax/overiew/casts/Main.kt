package com.xcoder.basic.syntax.overiew.casts

fun main() {
    println(getStringLength(123))
    println(getStringLength("abc"))
    println(getStringLength(listOf(1, 2, 3)))

    println()

    println(getStringLengthAnother(123))
    println(getStringLengthAnother("abc"))
    println(getStringLengthAnother(listOf(1, 2, 3)))

    println()

    println(getStringLengthYetAnother(123))
    println(getStringLengthYetAnother("abc"))
    println(getStringLengthYetAnother(listOf(1, 2, 3)))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 'obj' is automatically cast to 'String' in this branch
        return obj.length
    }

    // 'obj' is still of type 'Any' outside the type-checked branch
    return null
}

fun getStringLengthAnother(obj: Any): Int? {
    if (obj !is String) return null
    // 'obj' is automatically cast to 'String' is this branch
    return obj.length
}

fun getStringLengthYetAnother(obj: Any): Int? {
    // 'obj' is automatically cast to 'String' on the right-hand side of
    if (obj is String && obj.length >= 0) {
        return obj.length
    }

    return null
}