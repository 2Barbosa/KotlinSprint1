package lesson_5

fun main() {

    val randomNumber = (1..100).random()
    val randomNumber1 = (1..100).random()

    println("Программа рандомно сгенерировала два числа от 1 до 100. Надо попытаться угадать эти числа.")
    println("Напишите ваше первое число.")

    val userNumFirst = readln().toInt()

    println("Напишите второе число.")

    val userNumSecond = readln().toInt()

    if (userNumFirst == randomNumber || userNumFirst == randomNumber1 ||
        userNumSecond == randomNumber || userNumSecond == randomNumber1
    ) println("Утешительный приз.")
    else if (userNumFirst == randomNumber && userNumSecond == randomNumber1 &&
        userNumFirst == randomNumber1 && userNumSecond == randomNumber
    ) println("Угадали два числа.")
    else println("Вы ничего не угадали.")

    println("Выигрышные числа были $randomNumber и $randomNumber1")

}


