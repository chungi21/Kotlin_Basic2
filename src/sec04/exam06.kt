package sec04

// 중위 함수(Infix Notation)
// - 클래스의 멤버(멤버변수, 멤버함수)를 호출할 때 접근 연산자(.)를 생략하고 함수 이름 뒤에
// () 소괄호를 붙이지 않아 직관적인 이름을 사용할 수 있는 표현법이다.
// - 중위 함수 3가지 조건
//  - 멤버 메서드이거나 또는 확장함수여야 한다.
//  - 하나의 매개변수만 가져야한다.
//  - 반드시 infix 키워드를 사용하여 정의해야 한다.

fun main() {
    val a = 10
    println(10.multiply(3)) // 30 // 일반적으로 함수 호출하는 방법 사용

    println(3 multiply 10) // 30 // 마치 연산자 처럼 사용되어지고 있다. why? infix키워드를 붙였기 때문에
}

infix fun Int.multiply(x : Int) : Int{
    return  this * x
}