package lesson_1

fun main() {
    val flightInSeconds = 6480
    println("Время полета в минутах - ${flightInSeconds / 60}")
    val flightInMinuts = 108
    val timeHour = flightInMinuts / 60
    val timeMinuts = flightInMinuts % 60
    println("Время полета - 0$timeHour:$timeMinuts")
}