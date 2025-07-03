package com.example.kotlin.chap05.ex01

// 예제1 타입 별칭 선언
/*
typealias MyInt = Int

fun main() {
    val data1: Int = 10
    val data2: MyInt = 10  // MyInt는 Int의 별칭
}
*/

// 예제2 함수 타입에 대한 타입 별칭 선언
/*
typealias MyFunType = (Int, Int) -> Boolean

fun main() {
    val someFun: MyFunType = { no1: Int, no2: Int ->
        no1 > no2
    }

    println(someFun(10, 20)) // false
    println(someFun(20, 10)) // true
}
*/

// 예제3 변수 선언 시 타입 생략
/*
val someFun = { no1: Int, no2: Int ->
    no1 > no2
}
*/

// 예제4 매개변수 타입을 생략한 함수 선언
typealias MyFunType = (Int, Int) -> Boolean

val someFun: MyFunType = { no1, no2 ->
    no1 > no2
}