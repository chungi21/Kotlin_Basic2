package sec04

// * 인라인 함수
// - 함수가 호출되는 곳에 함수 본문의 내용을 모두 복사해 넣어
// 함수의 분기가 없이 처리되기 때문의 코드의 성능의 향상을 가져오는 함수이다.
// - 단, 짧은 문장을 사용할 때 사용한다.
// - noInline 키워드를 사용하면 호출한 곳에 복사를 시키지 않는다.

fun main() {
    shorFunc(10) {println("첫 번째 호출 : ${it}")}
    shorFunc(20) {println("두 번째 호출 : ${it}")}
}

inline fun shorFunc(x : Int, out : (Int) -> Unit) {
    println("함수 호출 전 ")
    out(x)
    println("함수 호출 후")
}