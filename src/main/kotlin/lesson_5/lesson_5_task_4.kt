package lesson_5

fun main() {

    println("Введите имя пользователя и пароль")

    val userName = readln()

    val resultText = if (userName == NAME) "Ваше имя зарегистрировано, но надо проверить пароль"
    else "Вам надо зарегистрироваться"

    println(resultText)

    println("Напишите пароль")

    val userPassword = readln()

    val resultText1 = if (userPassword == PASSWORD) "Вам разрешен вход на борт корабля"
    else "Пароль неправильный"

    println(resultText1)
}

const val NAME = "Zaphod"
const val PASSWORD = "PanGalactic"