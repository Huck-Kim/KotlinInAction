package ch4BasicKotlin

import ch4.Person
import java.io.File

object NewUser  {
    val newUser = Person4("Huck Kim")
    fun alert() {
        println(newUser.name)
    }
}
object Payroll {
    val employees = mutableListOf<Person>()
    fun calculateSalary() {
        for (person in employees) {

        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.name.compareTo(file2.name)
    }
}

fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/Huck"), File("/Huck")))
    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    NewUser.newUser.name
    println(NewUser.newUser.name)
    NewUser.alert()
}