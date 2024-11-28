package io.crevolika.ch5

fun alphabet1()= with(StringBuilder()) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }

fun alphabet2()= StringBuilder().apply {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")

    }.toString()

fun alphabet3() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

val fibonacci = buildList {
    addAll(listOf(1, 1, 2))
    add(3)
    add(index = 0, element = 3)
}
val shouldAdd = true

val fruits = buildSet {
    add("Apple")
    if(shouldAdd) {
        addAll(listOf("Apple", "Banana", "Cherry"))
    }}
val medals = buildMap<String, Int> {
    put("Gold", 1)
    putAll(listOf("Silver" to 2, "Bronze" to 3))
}

fun alphabet4()= StringBuilder().also {
    for (letter in 'A'..'Z') {
        it.append(letter)
    }
    it.append("\nNow I know the alphabet!")

}.toString()

fun main() {
    println(alphabet1())
    println(alphabet2())
    println(alphabet3())
    println("fibonacci : $fibonacci, fruits: $fruits, medals: $medals")
    println(alphabet4())

    val upperCaseFruits = mutableListOf<String>()
    val reversedLongFruits = fruits
        .map {it.uppercase()}
        .also {upperCaseFruits.addAll(it)}
        .filter {it.length > 5 }
        .also {println(it)}
        .reversed()
    println(upperCaseFruits)
    println(reversedLongFruits)

}