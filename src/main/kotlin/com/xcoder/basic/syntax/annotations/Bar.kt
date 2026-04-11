package com.xcoder.basic.syntax.annotations

@Deprecated(
    "This function is deprecated, use === instead",
    replaceWith = ReplaceWith("this === other")
)
@Ann2(intValue = 1, stringValue = "abc")
@AnnWithArrayValue("abc", "foo", "bar")
@AnnWithArrayMethod(names = ["abc", "foo", "bar"])
class Bar {
}