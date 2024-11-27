package ch4

class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet())
    : Collection<T> by innerSet {
        var objectAdded = 0
    fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
     }
    fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)

    }
}

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int = p1.name.compareTo(p2.name)
    }
}
fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1,1,3))
    cset.add(1)
    println("Added ${cset.objectAdded} ${cset.size} unique")

    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}