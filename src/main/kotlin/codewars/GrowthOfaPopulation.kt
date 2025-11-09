package org.example.codewars

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    require(pp0 >= 0 && p >= 0)
    var years = 0
    var population = pp0

    while (population < p) {
        population += ((population * percent / 100).toInt()) + aug //Untuk mencari populasi total setiap tahunnya
        years++ //Menambahkan jumlah tahun

    }
    return years
}

fun main() {
//    Percent is divides by 100
    println(nbYear(1500, 5.0, 100, 5000))
}