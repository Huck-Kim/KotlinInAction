

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
class Mul(val left: Expr, val right: Expr) : Expr()
class Div(val left: Expr, val right: Expr) : Expr()

fun eval(expr: Expr) : Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        is Mul -> eval(expr.left) * eval(expr.right)
        is Div -> eval(expr.left) / eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }


fun main() {
    println(eval((Div(Mul(Sum(Num(100), Num(2)), Num(3)),Num(4)))))
}
