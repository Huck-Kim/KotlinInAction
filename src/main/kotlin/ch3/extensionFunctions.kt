package ch3BasicKotlin

fun String.lastChar(): Char = this.get(this.length - 1)

fun main() {
    val str = " I am Huck Kim"
    println(str.lastChar())
}
