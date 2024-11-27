package ch3BasicKotlin

open class View() {
    open fun click() = println(" clicked on View Class")
}

open class Button : View() {
    override fun click() = println("clicked on Button Class")
    fun unClick() = println("unclicked on Button Class")

}

fun View.unClick() {
    println("unClicked on View Class")
}


fun main() {
    val view: View = Button()
    view.click()
    view.unClick()
//    val button: Button = Button()
//    button.click()
//    button.unClick()
}
