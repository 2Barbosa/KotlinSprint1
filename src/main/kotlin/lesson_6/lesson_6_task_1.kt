package lesson_6

fun main() {

    println("Создайте имя пользователя:")

    val userName = readln()

    println("Создайте пароль:")
    val userPassword = readln()

    println("Для авторицации напишите имя пользователя")
    val resultText = if (userName == readln()) "Верно"
    else "имя не верно"
    println(resultText)

    println("Введите пароль")

    while (userPassword !== readln()) {

    val resultText1 = if (userPassword == readln()) "Авторизация прошла успешно"

    else "Логин неверный. Напишите еще раз"

        println(resultText1)

    }
}


