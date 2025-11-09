package org.example.codewars

fun disemvowel(str: String): String {
    val vocal = setOf('a', 'i', 'u', 'e', 'o')
    return str.filter { it.lowercaseChar() !in vocal }
}

fun main() {
    print(disemvowel("Indonesia Raya"))
}