package lesson_5

fun main() {

    val userBirthYear = readLine()!!.toInt()

    val resultText = if (userBirthYear <= BIRTH_YEAR) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)

}

const val BIRTH_YEAR = 2005