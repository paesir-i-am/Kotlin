package com.example.kotlin.chap04.ex02

// 예제1 보조 생성자 기본 선언
/*
class SecondaryConstructor {
    constructor(name: String) {
        println("constructor(name: String) call...")
    }

    constructor(name: String, count: Int) {
        println("constructor(name: String, count: Int) call...")
    }
}

fun main() {
    val user1 = SecondaryConstructor("kkang")        // 첫 번째 생성자 호출
    val user2 = SecondaryConstructor("kkang", 10)    // 두 번째 생성자 호출
}
*/

// 예제2 보조 생성자 간의 연결
class SecondaryConstructor(name: String) {
    constructor(name: String, count: Int) : this(name) {
        println("constructor(name: String, count: Int) call...")
    }

    constructor(name: String, count: Int, email: String) : this(name, count) {
        println("constructor(name: String, count: Int, email: String) call...")
    }
}

fun main() {
    val user = SecondaryConstructor("kkang", 10, "a@a.com") // constructor(name: String, count: Int) call...
                                                                                // constructor(name: String, count: Int, email: String) call...
}
