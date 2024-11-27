package io.crevolika.ch5

class Ref<T>(var value: T)

fun main() {
    val counter = Ref(1)
    val inc = { counter.value++ }

    println(counter.value)
}
