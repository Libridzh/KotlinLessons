package org.example.app.LessoN_2

fun main() {
    // Константы
    val totalSeconds: Int = 6480
    val secondsInMinute: Int = 60
    val secondsInHour: Int = 3600

    // Переводим секунды в часы, минуты и остаток секунд
    val hours: Int = totalSeconds / secondsInHour
    val minutes: Int = (totalSeconds % secondsInHour) / secondsInMinute
    val seconds: Int = totalSeconds % secondsInMinute

    // Выводим в формате [часы:минуты:секунды] с ведущими нулями
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}