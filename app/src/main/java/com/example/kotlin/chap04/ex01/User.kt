package com.example.kotlin.chap04.ex01

class User {
    var name = "Jeonghyun"
    constructor(name:String) {
        this.name = name
    }

    fun someFun() {
        println("name : $name")
    }
    class SomeClass {}

}

fun main() {
    val user = User("kim")
    user.someFun()
}