package io.crevolika.ch6

//class ObservableProperty(val propName: String, var propValue: Int, val observable: Observable) {
//    fun getValue(): Int = propValue
//    fun setValue(newValue: Int) {
//        val oldValue = propValue
//        propValue = newValue
//        observable.notifyObservers(propName, oldValue, newValue)
//    }
//}
//class PersonCh6_1(val name: String, age: Int, salary: Int): Observable() {
//    val _age = ObservableProperty("age", age, this)
//    var age: Int
//        get() = _age.getValue()
//        set(newValue) {
//            _age.setValue(newValue)
//        }
//    val _salary = ObservableProperty("salary", salary, this)
//    var salary: Int
//        get() = _salary.getValue()
//        set(newValue) {
//            _salary.setValue(newValue)
//        }
//}
//
////fun main() {
////    val p = PersonCh6_1("Seb", 28, 1000)
////    p.observers += Observer { propName, oldValue, newValue ->
////        println(
////            """
////Property 2nd version $propName changed from $oldValue to $newValue!
////""".trimIndent()
////        )
////    }
////    p.age = 29
////// Property age changed from 28 to 29!
////    p.salary = 1500
////// Property salary changed from 1000 to 1500!
////
////
////}