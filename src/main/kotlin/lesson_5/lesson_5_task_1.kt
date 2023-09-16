package lesson_5

fun main() {

    println("Решите тест 2 + 3")

    val userTest = readLine()!!.toInt()

    val resultText = if (userTest == RIGHT_RESULT) "Добро пожаловать"
    else "Доступ запрещен"

    println(resultText)

}

const val  RIGHT_RESULT = 5