package io.crevolika.ch6

class PersonCh6(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonCh6 ?: return false
        return otherPerson.firstName == firstName &&
        otherPerson.lastName == lastName
    }
    override fun hashCode(): Int =
    firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = PersonCh6("Dmitry", "Jemerov")
    val p2 = PersonCh6("Dmitry", "Jemero")
    println(p1 == p2)
// true
    println(p1.equals(42))
// false
}
