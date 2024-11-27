package ch4BasicKotlin

data class Customer(val name: String, val age: Int) {
    // override fun hashCode(): Int = name.hashCode()*31 + age

//    override fun toString()=
//        "Customer(name='$name', age=$age)"


}

fun main() {
    val processed1 = Customer("HUCK1",124)
    val processed2 = Customer("HUCK2",124)
    val processed3 = Customer("HUCK1",124)
    
    println(processed1 == Customer("HUCK1",124))

    println(processed1)

    println(processed1 == processed2)
    println(processed1 == processed3)
    println(processed1.hashCode())
    println(processed3.hashCode())
}