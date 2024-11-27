package ch3BasicKotlin

//infix fun Any.to(other: Any) = Pair(this, other)

const val url = "/Users/hk/kotlin-book/chapter.doc"

fun parsePath(path:String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")


    println("Dir: $directory, name: $fileName, extension: $extension")
}

fun parsePathRegex(path:String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val match = regex.matchEntire(path)
    if(match != null) {
        val (directory, fileName, extension) = match.destructured
        println("Dir: $directory, name: $fileName, extension: $extension")
    }

}

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    val (index, value) = 1 to "one"
    println(value)
    println(map[index])

    parsePath(url)
    parsePathRegex(url)
}