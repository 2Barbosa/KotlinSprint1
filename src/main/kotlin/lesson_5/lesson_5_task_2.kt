package lesson_5

fun main() {

    println("Напишите год рождения")

    val userBirthYear = readln().toInt()

    val resultText = if (userBirthYear <= BIRTH_YEAR) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)

}

const val BIRTH_YEAR = 2005