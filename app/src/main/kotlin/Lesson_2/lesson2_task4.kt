package org.example.app.Lesson_2

fun main() {
    // Исходные данные без баффа
    val kristallicheskayaRudaBezBaffa = 7
    val zheleznayaRudaBezBaffa = 11

    // Вычисляем бонусные материалы (20% от исходных)
    val bonusKristallicheskayaRuda = (kristallicheskayaRudaBezBaffa * 0.2).toInt()
    val bonusZheleznayaRuda = (zheleznayaRudaBezBaffa * 0.2).toInt()

    // Выводим результат
    println("Bonus kristallicheskaya ruda: $bonusKristallicheskayaRuda")
    println("Bonus zheleznaya ruda: $bonusZheleznayaRuda")
}