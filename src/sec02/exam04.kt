package sec02

// 람다식에서 생략할 수 있는 부분에 대해서 알아보자
fun main() {
    // 아무것도 생략되지 않은 전체 표현
    val result1 : (Int, Int) -> Int = {x:Int, y:Int -> x*y}

    // 매개변수에 자료형을 적어주면 선언 자료형을 생략할 수 있다.
    val result2 = {x:Int, y:Int -> x*y}

    // 람다식의 매개변수를 생략한 형태, 앞에 선언 자료형이 있기에 가능하다.
    val result3 : (Int,Int) -> Int = {x,y -> x*y}
    
    // 매개변수의 타입이나 선언 자료형을 코드에 적어주지 않았기에 타입추론 자체가 불가능하여 오류를 발생시킨다.
    // val result4 =  {x,y -> x*y}
    
    // 반환 자료형이 없거나 매개변수가 하나가 있을 때는 표현하는 코드
    // val greet : () -> Unit = { println("Hi~")}
    val greet = { println("Hi~")} // 위에서 코드에서 반환자료형이 없기 때문에 대입연산자를 바로 작성가능하다.
    greet() // Hi~

    // var square : (Int) -> Int = {x -> x*x}
    var square= {x : Int -> x*x} // 위의 코드에서는 반한자료형이 Int가 있기 때문에 축약하고 싶다면 앞에 반환자료형 나타내는 코드를 지우고 매개변수 뒤에 자료형을 써준다.

    println("square(5) : ${square(5)}") // square(5) : 25
    
    // 중첩 람다식(잘 사용x)
    val nested = { { println("nested 람다식")}}
    // nested() // 호출이 안된다.
    val nestedTest = nested() // 중첩된 괄호하나를 지우기 위해 변수에 대입 후 그 변수를 호출해야한다.
    nestedTest() // nested 람다식

}