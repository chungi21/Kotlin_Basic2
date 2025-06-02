package sec04

// 인라인 함수와 비지역 반환에 대한 실습
// 코틀린에서는 익명 함수를 종료하기 위해서 return을 사용할 수 가 있다. 
// 이 때는 특적 반환값이 없이 return문만 사용을 해야한다. 
// 인라인 함수에서 사용한 람다식을 빠져 나오려면 인라인 함수에서 사용한 람다식에서 
// return문을 사용하면 된다. 

fun main() {

    shortFunc1(10) {
        println(("Fisrt 함수 호출 ${it}"))
        return
    }


}

inline fun shortFunc1(x : Int, out : (Int)-> Unit) {
    println("함수 호출 전")
    out(x)
    // return문을 람다식에서 사용하여 함수가 종료되어 아래 문장이 실행되지않는다. 
    // 이러한 반환을 비지역 반환(Non-local Return)라고 칭한다. 
    println("함수 호출 후") 
}