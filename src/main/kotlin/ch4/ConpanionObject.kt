package ch4BasicKotlin

import ch4BasicKotlin.getNameFromSocialNetwork

class User2 {
    val nickname: String
    constructor(email: String) {
        nickname = email.substringBefore('@')
    }
    constructor(socialAccountId: Int) {
        nickname = getNameFromSocialNetwork(socialAccountId.toString()).toString()
    }
}

class User7 private constructor(val name: String) {
    companion object {
        fun getNameFromSocialNetwork(socialAccountId: Int): String {
            return socialAccountId.toString()
        }
        fun getFromEmail(email: String): String {
            return email.substringBefore('@')
        }
    }
}

class Person4(val name: String) {
    companion object Loader {
        fun fromJSON(json: String): Person4 {
            return Person4(json)
        }
    }
}

fun main() {
    val person = Person4.Loader.fromJSON("""{"name": "Dmitry"}""")
    println(person.name)
// Dmitry
    val person2 = Person4.fromJSON("""{"name": "Brent"}""")
    println(person2.name)
// Brent
}
