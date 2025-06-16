package org.example.lesson_2
const val MINUTE_IN_HOUR = 60

fun main() {
    val hour = 9
    val minutes = 39
    val minutesOnWay = 457
    val allTimeInMinutes = hour * MINUTE_IN_HOUR + minutesOnWay + minutes
    val hourIncoming = allTimeInMinutes / MINUTE_IN_HOUR
    val minuteAfterHour = allTimeInMinutes % MINUTE_IN_HOUR
    val formatHour = "%02d".format(hourIncoming)
    val formatMinutes = "%02d".format(minuteAfterHour)

    println("$formatHour:$formatMinutes")
}