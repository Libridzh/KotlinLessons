package org.example.app.Lesson_2

fun main() {

    val vremyaVyezdaChas = 9
    val vremyaVyezdaMinuta = 39
    val vremyaVPutiMinuty = 457

    // Вычисляем время прибытия
    val vsegoMinut = vremyaVyezdaChas * 60 + vremyaVyezdaMinuta + vremyaVPutiMinuty
    val chastPribytiya = vsegoMinut / 60 % 24
    val minutaPribytiya = vsegoMinut % 60

    val formatirovannyChas = String.format("%02d", chastPribytiya)
    val formatirovannayaMinuta = String.format("%02d", minutaPribytiya)

    // Выводим результат
    println("Vremya vyezda: $vremyaVyezdaChas:$vremyaVyezdaMinuta")
    println("Vremya v puti: $vremyaVPutiMinuty minut")
    println("Vremya pribytiya: $formatirovannyChas:$formatirovannayaMinuta")
}