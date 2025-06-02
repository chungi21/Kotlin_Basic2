package sec02

// 다른 함수의 참조에 의한 일반 함수 호출하는 예제 실습

fun main() {
    val p = {x:Int, y:Int -> x+y}
    val result1 = funcParam(3,2,p) // 람다식을 변수에 할당해서 사용했음

    // val result2 = funcParam(3,2,plus(3,7)) // funcParam()의 마지막 매개변수가 람다식으로 넣어야하기 때문에 아래와 같이 작성할 수 있다.
    val result2 = funcParam(3,2,::plus) // 일반함수의 참조를 얻기 위해서 ::를 사용하여 funcParam()을 호출함
    // ::를 가지고 일반함수의 참조를 하기 위해서는 인자의 수와 자료형이 같아야 하는 조건이 있다.
    println("result1 : ${result1}")

    hello(::text)
    val a = "Jinny2"
    val b = "Jun2"
    hello({a:String, b: String -> text(a,b)})

    val likeLambda = ::plus // 일반 변수에다가 일반 함수 참조
    println(likeLambda(10,50))
}

// 일반 함수
fun plus(x:Int, y:Int) : Int {
    return x+y
}

fun text(x:String, y:String) : String {
    return "Hello! ${x} ${y}"
}

fun hello(body : (String, String) -> String) : Unit {
    println(body("Jinny1","Jun1"))
}

fun funcParam(x:Int, y:Int, z:(Int, Int) -> Int) : Int {
    return z(x,y)
}