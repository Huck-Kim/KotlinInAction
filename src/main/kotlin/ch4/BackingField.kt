package ch4

class User5(val name:String) {
    var address: String = "UnKnown"
    set(value) {
        println("""
            Address was changed for $name:
            "$field" -> "$value". 
            """.trimIndent()
        )
        field = value
    }
}

class LengthCounter {
    var counter: Int = 0
        get() {
            return field++
        }
    private set

    fun addWord(word: String) {
        counter += word.length
    }
}
fun main() {
    User5("Huck.kim").address = "Kim"
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Ksdfsdfsdfsdfim")
    println(lengthCounter.counter)
}