package io.crevolika.ch6

class Email { /*...*/ }


fun loadEmails(person: PersonCh8): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

//class PersonCh8(val name: String) {
//    private var _emails: List<Email>? = null
//    val emails: List<Email>
//        get() {
//            if (_emails == null) {
//                _emails = loadEmails(this)
//            }
//            return _emails!!
//        }
//}

class PersonCh8(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun main() {
    val p = PersonCh8("Alice")
    p.emails
// Load emails for Alice
    p.emails
}
