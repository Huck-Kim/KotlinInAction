package io.crevolika.ch6


val arrays = Array<String>(26) { i -> ('a' + i).toString() }

fun main(args: Array<String>) {
    arrays.forEachIndexed() { i, a -> println("$i : ${a}") }
}