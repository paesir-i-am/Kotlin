package com.example.kotlin.chap05.ex02

fun some(data: String?): Int {
    return data!!.length
}

fun main() {
    println(some("kkang"))
    println(some(null))
}

/*
!! == null 아님을 강제 단언 (null이면 예외)
data!!.length
?. == null이면 전체 표현식을 null로 처리
data?.length
?: == null이면 기본값 반환
data?.length ?: -1
*/

//!! 연산자는 디버깅이나 테스트 목적 외에는 실무에서 사용 자제하는 것이 안전