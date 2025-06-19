package org.example.lesson_4

fun main() {
    var trainingDay  = 5
    val armsAndAbsDay  = trainingDay % 2 == 1
    val message = """
        Упражнение для рук: $armsAndAbsDay
        Упражнение для ног: ${!armsAndAbsDay}
        Упражнение для спины: ${!armsAndAbsDay}
        Упражнение для пресса: $armsAndAbsDay
    """.trimIndent()
    println(message)


}