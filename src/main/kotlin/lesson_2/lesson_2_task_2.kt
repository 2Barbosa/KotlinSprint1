package lesson_2

fun main() {
    val employers = 50
    val employersSalary = 30000
    val trainees = 30
    val traineesSalary = 20000
    val summEmployersSalary = employersSalary * employers
    println("Расходы на выплату зарплаты постоянных сотрудников - $summEmployersSalary")
    val generalPayments =summEmployersSalary + (traineesSalary * trainees)
    println("Общие расходы по ЗП после прихода стажеров - $generalPayments")
    val leverageSalary = generalPayments / (employers + trainees)
    println("Средняя зарплата одного сотрудника после устройства стажеров - $leverageSalary")
}