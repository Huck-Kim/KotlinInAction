package io.crevolika.ch6

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
    operator fun minus(other: Point) = Point(x - other.x, y - other.y)
    operator fun times(scalar: Int) = Point(x * scalar, y * scalar)
    operator fun div(scalar: Int) = Point(x / scalar, y / scalar)
    operator fun <T> MutableCollection<T>.plusAssign(element: T) {
        this.add(element)
    }
    override fun equals (other: Any?): Boolean {
        if(this === other) return true
        if(other !is Point) return false
        else
            return other.x == this.x && other.y == this.y
    }

    operator fun unaryMinus() = Point(-x, -y)
    operator fun unaryPlus() = Point(+x, +y)
    operator fun not() = Point(-x, -y)
    operator fun inc() = Point(x+1, y+1)
    operator fun dec() = Point(x-1, y+1)
 }
fun main(args: Array<String>) {
    var p1 = Point(10, 20)
    var p2 = Point(10, 40)
    var p3 = mutableListOf<Point>()
    p3 += p2
   // println(p1.plus(p2))
    println(p3)
    println(p1 - p2)
    p1.unaryMinus()
    println(p1.unaryMinus())
    println(-p1)

    println("(unary p1)+p1 =  ${p3}")
    println(p1.unaryPlus())
   // println(p1.minu
    // s(p2))

    println(p1.equals(p2))
    println(null.equals(null))
    println(p1.equals(null))
}


