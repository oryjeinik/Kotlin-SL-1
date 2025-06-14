package org.example.lesson_1


fun main() {
    val totalSeconds = 6480
    val inHours  = totalSeconds/ 3600
    val secondAfterHours = totalSeconds % 3600
    val inMinute = secondAfterHours / 60
    val inSeconds = secondAfterHours % 60
// подготовка к выводу
    val formatHours  = "%02d".format(inHours)
    val formatMinute = "%02d".format(inMinute)
    val formatSeconds = "%02d".format(inSeconds)

    println("Время в космосе: $formatHours:$formatMinute:$formatSeconds")

}
