package org.example.app.Lesson_2

fun main() {
    // Исходные данные
    val postoyannieSotrudniki = 50
    val zpPostoyannih = 30000
    val stazhery = 30
    val zpStazherov = 20000

    // Расчеты
    val rashodyNaPostoyannih = postoyannieSotrudniki * zpPostoyannih
    val obshieRashodyPoZp = rashodyNaPostoyannih + (stazhery * zpStazherov)
    val srednyayaZp = obshieRashodyPoZp / (postoyannieSotrudniki + stazhery)

    // Вывод результатов
    println("Rashody na vyplatu zarplaty postoyannyh sotrudnikov: $rashodyNaPostoyannih rubley")
    println("Obshie rashody po ZP posle prihoda stazherov: $obshieRashodyPoZp rubley")
    println("Srednyaya ZP odnogo sotrudnika posle ustrojstva stazherov: $srednyayaZp rubley")
}