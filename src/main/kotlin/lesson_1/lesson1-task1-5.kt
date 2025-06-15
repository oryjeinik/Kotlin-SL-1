package org.example.lesson_1

const val SECONDS_IN_YEAR = 3600
const val SECONDS_IN_MINUTE_AND_MINUTE_IN_HOURS = 60

fun main() {
    val totalSeconds = 6480
    val inHours = totalSeconds / SECONDS_IN_YEAR
    val secondAfterHours = totalSeconds % SECONDS_IN_YEAR
    val inMinute = secondAfterHours / SECONDS_IN_MINUTE_AND_MINUTE_IN_HOURS
    val inSeconds = secondAfterHours % SECONDS_IN_MINUTE_AND_MINUTE_IN_HOURS
// подготовка к выводу
    val formatHours = "%02d".format(inHours)
    val formatMinute = "%02d".format(inMinute)
    val formatSeconds = "%02d".format(inSeconds)

    println("Время в космосе: $formatHours:$formatMinute:$formatSeconds")
    println("%02d:%02d:%02d".format(inHours, inMinute, inSeconds))

}
