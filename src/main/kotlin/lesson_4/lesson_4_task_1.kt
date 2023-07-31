package lesson_4

fun main() {
    var ordersToday = 13
    var ordersTomorrow = 9
    var comparisonResult = ordersToday < ORDERED_TABLES
    var comparisonResult1 = ordersTomorrow < ORDERED_TABLES

    println("Сегодня МОЖНО заказать столик - $comparisonResult \nЗавтра МОЖНО заказать столик - $comparisonResult1")
}

const val ORDERED_TABLES = 13