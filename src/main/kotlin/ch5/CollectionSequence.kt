package io.crevolika.ch5
import java.io.File
//data class PersonCh5(val name: String, val age: Int)


fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
//    val constClass = ::PersonCh5
//    val personCh5 = listOf(constClass("Alice", 29), constClass("Huck", 48))
//
//    println(personCh5.filter { p -> p.age > 30 }.map { it.name })
//
//    println(personCh5.filter {
//        val oldestPerson= personCh5.maxByOrNull(PersonCh5::age)
//        it.age == oldestPerson?.age
//
//    }.map { it.age } )
//
//        val names = listOf("Joe", "Mary", "Jamie")
//        val ages = listOf(22, 31, 22, 44, 0)
//        println(names.zip(ages))
//// [(Joe, 22), (Mary, 31), (Jamie, 22)] #1
//        println(names.zip(ages) { name, age -> Person(name, age) })
//// [Person(name=Joe, age=22), Person(name=Mary, age=31),
//// Person(name=Jamie, age=22)]
    val file = File(" ")
    println(file.isInsideHiddenDirectory())
// true

}

