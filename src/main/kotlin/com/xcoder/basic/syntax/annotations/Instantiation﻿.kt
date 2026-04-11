package com.xcoder.basic.syntax.annotations

annotation class InfoMarker(val info: String)

fun processInfo(marker: InfoMarker): Unit = TODO()

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        processInfo(getAnnotationReflective(args))
    } else {
        processInfo(InfoMarker("default"))
    }
}

fun getAnnotationReflective(args: Array<String>): InfoMarker {
    TODO("Not yet implemented")
}
