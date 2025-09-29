package org.example.app.LessoN_2

fun main() {
    val totalSeconds: Int = 6480

    // Часы
    val hours: Int = totalSeconds / 3600
    // Минуты (остаток после часов)
    val minutes: Int = (totalSeconds % 3600) / 60
    // Секунды (остаток после минут)
    val seconds: Int = totalSeconds % 60

    print(hours)      // print без переноса строки
    print(":")
    print(minutes)
    print(":")
    println(seconds)
}
