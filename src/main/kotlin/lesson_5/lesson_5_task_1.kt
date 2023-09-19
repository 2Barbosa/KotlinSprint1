package lesson_5

fun main() {

    println("Решите тест 2 + 3")

    val userTest = readln()!!.toInt()

    val resultText = if (userTest == NUMBER + NUMBER_1) "Добро пожаловать"
    else "Доступ запрещен"

    println(resultText)
}

const val NUMBER = 2
const val NUMBER_1 = 3
