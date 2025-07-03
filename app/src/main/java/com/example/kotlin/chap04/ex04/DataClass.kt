package com.example.kotlin.chap04.ex04

// 예제1 데이터 클래스와 일반 클래스 선언
/*
// 일반 클래스
class NonDataClass(val name: String, val email: String, val age: Int)

// 데이터 클래스
data class DataClass(val name: String, val email: String, val age: Int)

// 객체 생성 및 비교
fun main() {
    val non1 = NonDataClass("kkang", "a@a.com", 10)
    val non2 = NonDataClass("kkang", "a@a.com", 10)

    val data1 = DataClass("kkang", "a@a.com", 10)
    val data2 = DataClass("kkang", "a@a.com", 10)

    println("non data class equals : ${non1.equals(non2)}")   // false 일반 클래스는 참조 비교(주소 비교)를 하기 때문에 false
    println("data class equals : ${data1.equals(data2)}")     // true 데이터 클래스는 값 비교(내용 비교)를 하기 때문에 true
}
*/

// 예제2 데이터 클래스의 equals 비교
/*
data class DataClass(val name: String, val email: String, val age: Int) {
    lateinit var address: String

    constructor(name: String, email: String, age: Int, address: String) : this(name, email, age) {
        this.address = address
    }
}

fun main() {
    val obj1 = DataClass("kkang", "a@a.com", 10, "seoul")
    val obj2 = DataClass("kkang", "a@a.com", 10, "busan")

    println("obj1.equals(obj2) : ${obj1.equals(obj2)}") // true
    */
/*
    Kotlin의 data class는 기본적으로 equals()를 주 생성자의 프로퍼티만 가지고 비교
	즉, name, email, age만 비교에 포함 -> address는 lateinit var로 별도 선언되었고 equals() 비교 대상에 포함되지 않음*//*

}
*/

// 예제3 데이터 클래스의 toString()
fun main() {
    class NonDataClass(val name: String, val email: String, val age: Int)

    data class DataClass(val name: String, val email: String, val age: Int)

    val non = NonDataClass("kkang", "a@a.com", 10)
    val data = DataClass("kkang", "a@a.com", 10)

    println("non data class toString : ${non.toString()}") //non data class toString : com.example.kotlin.chap03.ex04.DataClassKt$main$NonDataClass@65b3120a
    println("data class toString : ${data.toString()}") //data class toString : DataClass(name=kkang, email=a@a.com, age=10)
/*
        data class는 toString(), equals(), hashCode(), copy() 메서드를 자동 생성
        일반 클래스에서는 필요하면 toString()을 직접 오버라이드해야 함 */
}
