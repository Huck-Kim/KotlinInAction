package io.crevolika.ch5

fun postponeComputation(delay: Int, computation: Runnable?) {
    computation?.run()
}

fun interface IntCondition {
    fun check(i: Int): Boolean
    fun checkString(s: String) = check(s.toInt())
    fun checkChar(c: Char) = check(c.digitToInt())
}
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}
fun checkCondition(i: Any, condition: IntCondition) : Boolean {
    when (i) {
        is Int -> return condition.check(i)
        is String -> return condition.checkString(i)
        is Char -> return condition.checkChar(i)
        else -> return run { println("IllegalArgumentException: Not Int, Char, String")
                false }
    }
}
fun interface StringConsumer {
    fun consume(s: String)
}
fun consumeHello(t: StringConsumer) {
    t.consume("Hello")
}
fun consumeHelloFunctional(t: (String) -> Unit) {
    t("Hello")
}
fun main(args: Array<String>) {
    postponeComputation(100) {println("I am out")}
    postponeComputation(100, {println("I am out")})

    createAllDoneRunnable().run()

    checkCondition(1) { it % 2 != 0 }
// true
    val isOdd = IntCondition { it % 2 != 0 }
    println(checkCondition(1, isOdd))
    println(checkCondition('2', isOdd))
    println(checkCondition("4", isOdd))
    println(checkCondition(1.9F, isOdd))
    println(consumeHelloFunctional { "Huck" })
// true
}