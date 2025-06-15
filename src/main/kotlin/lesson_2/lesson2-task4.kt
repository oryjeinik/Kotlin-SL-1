package org.example.lesson_2

fun main() {
    val crystalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11

    val buffMultiplier = 0.2 // 20% бафф

    val bonusCrystalOre = (crystalOreWithoutBuff * buffMultiplier).toInt()
    val bonusIronOre = (ironOreWithoutBuff * buffMultiplier).toInt()

    println("Кристаллическая руда: $bonusCrystalOre")
    println("Железная руда: $bonusIronOre")
}