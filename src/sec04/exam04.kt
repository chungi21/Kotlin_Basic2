package sec04

// crossinline 키워드를 이용하여 비지역 반환을 금지해야 하는 내용을 람다식에 사용

fun main() {
    shortFunc2(10) {
        println(("Second 함수 호출 ${it}"))
        // return // retund문 사용 불가 why? crossinline을 붙였기 때문에
    }
}

inline fun shortFunc2(x : Int, crossinline out : (Int) -> Unit) {
    println("함수 호출 전")
    out(x)
    println("함수 호출 후")
}