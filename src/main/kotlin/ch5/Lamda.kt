package ch5BasicKotlin

import ch3BasicKotlin.joinToString

data class Person5(val name: String, val age: Int)


fun main() {
    val people = listOf(Person5("Alice", 29), Person5("Bob", 31))
    println(people.maxByOrNull() { it: Person5 -> it.age })
    println(people.maxByOrNull({ p: Person5 -> p.age }) )
// Person(name=Bob, age=31)


    println(people.maxByOrNull(Person5::age))
    println(people.maxByOrNull({ p: Person5 -> p.age }))

    println(people.joinToString(" ") { it.name })
}
