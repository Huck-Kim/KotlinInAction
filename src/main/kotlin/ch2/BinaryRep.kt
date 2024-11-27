package ch2_Basic_Kotiln

fun testWithIndex():MutableList<String> {
    val list = mutableListOf("112323","12321","2223")
    for((index, value) in list.withIndex()) {
        println("$index : $value")
    }
    return list
}

// check collection and membership
fun isLetter(ch: Char): Boolean {
    return ch in 'a'..'z' || ch in 'A'..'Z'
}

fun isNotDigit(c: Char): Boolean {
    return (c !in '0'..'9')
}

fun main() {
    val binaryReps = mutableMapOf<Char,String>()
    for(a in 'A'..'Z') {
        val binary = a.code.toString(radix = 2)
        //binaryReps[a] = binary
        binaryReps.put(a,binary)
    }
    for((letter, binary) in binaryReps) {
        println("$letter : $binary")
    }
    println(binaryReps)
    println(testWithIndex())

    println(isLetter('1'))
    println(isNotDigit('a'))
}