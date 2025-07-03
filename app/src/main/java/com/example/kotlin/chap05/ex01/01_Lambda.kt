package com.example.kotlin.chap05.ex01

// 예제1 함수 선언

// 일반 함수 선언
fun sum(no1: Int, no2: Int): Int {
    return no1 + no2
}

// 람다 함수 선언
val sum = { no1: Int, no2: Int -> no1 + no2 }


// 예제2 람다 함수 선언 방식

/*
// 1. 매개변수가 없는 람다
val lambda1 = { -> println("function call") }
// 또는 아래처럼 괄호 생략 가능
val lambda2 = { println("function call") }

// 2. 매개변수 1개인 람다 (명시적 이름 사용)
fun main() {
    val some = { no: Int -> println(no) }
    some(10)
}

// 3. 매개변수 1개인 람다 (it 키워드 사용)
fun main() {
    val some: (Int) -> Unit = { println(it) }
    some(10)
}
*/

/* 타입을 생략하고 it만 쓰게 되면 컴파일 오류 발생
val some = { println(it) }  // 오류: 타입 추론 불가*/

// 예제3 람다 함수 반환문
/*
val some = { no1: Int, no2: Int -> return no1 * no2 }  // 오류
//return은 람다가 아닌 최상위 함수(main 등) 에서 빠져나가게 하므로 컴파일 오류 발생

fun main() {
    val some = { no1: Int, no2: Int ->
        println("in lambda function")
        no1 * no2
    }

    println("result : ${some(10, 20)}")
}
*/
