package ch4BasicKotlin

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}
class Man(val name: String) {
    companion object : JSONFactory<Man> {
        override fun fromJSON(jsonText: String): Man = Man("Huck Kim")
    }
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T {
    return factory.fromJSON("""{"name": "Huck Kim"}""")
}

internal open class TalkativeButton {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")

}

internal open class SmallTalkativeButton : TalkativeButton() {
    private fun yell() = println("Let's talk!")
 }

//
//
//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}

class OuterClass {
    inner class Inner {
        fun getOuterReference(): OuterClass = this@OuterClass
    }
}

class User(val nickname: String)

fun main() {
    println(loadFromJSON(Man))
    println(Man.fromJSON("{\"name\":\"TH Kim\"}"))
//    TalkativeButton().callMembers()
//    SmallTalkativeButton().callMembers()

}