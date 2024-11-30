package io.crevolika.ch6

import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Delegated Property"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef")
    }
}

class Example {
    var p: String by Delegate()
}

fun main() {
    val e = Example()
    println(e.p) // "Delegated Property"
    e.p = "New Value" // "New Value has been assigned to 'p' in Example@<hashcode>"
}