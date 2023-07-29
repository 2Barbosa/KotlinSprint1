package lesson_2

fun main() {
    val startTrainInMinuts = (9 * 60) + 39
    val wayTimeInMinuts = 457
    val finishTimeinMinuts = startTrainInMinuts + wayTimeInMinuts
    println("Время пррибытия - ${finishTimeinMinuts / 60}:${finishTimeinMinuts % 60}")
}