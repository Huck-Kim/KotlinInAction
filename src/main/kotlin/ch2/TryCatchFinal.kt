package ch2_Basic_Kotiln

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

//fun readNumber(reader: BufferedReader): Int? {
//    val line = reader.readLine()
//    reader.close()
//    return Integer.parseInt(line)
//}
fun main() {
    val reader = BufferedReader(StringReader("Not a number!"))
    readNumber(reader)
}