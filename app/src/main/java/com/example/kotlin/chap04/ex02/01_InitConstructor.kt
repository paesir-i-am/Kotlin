package com.example.kotlin.chap04.ex02

// 예제1 Init 생성자 지정
/*
class InitConstructor(name: String, count: Int) {
    init {
        println("i am init....")
    }
}

fun main() {
    val user = InitConstructor("kkang", 10) //i am init....
}
*/

// 예제2 생성자 매개변수를 init 블록에서 사용
/*
class InitConstructor(name: String, count: Int) {
    init {
        println("name : $name, count : $count")  // 성공
    }

    fun someFun() {
        println("name : $name, count : $count") // 오류: 지역 변수 접근 불가
    }
}
*/

// 예제3 생성자 매개변수를 클래스 멤버 변수로 선언
class InitConstructor(val name: String, val count: Int) {
    fun someFun() {
        println("name : $name, count : $count")  // ✅ 성공
    }
}

fun main() {
    val user = InitConstructor("kkang", 10)
    user.someFun() // name : kkang, count : 10
}
