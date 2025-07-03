package com.example.kotlin.chap03.ex02

//예제1 var, val 키워드 선언
/*
val data1 = 10
var data2 = 10


fun main() {
  data1 = 20 //val은 재선언 불가, 오류 발생
  data2 = 20
}
*/

//예제2 타입 선언
/*
val data1: Int // 오류
val data2 = 10 // 성공

fun someFun() {
  var data3: Int
  println("data3 = $data3") // 오류
  data3 = 10
  println("data3 = $data3") // 성공
}

class User {
  val data4: Int // 오류
  val data5: Int = 10 // 성공
}
*/

//예제3 초기화 미루기
/*
lateinit var data1: Int // 오류
lateinit val data2: String // 오류
lateinit var data3: String // 성공
*/

//예제4 Lazy 선언
val data4: Int by lazy {
  println("in lazy...")
  10
}

fun main() {
  println("in main...") //in main...
  println(data4 + 10) // in lazy...
                      // 20
  println(data4 + 10) // 20
}
