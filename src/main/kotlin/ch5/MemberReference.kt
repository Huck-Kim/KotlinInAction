package io.crevolika.ch5

fun shout() {println("Shout")}

//fun main(args: Array<String>) {
//    run ( ::shout )
//}
fun sendEmail(p:Person,message:String) = println("Sending email to ${p.name} content is ${message}")

data class Person(val name: String, val age: Int)
fun main() {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val action = { person: Person, message: String ->
        sendEmail(person, message)
    }
    val nextAction = ::sendEmail

    println(action(p,"HI! Huck"))
    println(nextAction(p,"Hi! Huck again!"))

    fun Person.isAdult() = age >= 21
    val predicate = Person::isAdult

    println(predicate(p))
    println(p.isAdult())

    val seb = Person("Sebastian", 26)
    val personsAgeFunction = Person::age
    println(personsAgeFunction(seb))
// 26
    val sebsAgeFunction = seb::age
    println(sebsAgeFunction())
// 26


}
