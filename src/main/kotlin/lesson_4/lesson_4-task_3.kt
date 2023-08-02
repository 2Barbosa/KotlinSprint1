package lesson_4

fun main() {
    val weather = "sunny"
    val awning = "opened"
    val airHumidity = 20
    val season = "winter"
    var comparisonResult = weather == WEATHER && awning == AWNING && airHumidity == AIR_HUMIDITY && !(season == SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? -$comparisonResult")
    // false потому что текущее время года зима
}

const val WEATHER = "sunny"
const val AWNING = "opened"
const val AIR_HUMIDITY = 20
const val SEASON = "winter"