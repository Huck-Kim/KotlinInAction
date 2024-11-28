package io.crevolika.ch5

data class PersonCh5(val name: String, val age: Int)

fun main() {
    val constClass = ::PersonCh5
    val personCh5 = listOf(constClass("Alice", 29), constClass("Huck", 48))

    println(personCh5.filter({ p: PersonCh5 -> p.age > 30 }).map({ p: PersonCh5 -> p.name }))
}

