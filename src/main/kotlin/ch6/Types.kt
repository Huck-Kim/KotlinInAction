package io.crevolika.ch6



fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}
data class PersonCh7(val name: String,
                  val age: Int? = null) {
    fun isOlderThan(other: PersonCh7): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

interface Processor<T> {
    fun process() : T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        println("NoResultProcessor.process()")
    }
}

//fun fail(message: String) : Nothing {
//    throw IllegalStateException(message)
//}

fun readNumbers(text: String): List<Int?> {
    val result = mutableListOf<Int?>()
    for(line in text.lineSequence()) {
        val intOrNull = line.toIntOrNull()
        result.add(intOrNull)
    }
    return result
}

fun readNumbers2(text: String): List<Int?> =
    text.lineSequence().map { it.toIntOrNull() }.toList()

fun main() {
    showProgress(146)
    println(PersonCh7("Huck Kim", 48).isOlderThan(PersonCh7("HH",47)))
    println(PersonCh7("Huck Kim", 48).isOlderThan(PersonCh7("BeforeBorn")))
    val noResultProcessor = NoResultProcessor()

    println(noResultProcessor.process())
//    fail("fail occured")

    println(readNumbers2("""
        |12345554
        |333
        |3
        |a3
        |33
        |434
        |34
        |34
        |34
        |43
        |42
        |s
        |ad
        |adf
        |asdf
        |asdf
        |asf
        |12
        |sadf
        |a3
    """.trimMargin()))

//    val address = company.address ?: fail("No address")
//    println(address.city)

}
