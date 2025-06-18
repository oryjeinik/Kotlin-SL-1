package org.example.lesson_4

fun main() {
    println("Введите данные для проверки возможности плавания:")

    print("Наличие повреждений корпуса (true/false): ")
    val hasDamage = readLine()!!.toBoolean()

    print("Текущий состав экипажа: ")
    val crewSize = readLine()!!.toInt()

    print("Количество ящиков с провизией на борту: ")
    val foodBoxes = readLine()!!.toInt()

    print("Благоприятность метеоусловий (true/false): ")
    val isWeatherFavorable = readLine()!!.toBoolean()

    val canSail = (
            (!hasDamage &&
                    crewSize in 55..70 &&
                    foodBoxes > 50 &&
                    (isWeatherFavorable || !isWeatherFavorable))
            ) || (
            hasDamage &&
                    crewSize == 70 &&
                    isWeatherFavorable &&
                    foodBoxes >= 50
            )

    println("Корабль ${if (canSail) "может" else "не может"} отправиться в плавание")
}