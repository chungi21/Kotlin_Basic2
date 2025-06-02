package sec03

// 일반 매개변수와 람다식 매개변수를 같이 사용하는 실습
fun main() {
    // 인자와 함께 람다식을 사용하는 경우
    withArgs("매개변수1", "매개변수2", {x,y -> "대한민국! $x $y"}) // 대한민국! 매개변수1 매개변수2

    // withArgs() 함수의 람다식이 매개변수의 마지막 값이라면.. 아래와 같이 호출이 가능하다.
    // 람다식의 코드가 간단한 것이라면 소괄호 안에 같이 호출하는 것이 좋겠지만
    // 만약에 람다식의 내용이 길다면 되려 가독성이 떨어지기 때문에 아래 방법1과 같이 호출이 가능하다.
    // 방법2,3과 같이 호출이 가능하다 괄호가 생략을 할 수 없으며, 아울러 람다식이 복잡하면 호출할 때 코드가
    // 굉장히 길어지므로 가독성이 떨어지게된다.
    withArgs("아자아자","화이팅") {x,y -> "대한민국! $x $y"} // 대한민국! 아자아자 화이팅 -- 방법1
    withArgs1({x,y -> "대한민국! $x $y"},"아자아자","화이팅") // 대한민국! 아자아자 화이팅 -- 방법2
    withArgs2("아자아자", {x,y -> "대한민국! $x $y"},"화이팅") // 대한민국! 아자아자 화이팅 -- 방법3

    twoLambda({a,b -> "대한민국 $a $b"}, {"만세$it"}) // 대한민국 one two 만세!
    twoLambda({a,b -> "First $a $b"}, {c -> "Second$c"}) // First one two Second!

}

fun withArgs(x : String, y : String, out : (String,String) -> String) {
    println(out(x,y))
}

fun withArgs1(out : (String,String) -> String, x : String, y : String) {
    println(out(x,y))
}

fun withArgs2(x : String, out : (String,String) -> String, y : String) {
    println(out(x,y))
}

// 람다식 매개변수를 2개를 가지는 일반 함수
fun twoLambda(first : (String, String) -> String, second : (String) -> String) {
    print(first("one","two "))
    println(second("!"))
}