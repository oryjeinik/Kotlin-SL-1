package org.example.lesson_2

const val MAX_PROCENT = 100.0

fun main() {
    val crystalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11

    val buffMultiplier = 20.0 / MAX_PROCENT

    val bonusCrystalOre = (crystalOreWithoutBuff * buffMultiplier).toInt()
    val bonusIronOre = (ironOreWithoutBuff * buffMultiplier).toInt()

    println("Кристаллическая руда: $bonusCrystalOre")
    println("Железная руда: $bonusIronOre")
}