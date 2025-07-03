package com.example.kotlin.chap04.ex03

// 예제1 상위 클래스에 생성자가 있는 경우 -> 하위 클래스에서 직접 호출
/*
open class Super(name: String) {
    // 상위 클래스의 주 생성자
}

class Sub(name: String) : Super(name) {
    // 하위 클래스의 생성자에서 상위 클래스의 생성자 호출
}
*/

// 예제2 하위 클래스에 보조 생성자만 있는 경우 super 사용
/*
open class Super(name: String) {
    // 상위 클래스의 주 생성자
}

class Sub : Super {
    constructor(name: String) : super(name) {
        // 보조 생성자에서 상위 클래스의 생성자 호출
    }
}
*/

// 예제3 상속 관계 클래스에서 멤버 접근
/*
open class Super {
    var superData = 10

    fun superFun() {
        println("i am superFun : $superData")
    }
}

class Sub : Super()

fun main() {
    val obj = Sub()
    obj.superData = 20
    obj.superFun() // i am superFun : 20
}
*/

// 예제4 오버라이딩
/*
open class Super {
    open var someData = 10
    open fun someFun() {
        println("i am super class function : $someData")
    }
}

class Sub : Super() {
    override var someData = 20
    override fun someFun() {
        println("i am sub class function : $someData")
    }
}

fun main() {
    val obj = Sub()
    obj.someFun() //i am sub class function : 20
}
*/

//예제5 접근제한자
/*
open class Super {
    var publicData = 10              // public: 어디서나 접근 가능
    protected var protectedData = 20 // protected: 상속받은 클래스 내에서만 접근 가능
    private var privateData = 30     // private: Super 클래스 내부에서만 접근 가능
}

// 하위 클래스에서 접근 시도
class Sub : Super() {
    fun subFun() {
        publicData++         // 성공: public
        protectedData++      // 성공: protected
        privateData++        // 오류: private은 Super 클래스 내부에서만 접근 가능
    }
}


// 외부 객체에서 접근 시도
fun main() {
    val obj = Super()

    obj.publicData++          // 성공
    obj.protectedData++       // 오류: protected는 외부에서 접근 불가
    obj.privateData++        // 오류: private도 외부에서 접근 불가
}
*/
