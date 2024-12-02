package io.crevolika.ch6

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun interface Observer {
    fun onChange(name: String, oldValue: Any?, newValue: Any?)

}
open class Observable {
    val observers = mutableListOf<Observer>()

    fun notifyObservers(propName: String, oldValue: Any?, newValue: Any?) {
        for (obs in observers) {
            obs.onChange(propName, oldValue, newValue)
        }
    }
}
class Client(val name: String, age: Int, salary: Int) : Observable() {
    private val onChange = { property: KProperty<*>, oldValue: Any?, newValue: Any? ->
        notifyObservers(property.name, oldValue, newValue)
    }
    var age by Delegates.observable(age, onChange)
    var salary by Delegates.observable(salary, onChange)
}

fun main() {
    val p = Client("Seb", 28, 1000)
    println("Client instance created")

    p.observers += Observer { propName, oldValue, newValue ->
        println(
            """
Property Final version $propName changed from $oldValue to $newValue!
""".trimIndent()
        )
    }
    p.age = 48
    p.salary = 1500


}