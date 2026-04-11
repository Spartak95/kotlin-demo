package com.xcoder.basic.syntax.annotations

/*
  Allowed parameter types are:
  - Types that correspond to Java primitive types(Int, Long etc.)
  - Strings
  - Classes
  - Enums
  - Other annotations
  - Arrays of the types listed above
  Annotation parameters cannot have nullable types, because the JVM does not support
  storing null as a value of an annotation attribute.
 */
annotation class Special(
    val why: String
)
