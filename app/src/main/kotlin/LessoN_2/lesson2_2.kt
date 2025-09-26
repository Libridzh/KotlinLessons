package org.example.app.LessoN_2

fun main() {
    val orderCount: Int = 0
    val thankYouMessage: String = "Spasibo za pokupku"
    println(orderCount)
    println(thankYouMessage)

    var employeeCount = 2000
    println("Kol-vo rabotnikov: $employeeCount")

    // Представим, что один работник уволился
    // println("Количество работников: $employeeCount")  // ← старый вывод закомментирован
    employeeCount = 1999
    println("Kol-vo rabotnikov poske yvolneniya: $employeeCount")

}