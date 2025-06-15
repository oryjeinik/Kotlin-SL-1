package org.example

fun main() {
    val name = "Татьяна"
    val surname = "Андреева"
    val patronymic = "Сергеевна"
    val age = 22
    val ageInPaste = 20
    val sernameNew = "Сидорова"

    val publickDataInPaste = "$surname $name $patronymic возраст:$ageInPaste"
    println(publickDataInPaste)
    val publickDataInNow = "$sernameNew $name $patronymic возраст:$age"
    println(publickDataInNow)


}