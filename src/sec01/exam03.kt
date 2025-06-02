package sec01

// 함수의 반환  값이 없다면 함수는 반환값을 생략할 수 가 있다.
// 반환값이 없으니 당연히 return문도 필요 없다.
// 대신 Unit을 반환형으로 지정하거나 생략할 수 있다.(생략보다는 지정을 지향 why? 리턴타입이 Unit이구나 생각할 수 있도록)
// Unit은 코틀린에서 반환값이 없을 떄의 자료형이다! 라는 점을 기억하자.
// 자바의 void와 비슷한 개념이기는 하나 코틀린의 Unit은  void 객체를 통합해놓은 것이랑 같다고 생각하자.

fun main() {
    printAdd(10,20)
    printSum(20,30)
}

// 반환타입 Unit을 생략하지 않은 경우
fun printAdd(x:Int, y:Int) : Unit {
    // return x+y // 반환타입이 Unit으로 없는데 return문에 수식이 들어가서 Int형으로 리턴을 하니 typemismatch가 일어난다.
    println("${x} + ${y} = ${x+y}")
    return // Unit이라는 반환형이라도 return문 뒤에 아무런 값을 적지 않으면 상관없다.
}

// 반환타입 Unit을 생략한 경우
fun printSum(x:Int, y:Int) {
    println("${x} + ${y} = ${x+y}")
    return // Unit이라는 반환형이라도 return문 뒤에 아무런 값을 적지 않으면 상관없다.
}
