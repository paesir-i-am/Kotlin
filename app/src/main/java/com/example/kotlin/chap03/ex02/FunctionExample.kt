package com.example.kotlin.chap03.ex02

// 예제1 함수 선언
/*
fun some(data1: Int): Int{
  return data1 * 10
}

fun some(data1: Int) {
  data1 = 20 // 오류
}
*/

// 예제2 함수 선언
/*
fun main() {
  // 기본값을 가진 함수 정의
  fun some(data1: Int, data2: Int = 10): Int {
    return data1 * data2
  }

  // 호출 시 두 번째 인자를 생략하면 기본값 10이 사용됨
  println(some(10))       // 출력: 100
  println(some(10, 20))   // 출력: 200
}
*/


// 예제3 매개변수 선언
/*
fun main() {
  // 함수 정의
  fun some(data1: Int, data2: Int): Int {
    return data1 * data2
  }

  // 1. 매개변수 순서대로 호출
  println(some(10, 20))  // 출력: 200

  // 2. 매개변수 이름을 지정하여 순서 바꿔 호출
  println(some(data2 = 20, data1 = 10))  // 출력: 200
}
*/

