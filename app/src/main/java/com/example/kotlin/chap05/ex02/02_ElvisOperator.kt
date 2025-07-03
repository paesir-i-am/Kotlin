package com.example.kotlin.chap05.ex02

fun main() {
    var data: String? = "kkang"
    println("data = $data : ${data?.length ?: -1}")

    data = null
    println("data = $data : ${data?.length ?: -1}")
}

// ?: 엘비스 연산자 (null 처리 기본값) -> data?.length ?: -1