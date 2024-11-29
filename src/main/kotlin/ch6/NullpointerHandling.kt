package io.crevolika.ch6

class Employee(val name: String, val manager: Employee?)

fun findManager(employee: Employee) : String? = employee.manager?.name



class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)


fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with(address) {
        println(this.streetAddress)
        println("${this.zipCode} $city, $country")
    }
}

fun main() {
    val ceo = Employee("Huck Kim", null)
    val cto  = Employee("HH Jeon", ceo)
    val developer = Employee("Developer DW", cto)

    println(findManager(cto))
    println(findManager(developer))
    println(findManager(ceo))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
    printShippingLabel(person)

    printShippingLabel(Person("Alexey", null))

// Elsestr. 47
// 80687 Munich, GermanyprintShippingLabel(Person("Alexey", null))
// java.lang.IllegalArgumentException: No address
}