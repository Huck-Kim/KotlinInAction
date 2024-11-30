package io.crevolika.ch6

//import kotlin.reflect.KProperty
//
//class ObservableProperty(var propValue: Int, val observable: Observable) {
//    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Int = propValue
//    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: Int) {
//        val oldValue = propValue
//        propValue = newValue
//        observable.notifyObservers(prop.name, oldValue, newValue)
//    }
//}
//class PersonCh6_2(val name: String, age: Int, salary: Int) : Observable() {
//    var age by ObservableProperty(age, this)
//    var salary by ObservableProperty(salary, this)
//}
//
//fun main() {
//    val p = PersonCh6_2("Seb", 28, 1000)
//    p.observers += Observer { propName, oldValue, newValue ->
//        println(
//            """
//Property 3rd version $propName changed from $oldValue to $newValue!
//""".trimIndent()
//        )
//    }
//    p.age = 29
//// Property age changed from 28 to 29!
//    p.salary = 1500
//
//    println("${p.name} is ${p.salary}")
//    println("${p.name} is ${p.age}")
//// Property salary changed from 1000 to 1500!
//
//
//}