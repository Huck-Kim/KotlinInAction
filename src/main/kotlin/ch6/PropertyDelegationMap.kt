package io.crevolika.ch6

class PersonCh6_6 {
    private val _attributes = mutableMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }
    var name: String by _attributes
    var company: String by _attributes
}

fun main() {
    val p = PersonCh6_6()
    val data = mapOf("name" to "Seb", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
    println(p.company)
// Seb
    p.name = "Sebastian"
    p.company = "Crevolika"
    println(p.name)
    println(p.company)
// Sebastian
}
