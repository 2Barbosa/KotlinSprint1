package lesson_2

import kotlin.math.roundToInt

fun main() {
    var crystalOre = 7
    var ironOre = 11
    var buffPercent = 20
    var buffCrystal = (crystalOre * 0.01) * buffPercent
    var buffCrystal1 = buffCrystal.toInt()
    println("Бонус на Кристаллическую руду - $buffCrystal1")
    var buffIron = (ironOre * 0.01) * buffPercent
    var buffIron1 = buffIron.toInt()
    println("Бонуc на Железную руду - $buffIron1")
}