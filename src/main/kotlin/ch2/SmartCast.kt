package ch2_Basic_Kotiln

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e:Expr): Int =
    when(e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr): Int =
    when(e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("Sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    //println(if(e is num) 1 else 0)
    println(eval(Sum(Sum(Num(1), Num(2)), Num(20))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(20))))
}