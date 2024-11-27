package ch2_Basic_Kotiln

fun fizzBuzz(n: Int): String = when {
    n % 15 == 0 -> "FizzBuzz "
    n % 3 == 0 -> "Fizz "
    n % 5 == 0 -> "Buzz "
    else -> "$n "
}

fun main() {
    val numberOfFizzBuzzes = 100
    for (i in numberOfFizzBuzzes downTo 1 step 2 ) {
        print(fizzBuzz(i))
    }
}

