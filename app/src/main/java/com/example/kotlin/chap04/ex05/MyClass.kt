package com.example.kotlin.chap04.ex05

class MyClass {
    companion object {
        var data = 10

        fun some() {
            println(data)
        }
    }
}

fun main() {
    MyClass.data = 20   // 성공
    MyClass.some()      // 성공
}

/*
Kotlin은 static 키워드가 없고 대신 companion object를 사용함
자바의 정적 멤버(static members)**와 비슷한 용도로 활용
companion object는 해당 클래스의 인스턴스를 만들지 않고도 직접 접근 가능*/
