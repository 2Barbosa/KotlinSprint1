package lesson_5

fun main() {

    val randomNumber = (1..100).random()
    val randomNumber1 = (1..100).random()

    println("Программа рандомно сгенерировала два числа от 1 до 100. Надо попытаться угадать эти числа.")
    println("Напишите ваше первое число.")

    val userNumber = readln().toInt()

    println("Напишите второе число.")

    val userNumber1 = readln().toInt()
    if (userNumber == randomNumber || userNumber == randomNumber1) println("Утешительный приз.")
    else if (userNumber1 == randomNumber || userNumber1 == randomNumber1) println("Утешительный приз.")
    else if (userNumber == randomNumber && userNumber1 == randomNumber1) println("Угадали два числа.")
    else if (userNumber == randomNumber1 && userNumber1 == randomNumber ) println("Угадали два числа.")
    else println("Вы ничего не угадали.")

    println("Выигрышные числа были $randomNumber и $randomNumber1")

}

