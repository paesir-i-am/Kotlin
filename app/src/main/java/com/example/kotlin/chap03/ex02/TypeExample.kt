package com.example.kotlin.chap03.ex02

// 예제1 기초 타입
/*
val a1:Byte = 0b00001011
val a2:Int = 123
val a3:Short = 123
val a4:Long = 10L
val a5:Double = 10.00
val a6:Float = 10.0f
val a7:Boolean = true
*/

// 예제2 문자열 표현
/*
fun main() {
  val str1 = "Hello \n World"
  val str2 = """
            Hello
            World
            """
  println("str1 : $str1")
  println("str2 : $str2")
}
*/

// 예제3 null 대입
/*
fun someFun() {
  var data1: Int = 10
  var data2: Int? = null // null 대입 가능

  data1 = data1 +10 // data1 += 10 으로도 가능
  data1 = data1.plus(10) // 객체의 메서드 이용
}
*/

// 예제4 문자 표현
/*
val a:Char = 'a'
if (a == 1) {
  // 에러
}
*/

//예제 5 데이터 출력 기호 $
/*
fun main() {
  // 1부터 no까지의 합을 구하는 함수
  fun sum(no: Int): Int {
    var sum = 0
    for (i in 1..no) {
      sum += i
    }
    return sum
  }

  val name: String = "kkang"
  println("name : $name, sum : ${sum(10)}, plus : ${10 + 20}") // name : kkang, sum : 55, plus: 30
}
*/

// 예제6 Any 타입과 Unit 타입
/*
val data1:Any = 10
val data2:Any = "Hello"

class User
val data3:Any = User()

val data1:Unit = Unit

fun some():Unit {
  println(10 + 20)
}
fun some() {
  println(10 + 20)
}
*/

//예제7 Nothing
/*
val data1:Nothing? = null

var data1:Int = 10
data1 = null // 오류

var data2:Int? = 10
data2 = null // 성공

fun some1():Nothing? {
  return null
}
fun some2():Nothing {
  throw Exception()
}
*/
