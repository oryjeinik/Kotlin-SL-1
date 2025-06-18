package org.example.lesson_4

fun main() {
    var trainingDay = 5
    val armsAndAbsDay = trainingDay % 2 == 1

    val message = """
        Упражнения для рук: $armsAndAbsDay
        Упражнения для ног: ${!armsAndAbsDay}
        Упражнения для спины: ${!armsAndAbsDay}
        Упражнения для пресса: $armsAndAbsDay
    """.trimIndent()
    println(message)

}