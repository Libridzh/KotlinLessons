package org.example.app.Lesson_2

fun main() {
    val ball1: Int = 3
    val ball2: Int = 4
    val ball3: Int = 3
    val ball4: Int = 5
    val count: Double = 4.0

    // среднее арифметическое
    val srednee = (ball1 + ball2 + ball3 + ball4)/count

    // вывод с 2 знаками после запятой
    println("%.2f".format(srednee))

}