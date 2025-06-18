package org.example


fun main() {
    val taskForUser = "2 + 3"
    val correctAnswer = 2 + 3
    val questinForUser = "Привет! Сколкьо будет $taskForUser= ?"

    println(questinForUser)
    val answerUser = readln().toInt()

    var checkingTheAnswer = if (answerUser == correctAnswer) "Добро пожаловать" else "Доступ запрещён"
    println(checkingTheAnswer)
}