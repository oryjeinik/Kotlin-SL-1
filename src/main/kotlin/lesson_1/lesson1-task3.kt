package org.example.lesson_1

fun main() {
    val year = 1961
    var hour: String = "09"
    var minute: String = "07"
    println(year)
    println(hour)
    println(minute)
    hour = "10"
    minute = "55"
    println("Посадка - ${hour}:${minute}")
    print("Метод print() не делает перенос в конце строки")
}