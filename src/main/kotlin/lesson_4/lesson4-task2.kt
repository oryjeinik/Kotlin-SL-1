package org.example.lesson_4

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_SIZE = 100

fun main() {
    val weight1 = 20
    val volume1 = 80
    println("Груз с весом $weight1 кг и объёмом $volume1 л соответсвует категории \"Average\" : ${(weight1 > MIN_AVERAGE_WEIGHT) && (weight1 <= MAX_AVERAGE_WEIGHT) && (volume1 < MAX_AVERAGE_SIZE)}")
    val weight2 = 50
    val volume2 = 100
    println("Груз с весом $weight2 кг и объёмом $volume2 л соответсвует категории \"Average\" : ${(weight2 > MIN_AVERAGE_WEIGHT) && (weight2 <= MAX_AVERAGE_WEIGHT) && (volume2 < MAX_AVERAGE_SIZE)}")


}