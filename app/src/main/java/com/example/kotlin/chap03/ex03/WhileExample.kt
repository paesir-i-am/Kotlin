package com.example.kotlin.chap03.ex03

// while
fun main(args: Array<String>) {
  var x = 0
  var sum1 = 0

  while (x < 10) {
    sum1 += ++x  // x를 먼저 증가시키고, 그 값을 더함
  }

  println(sum1) // 55
}
