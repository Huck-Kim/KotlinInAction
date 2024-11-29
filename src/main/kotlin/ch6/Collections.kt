package io.crevolika.ch6


fun <T> copyElement(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source ){
        target.add(item)
    }

//    source.forEach {
//        target.add(it)
//    }
}

fun main() {
    val source = listOf(1, 2, 3)
    val target = arrayListOf( 7,4,5,6,6,9 )

    copyElement(source, target)
    println(target)

}