package com.example.kotlin.chap05.ex01

// 고차 함수 정의
fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if (arg(10)) {
        "valid"
    } else {
        "invalid"
    }

    return { "hofFun result : $result" }
}

fun main() {
    // 고차 함수 사용
    val result = hofFun { no -> no > 0 }
    println(result()) // valid
}