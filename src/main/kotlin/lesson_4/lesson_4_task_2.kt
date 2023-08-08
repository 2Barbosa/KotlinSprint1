package lesson_4

fun main() {
   var cargoWeight = 42
   var cargoVolume = 120
   val comparisonResult = (cargoWeight > MIN_WEIGHT_AVERAGE) && (cargoWeight <= MAX_WEIGHT_AVERAGE) && (cargoVolume < MAX_VOLUME_AVERAGE)
   println("Груз с весом 42 кг и объемом 120 л соответствует категории AVERAGE - $comparisonResult")
   cargoWeight = 20
   cargoVolume = 80
   println("Груз с весом 20 кг и объемом 80 л соответствует категории AVERAGE - $comparisonResult")
   cargoWeight = 50
   cargoVolume = 100
   println("Груз с весом 50 кг и объемом 100 л соответствует категории AVERAGE - $comparisonResult")
   //false потому что объем 100л , при условии что объем для average меньше 100 л
}

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100