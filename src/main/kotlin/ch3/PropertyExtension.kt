package ch3BasicKotlin

import kotlin.text.StringBuilder

val String.lastChar: Char
    get() = this.get(length - 1)

var StringBuilder.lastChar: Char
    get() = this.get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }


fun main() {
    val args = arrayOf("1".."50")
    val inputList = listOf("args:", *args)
    println(inputList)
    val sb = StringBuilder("Kotlin?")
    println(sb.lastChar)
    sb.lastChar = '!'
    println(sb)

}