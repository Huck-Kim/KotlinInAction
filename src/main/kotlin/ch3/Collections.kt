@file:JvmName("Collects")
package ch3BasicKotlin

import java.util.*
import kotlin.math.E
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min

val set = setOf("1","3","4","5","6","7","8","9","9","8")
val list = listOf("10","11","12","13","14","15")

val map: Map<Int,String> = mutableMapOf(1 to "Ten", 2 to "Eleven", 3 to "Twelve", 4 to "Thirteen", 5 to "fourtenn")

//fun <T> joinToString(
//    collection: Collection<T>,
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String = ""
//): String {
//    val result = StringBuilder(prefix)
//    for ((index, element) in collection.withIndex()) { if (index > 0) result.append(separator)
//        result.append(element)
//    }
//    result.append(postfix)
//    return result.toString()
//}


fun <T> Collection<T>.joinToString(
separator: String = ", ",
prefix: String = "",
postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)


fun main() {
    println(set)
    println(list)
    println(map.values)

    println(set.javaClass)
// class java.util.LinkedHashSet
        println(list.javaClass)

// class java.util.Arrays$ArrayList
        println(map.javaClass)
// class java.util.LinkedHashMap
    println( set)
    val number = setOf(1,2,3,4,5)
    println(number.sum())

    //joinToString(list, ",   ", "", "")
  //  println(list)
  //  joinToString(list)
  //  println(list)
// 1, 2, 3
    //println(joinToString(list,";: "))
    println(list.joinToString())
    println(min(PI, E))
    println(listOf("one", "two", "three", "four").join(" "))
// 1; 2; 3

}