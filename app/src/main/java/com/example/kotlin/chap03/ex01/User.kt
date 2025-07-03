package com.example.kotlin.chap03.ex01

import java.text.SimpleDateFormat
import java.util.*

var data = 10;

fun formatDate(date: Date): String {
    val sdFormat = SimpleDateFormat("yyyy-MM-dd")
    val dateFormat = sdFormat.format(date)
    println(dateFormat)
    return dateFormat
}

class User {
    var name: String = "Jeonghyun"

    fun sayGreeting() {
        println("$name, Nice to meet you!")
    }
}