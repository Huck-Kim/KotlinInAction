package ch2_Basic_Kotiln
import ch2_Basic_Kotiln.Color.*
//import sun.jvm.hotspot.oops.RetData

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    val rgb = r * 256 + g * 256 + b
    fun printColor() =
        println("$this rgb value is $rgb")

    }

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "R"
        ORANGE ->  "O"
        YELLOW ->  "Y"
        GREEN ->  "G"
        BLUE ->  "B"
        INDIGO ->  "I"
        VIOLET ->  "V"
    }

fun mesureColor() = INDIGO
fun getWarmthFromSensor() : String {
    return when(val color = mesureColor()) {
        RED, ORANGE,YELLOW -> "warm red ${color.r}"
        GREEN -> "neutral green ${color.g}"
        BLUE, INDIGO, VIOLET -> "cold blue ${color.b}"
    }
}

fun mix(c1:Color, c2:Color) = when {
    (c1 == RED && c2 == YELLOW) ||
            (c1 == YELLOW && c2 == RED) -> "Orange"
    (c1 == YELLOW && c2 == BLUE) ||
            (c1 == BLUE && c2 == YELLOW) -> "Green"
    (c1  == BLUE && c2 == VIOLET) ||
            (c1 == VIOLET && c2 == BLUE) -> "Indigo"
    else -> throw Exception("Dirty color")
}

fun main() {
    println(BLUE.rgb)
    INDIGO.printColor()
    println(getMnemonic(INDIGO))
    println(getWarmthFromSensor())
    println(mix(BLUE,VIOLET))
    // println(mix(INDIGO,VIOLET))
}
