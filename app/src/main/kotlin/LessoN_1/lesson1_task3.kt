package org.example.app.LessoN_2

fun main() {
    // Год полёта неизменен → val
    val year = 1961

    // Часы и минуты меняются (сначала взлёт, потом посадка) → var
    var hour: String = "09"

    var minute: String = "07"

    // Вывод по одной переменной на строку
    println(year)
    println(hour)
    println(minute)

    // Изменяем значения для времени посадки
    hour = "10"
    minute = "55"

    // Вывод времени посадки в формате [часы:минуты]
    print(hour)      // print без переноса строки
    print(":")
    println(minute)  // println завершает строку
}