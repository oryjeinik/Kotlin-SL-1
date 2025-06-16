package org.example.lesson_4

const val ALL_TABLES = 13

fun main() {
    val tablesToday  = 13
    val tablesTomorrow = 9
    println("[Доступность столиков на на сегодня: ${tablesToday < ALL_TABLES}]\n[Доступность столиков на на завтра: ${tablesTomorrow < ALL_TABLES}]")

}