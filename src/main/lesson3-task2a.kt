package org.example.lesson_3

fun main() {
    val name = "Татьяна"
    val surname = "Андреева"
    val patronymic = "Сергеевна"
    val age = 22
    val ageInPaste = 20
    val surnameNew = "Сидорова"

    val publicDataInPaste = "$surname $name $patronymic возраст:$ageInPaste"
    println(publicDataInPaste)
    val publicDataInNow = "$surnameNew $name $patronymic возраст:$age"
    println(publicDataInNow)
}