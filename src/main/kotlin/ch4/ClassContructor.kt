//class User(val name:String)

class User(
    val name: String,
    val isSubcribed : Boolean = true
) {
    var address: String = "Unknown"
    set(value: String) {
        println(
            """ Address was changed for $name: "$field" -> "$value"
            """.trimIndent() )
        field = value
    }
}

class LengthCouter {
    var couter: Int = 0
    private set

    fun addWord(word: String) {
        couter += word.length
    }
}
//class User constructor(_nickname: String, _isSubcribed: Boolean) {
//    val name: String
//    val isSubcribed: Boolean
//
//    init {
//        name = _nickname
//        isSubcribed = _isSubcribed
//    }
//}
fun main() {
    val user = User(
        "John"
    )
    println(user.isSubcribed)
    val users = User("HUCK KIM")
    users.address = " seoung nam city"

    val lengthCout = LengthCouter()
    lengthCout.addWord("Hello!")
    println(lengthCout.couter)

}