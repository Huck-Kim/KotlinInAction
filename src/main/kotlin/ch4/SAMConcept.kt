package ch4BasicKotlin

internal open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

internal class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated internal constructor(o: Outer) {
    // o.a, o.b are not visible
    val u = o.c
    val v = o.d
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

var i = 0
val isEven = IntPredicate { it % 2 == 0 }

fun main() {
    do {
        i++
        println(message = "Is $i even? - ${isEven.accept(i)}")
    } while (i < 100)
}