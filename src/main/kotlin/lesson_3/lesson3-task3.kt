package org.example.lesson_3

fun main() {
    val startNumber = 6
    val multiplicationTable = """
        $startNumber * 1 = ${startNumber * 1}
        $startNumber * 2 = ${startNumber * 2}
        $startNumber * 3 = ${startNumber * 3}
        $startNumber * 4 = ${startNumber * 4}
        $startNumber * 5 = ${startNumber * 5}
        $startNumber * 6 = ${startNumber * 6}
        $startNumber * 7 = ${startNumber * 7}
        $startNumber * 8 = ${startNumber * 8}
        $startNumber * 9 = ${startNumber * 9}
        $startNumber * 10 = ${startNumber * 10}
    """.trimIndent()
    println(multiplicationTable)

}