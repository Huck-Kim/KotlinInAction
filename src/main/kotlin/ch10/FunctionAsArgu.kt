package io.crevolika.ch10

fun twoThree(operation: (Int, Int) -> Int ) {
    val result = operation(2, 3)
    println("result: $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (element in this@filter) {
            if (predicate(element)) {
                append(element)
            }
        }
    }
}


fun main() {
    twoThree(fun(a: Int, b: Int): Int {
        return a + b
    })

    twoThree({ a, b -> a * b })

    println( "Hu3323ck Kim123213".filter { it in '0'..'9' || it ==' '})


}