package sec02

// 이름에 의한 람다식 호출에 대한 예제
fun main() {
    val result = callByName(otherLambda)
    println("result : ${result}")
}

fun callByName(b : () -> Boolean) : Boolean { // 람다식이 매개변수로 선언되어 있음
    println("callByName() 함수 호출")
    return b()
}

val otherLambda : () -> Boolean = {
    println("otherLambda 호출")
    true
}