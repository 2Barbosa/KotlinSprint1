package lesson_3

fun main() {
    var letter = "E"
    var number = 2
    var number1 = 4
    var stepNum = 1
    var move = letter + number + "-" + letter + number1 + ";" + stepNum
    println(move)
    letter = "D"
    move = letter + number + "-" + letter + ++number + ";" + ++stepNum
    println(move)

}