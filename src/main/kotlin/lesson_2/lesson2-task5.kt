package org.example.lesson_2

fun main() {
    val initialAmount = 70000.0
    val annualInterestRate = 0.167 //16.7%
    val years = 20

    val finalAmout = initialAmount * Math.pow(1 + annualInterestRate, years.toDouble())

    println("%.3f".format(finalAmout))

}