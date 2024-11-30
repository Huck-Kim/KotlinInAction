package io.crevolika.ch6

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start
        override fun hasNext() =
            current <= endInclusive
        override fun next(): LocalDate {
            val thisDate = current
            current = current.plusDays(1)
            return thisDate
        }
    }
fun main() {
    val newYear = LocalDate.ofYearDay(2025, 11)
    val daysOff = newYear.minusDays(14)..newYear
    for (dayOff in daysOff) { println(dayOff) }
// 2041-12-31
// 2042-01-01
}
