package sec04

// 코틀린에는 일반 함수, 고차 함수, 람다식 함수가 있다.
// 그런데 이 3가지 함수 외에 또 존재하는 다양한 형태의 함수들이 존재한다.
// 일반함수의 익명함수, 인라인 함수(함수를 호출한 곳에 복사해서 코들를 넣어서 분기를 타지 않게 장점)
// 익명함수(Anonymous Function) : 일반 함수이긴 하지만 함수의 이름이 없는 함수

fun main() {

    val add : (Int, Int) -> Int = fun(x,y) = x+y // 익명 함수를 add 변수에 할당
    println(add(10,20))

    val add1 = fun(x:Int, y:Int) : Int = x+y // 익명 함수를 add1 변수에 할당
    println(add1(30,40))

    val add2 = {x:Int, y:Int -> x+y}
    // 익명 함수는 람다식 표현법과 매우 유사하기 때문에 동일하게 만드는 것은 어렵지 않다.
    println(add2(130,140))

    // 코틀린에서는 람다식을 사용하면 되는데 return, continue, break문 등을 사용할 수가 없다.
    // 사용을 하고 싶다면..ex() 과 같이 사용한다.
    // @라벨이름 형태로 람다식의 시작 위치에 라벨이름@를 지정한다.
    // val add3 = (x:Int, y:Int) -> {return x+y} // 자바에서는 가능
    ex()
}

fun ex(){
    val list = listOf(1,2,3,4,5)
    list.forEach labelName@{
        if(it===3){
            println("return")
            return
        }
        println(it)
    }
}

// fun(x:Int, y:Int) : Int = x + y // 함수 이름이 생략된 익명 함수 // 할당되지않아 error가 나는것