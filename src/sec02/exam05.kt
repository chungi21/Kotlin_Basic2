package sec02

// 람다식을 매개변수를 사용하는 고차함수에 대한 실습
fun main() {
    var result : Int = 0

    // hihtOrder()에 람다식이 매개변수로 사용된 부분
    result = hihtOrder({x,y -> x+y}, 10, 20)

    println("result : ${result}")
}

// hihtOrder()함수 실행 -> 함수의 인자로 람다식 sum에 대입 -> sum 매개변수에 할당된 람다식 실행
// -> 결과값을 result에 저장한 후 hihtOrder()함수 종료
fun hihtOrder(sum : (Int,Int) -> Int, a : Int, b: Int): Int {
    return sum(a,b) + a + b
}
