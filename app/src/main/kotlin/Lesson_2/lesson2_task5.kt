package org.example.app.Lesson_2

fun main() {

    val nachalnayaSumma = 70_000.0
    val godovayaProcentnayaStavka = 16.7 / 100  // 16.7% в десятичном виде
    val kolichestvoLet = 20

    val itogovayaSumma = nachalnayaSumma * Math.pow(1 + godovayaProcentnayaStavka, kolichestvoLet.toDouble())

    println("Razmer vklada cherez 20 let: ${"%.3f".format(itogovayaSumma)}")
}