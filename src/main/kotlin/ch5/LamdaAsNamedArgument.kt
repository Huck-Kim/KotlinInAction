interface MouseListener{
    fun onEnter()
    fun onClick()
}

class Button(param: MouseListener) : MouseListener {
    override fun onClick() {}
    override fun onEnter() {}
}

val listener = object : MouseListener {
    override fun onEnter() { /* ... */ }
    override fun onClick() { /* ... */ }

    }
fun main() {
    var clickCount = 0
    Button(object : MouseListener {
        override fun onEnter() { /* ... */ }
        override fun onClick() {
            clickCount++
        }
    })

    println(clickCount)
}
