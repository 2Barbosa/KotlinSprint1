package lesson_2

import kotlin.math.pow

fun main() {
    var deposit = 70_000
    var interestRate = 0.167
    var depositTime = 20
    var result = ((1 + interestRate).pow(depositTime)) * deposit
    println(String.format("%.3f",result))
}