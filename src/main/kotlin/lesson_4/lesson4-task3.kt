package org.example.lesson_4

fun main() {
    val weatherNow = true
    val openAwning = true
    val wet = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherNow == true) && (openAwning == true) && (wet == 20) && (season != "зима")}")

}