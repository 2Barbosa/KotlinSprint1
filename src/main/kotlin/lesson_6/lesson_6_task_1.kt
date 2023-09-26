package lesson_6


fun main() {

    println("Создайте имя пользователя:")

    val userName = readln()
    println("Создайте пароль:")
    val userPassword = readln()
    println("Для авторизации напишите имя пользователя")
    do {
        val resultText = if (userName == readln()) "Имя верно,введите пароль"
        else "имя не верно, попробуйте еще раз"
        println(resultText)
    } while (userName !== readln())
    do {
        val resultText1 = if (userPassword == readln()) "Авторизация прошла успешно"
        else "Логин неверный. Напишите еще раз"
        while (userPassword !== readln())
            println(resultText1)
    } while (userPassword !== readln())
}










