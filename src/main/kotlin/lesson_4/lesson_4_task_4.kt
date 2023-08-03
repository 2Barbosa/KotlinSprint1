package lesson_4

fun  main() {
    var day0 = "Упражнения для рук"
    var day1 = "Упражнения для пресса"
    var day2 = "Упражнения для ног"
    var day3 = "Упражнения для спины"

    var comparisonResult = day0 === HANDS || day0 === PRESS || day0 === LEGS || day0 === BACK
    var comparisonResult1 = day2 === HANDS || day2 === PRESS ||!(day2 === LEGS) || day2 === BACK
    var comparisonResult2 = day3 === HANDS || day3 === PRESS || day3 === LEGS ||!(day3 === BACK)
    var comparisonResult3 = day1 === HANDS || day1 === PRESS || day1 === LEGS || day1 === BACK

    println("Тренировка-1\n$day0:$comparisonResult\n$day2:$comparisonResult1\n$day3:$comparisonResult2" +
            "\n$day1:$comparisonResult3")
}

const val HANDS = "Упражнения для рук"
const val PRESS = "Упражнения для пресса"
const val LEGS = "Упражнения для ног"
const val BACK = "Упражнения для спины"