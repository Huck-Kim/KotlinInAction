//package io.crevolika.ch6
//
//operator fun <T> Column<T>.getValue(o: Entity, desc: KProperty<*>): T
//{
//// retrieve the value from the database
//}
//operator fun <T> Column<T>.setValue(o: Entity, desc: KProperty<*>, value: T)
//{
//// update the value in the database
//}
//
//object Users : IdTable() {
//    val name: Column<String> = varchar("name", 50).index()
//    val age: Column<Int> = integer("age")
//}
//
//
//class User(id: EntityID) : Entity(id) {
//    var name: String by Users.name
//    var age: Int by Users.age
//}
