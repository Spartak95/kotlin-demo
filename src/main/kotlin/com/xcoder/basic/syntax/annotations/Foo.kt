package com.xcoder.basic.syntax.annotations

@Fancy
@Special("example")
class Foo {
    @Fancy
    fun baz(@Fancy foo: Int): Int {
        return (@Fancy 1)
    }
}