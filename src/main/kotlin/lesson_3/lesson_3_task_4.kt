package lesson_3

fun main() {
    var letter = "E"
    var number = 2
    var number1 = 4
    var stepNum = 1
    var stepFrom = letter + number
    var stepTo = letter + number1
    println("$stepFrom-$stepTo;$stepNum")
    letter = "D"
    stepFrom = letter + number
    stepTo = letter + ++number
    stepNum = 2
    println("$stepFrom-$stepTo;$stepNum")


}