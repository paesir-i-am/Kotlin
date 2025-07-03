package com.example.kotlin.chap03.ex02

// 예제1 Array
/*
val data1: IntArray = IntArray(3) { 0 }         // 크기 3, 초기값 0
val data2: BooleanArray = BooleanArray(3) { false }  // 크기 3, 초기값 false

fun main() {
  val data1: Array<Int> = Array(3) { 0 }  // 크기 3, 초기값 0

  // 배열 요소 값 설정
  data1[0] = 10
  data1[1] = 20
  data1.set(2, 30)  // 2번째 인덱스에 값 설정

  // 배열 요소 값 가져오기
  println(
    """
        array size : ${data1.size} // array size : 3
        array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)} // array data : 10, 20, 30
        """
  )
}
*/

// 예제2 ArrayOf
/*
val data1 = intArrayOf(10, 20, 30)                // IntArray
val data2 = booleanArrayOf(true, false, true)     // BooleanArray

fun main() {
  val data1 = arrayOf<Int>(10, 20, 30)

  println(
    """
        array size : ${data1.size} // array size : 3
        array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)} // array data : 10, 20, 30
        """
  )
}
*/

// 예제3 불변리스트와 가변리스트
/*
fun main() {
  var list = listOf<Int>(10, 20, 30)

  println(
    """
        list size : ${list.size} // list size : 3
        list data : ${list[0]}, ${list.get(1)}, ${list.get(2)} // list data : 10, 20, 30
        """
  )
}

fun main() {
  var mutableList = mutableListOf<Int>(10, 20, 30)

  mutableList.add(3, 40)    // 3번째 인덱스에 40 추가
  mutableList.set(0, 50)    // 0번째 인덱스를 50으로 변경

  println(
    """
        list size : ${mutableList.size} // list size : 4
        list data : ${mutableList[0]}, ${mutableList.get(1)},
                    ${mutableList.get(2)}, ${mutableList.get(3)} // list data : 50, 20, 30, 40
        """
  )
}
*/

// 예제4 Map
fun main() {
  // 불변 Map 생성 (key: String, value: String)
  var map = mapOf<String, String>(
    Pair("one", "hello"),
    "two" to "world"   // 더 간단한 방식
  )

  println(
    """
        map size : ${map.size} //map size : 2
        map data : ${map.get("one")}, ${map.get("two")} // map data : hello, world
        """
  )
}


