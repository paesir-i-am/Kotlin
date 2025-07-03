package com.example.kotlin.chap05.ex02

// 예제1 직접 null 체크하는 방식
/*
fun main() {
    var data: String? = null

    val length = if (data == null) {
        0
    } else {
        data.length
    }

    println("data length : $length") // data length : 0
}
*/

// 예제2 Kotlin null-safe 연산자 사용
/*
fun main() {
    var data: String? = null

    println("data length : ${data?.length ?: 0}") // data length : 0
}
*/


// 예제3 널 허용 vs 널 불허
/*
var data1: String = "kkang"
data1 = null        // 오류

var data2: String? = "kkang"
data2 = null        // 성공

// 예제4 NullPointerException
var data: String? = "kkang"
var length = data.length  // 오류, 컴파일 시 NPE 가능성

// 예제5 안전한 호출 연산자 사용
var data: String? = "kkang"
var length = data?.length  // 성공
*/
