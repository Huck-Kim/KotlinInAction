//package io.crevolika.ch6
//
//
//import java.awt.Window
//import kotlin.properties.Delegates
//import kotlin.reflect.KProperty
//class MyDelegate {
//    operator fun getValue(c: C, property: KProperty<*>): Any {
//    return c
//    }
//
//    operator fun setValue(c: C, property: KProperty<*>, any: Any) {
//
//    }
//
//}
//
//class C {
//    val prop: Tpye by MyDelegate()
//}
//
//fun main(args: Array<String>) {
//    val c = C()
//}
