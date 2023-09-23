package lesson_5

fun main() {

    println("Надо угадать два числа от 1 до 100")

    val userNumber = readln().toInt()
    val userNumber1 = readln().toInt()

    val resultText = if (userNumber == RIGHT_NUMBER || userNumber == RIGHT_NUMBER_1) {
        println("Поздравляем! Вы выиграли утешительный приз!")
    } else if (userNumber == RIGHT_NUMBER && userNumber == RIGHT_NUMBER_1) {
        println("Поздравляем! Вы выиграли утешительный приз")
    } else {
        println("Неудача!Крутите барабан")
    }
        println(resultText)
}

const val RIGHT_NUMBER = 23
const val RIGHT_NUMBER_1 = 79