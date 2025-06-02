package sec04

// 확장 함수(extention function) 
// - 기존의 클래스(라이브러리, 사용자 정의 클래스)에 자신이 필요로 하는 함수를 도 추가할 수 있는 함수
// String에 새로운 확장 함수를 추가 해보자

fun main() {
    val source = "대한민국"
    val target = "만세"

    println(source.getLongString(target)) // 대한민국

    var str1 = "abcd"
    println(str1.toUpperCase()) // ABCD


}

// String 클래스에 확장함수 getLongString()을 추가하는 코드
fun String.getLongString(target : String) : String {
    if(this.length > target.length){
        return this
    }else{
        return target
    }
}

// 확장 함수를 만들 때 확장하려는 대상에 동일한 이름의 멤버 함수가 존재하면
// 항상 확장함수보다 기존에 라이브러리에 있는 함수가 우선으로 호출된다.
fun String.toUpperCase(target: String) : String {
    return "toUpperCase"
}