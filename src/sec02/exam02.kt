package sec02

// 일반 함수를 반환값으로 사용하는 방법
fun main() {
    println("funcFunc()를 호출한 결과 : ${funcFunc()}") // funcFunc()를 호출한 결과 : 7
}

// fun add(x:Int, y:Int) : Int = x+y
fun add(x:Int, y:Int) : Int = remaind(x,y)
fun remaind(x:Int, y:Int) : Int = x%y

// 고차함수가 된다. why? 리턴값으로 일반함수를 사용했기 때문에 고차함수가 된다.
fun funcFunc() : Int = add(2,5)
