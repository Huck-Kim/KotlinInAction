package io.crevolika.ch10

//import ch3BasicKotlin.joinToString

//fun processTheAnswer(f: Function1<Int, Int>) {
//    println(f.invoke(10))
//}

//fun interface processTheAnswer {
//    fun println(function: Function1<Int, Int>)
//}
//
//val pTest = object : processTheAnswer {
//    override fun println(function: Function1<Int, Int>) {
//        println(function(4))
//    }
//}


fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = " ",
    transform: ((T) -> String)? = null
): String {
    val result: StringBuilder = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        //result.append(element)

        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()

}
 fun foo(callback: (() -> Unit)?) {
// ...
    callback?.invoke()
}

fun interface ProcessTheAnswer {
    fun hi(f: Function1<Int, Int>): Int
}

val pTest = ProcessTheAnswer { 4 }


fun main() {
    val number = 0

    io.crevolika.ch10.pTest.hi { num -> num + 1 }
    ProcessTheAnswer( { num -> num.invoke(3) })
    println(listOf("HuckKim","HHJeon").joinToString(separator = ", ",transform = { it.uppercase() }))
}

