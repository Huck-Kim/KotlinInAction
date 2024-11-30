package io.crevolika.ch6

import java.io.File
import java.util.*


fun <T> copyElement(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source ){
        target.add(item)
    }

//    source.forEach {
//        target.add(it)
//    }
}

object CollectionUtils {
    fun uppercaseAll(items: MutableList<String>): List<String> {
        for (i in items.indices) {
            items[i] = items[i].uppercase()
        }
        return items
    }
}

internal interface FileContentProcessor {
    fun processContents(
        path: File?,
        binaryContents: ByteArray?,
        textContents: List<String?>?,
    )
}

//fun printUppercase(list: List<String>) {
//    val resultList = mutableListOf<String>()
//    CollectionUtils
//
//}
fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list.toMutableList()))
    println(list.first())
}

fun main(args: Array<String>) {
    for (item in args.indices) {
        println("Argument args[item] = ${args[item]}")
    }
    val source = listOf(1, 2, 3)
    val target = arrayListOf( 7,4,5,6,6,9 )
    val list = listOf("1", "2", "3")
    copyElement(source, target)
    println(target)

    printInUppercase(list)

    val letter = CharArray(26) { i -> ('a' + i) }
    val letter2 = Array(26) { i -> ('a' + i).toString() }
    val letter3 = IntArray(26)

    //println(letter.toList())
//    println(letter.joinToString(""))
    println(letter)
    println(letter2)
    println(letter2.joinToString(""))
    println(letter3.joinToString(""))

    val strings = listOf("a", "b", "c", null,"d")
    println("%S/%S/%S/%S/%s".format(*strings.toTypedArray()))
}

