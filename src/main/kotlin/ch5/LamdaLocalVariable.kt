package io.crevolika.ch5

fun printingErrorCounting(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("Server errors: $serverErrors client errors: $clientErrors")
   }



fun main() {
    val resList = listOf("200 OK", "404 error", "500 error", "403 error", "501 error", "502 error")
    printingErrorCounting(resList)
}
