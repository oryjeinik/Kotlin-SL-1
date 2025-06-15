package org.example.lesson_3

fun main() {
    val userName = "\"Name_of_User\""
    val hiDay = "Добрый день"
    val hiNight = "Доброй ночи"
    var displayMessage: String

    displayMessage = "$hiDay $userName"
    println(displayMessage)
    displayMessage = "$hiNight $userName"
    println(displayMessage)
}