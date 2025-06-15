package org.example.lesson_2

fun main() {
    val hour = 9
    val minutes = 39
    val minutesOnWay = 457
    val allTimeInMinutes = hour*60+minutesOnWay+minutes
    val hourIncoming = allTimeInMinutes/60
    val minuteAfterHour = allTimeInMinutes%60
    val formatHour = "%02d".format(hourIncoming)
    val formatMinutes = "%02d".format(minuteAfterHour)

    println("$formatHour:$formatMinutes")
}