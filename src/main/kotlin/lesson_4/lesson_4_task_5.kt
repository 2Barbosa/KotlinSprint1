package lesson_4

fun main() {
    var summCrew = 70
    var boxesProvision = 50
    var todayWeather = "favorable"
    var shipCondition = "without damages"
    var comparisonResult = summCrew >= 55 && boxesProvision >= 50 && todayWeather === DAYLY_WEATHER && !(shipCondition === DAYLY_SHIP_CONDITION)
    println("Корабль может отплыть - $comparisonResult")
}

const val DAYLY_SHIP_CONDITION = "small damages"
const val DAYLY_WEATHER = "favorable"
