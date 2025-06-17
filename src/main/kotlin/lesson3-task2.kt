package org.example

fun main() {
    val name = "Татьяна"
    var surname = "Андреева"
    val patronymic = "Сергеевна"
    var age = 20

    var publicDataInPaste = "$surname $name $patronymic возраст:$age"
    println(publicDataInPaste)
    surname = "Сидорова"
    age = 22
    publicDataInPaste = "$surname $name $patronymic возраст:$age"
    println(publicDataInPaste)
}