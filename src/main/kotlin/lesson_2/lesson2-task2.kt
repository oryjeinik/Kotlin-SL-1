package org.example.lesson_2

fun main() {
    val numberOfPermanentEmployees = 50
    val salaryPermanentEmployee = 30000
    val numberOfTrainees = 30
    val salaryOfTrainees = 20000

    val expenseSalaryForPermanentEmployee = numberOfPermanentEmployees*salaryPermanentEmployee
    val allSalary = expenseSalaryForPermanentEmployee+numberOfTrainees*salaryOfTrainees
    val averageSalary = allSalary/(numberOfPermanentEmployees+numberOfTrainees)

    println("Рассходы на постоянных сотрудников:$expenseSalaryForPermanentEmployee")
    println("ФОТ:$allSalary")
    println("Средняя зарпалта:$averageSalary")

}