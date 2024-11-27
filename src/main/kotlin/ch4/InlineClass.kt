package ch4BasicKotlin


interface pretttyPrintable {
    fun prettyPrint()
}

@JvmInline
value class UsdCent(val amount: Int) : pretttyPrintable {
    val salesTax
    get() = amount*0.06

    override fun prettyPrint() = println("amount: $amount USD, tax: $salesTax USD")
}

fun main() {
    val expense = UsdCent(1_99)
    println(expense.salesTax)
// 11.94
    expense.prettyPrint()
// 199¢

}

