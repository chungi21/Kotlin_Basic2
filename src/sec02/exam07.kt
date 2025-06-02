package sec02

// 코틀린에서 값에 의한 호출은 함수가 또 다른 함수의 인자로 전달될 경우 람다식 함수는 값으로 바로 처리되어
// 그 즉시 함수가 수행된 후 값을 전달하는 예제를 실습

fun main() {
    val result = callByValue(lambda()) // lambda() 호출 후 callByValue()가 호출된다.
    println("result : ${result}")
}

fun callByValue(b:Boolean) : Boolean{
    println("callByValue() 함수 호출")
    return b
}

val lambda : () -> Boolean = {
    println("lambda() 함수 호출 됨")
    true // 문장이 2줄이 있기 때문에 마지막 문장의 값이 반환
}
