package sec04

// 재귀(Recursion)
// - 자기 자신을 다시 참조하는 방법을 칭한다.
// - 자기자신을 지속적으로 참조하면 무한하게 대상을 생성할 수도 있다.

// 재귀함수의 조건
// - 무한 호출에 빠지지 않도록 탈출조건을 무조건 만든다.
// - 스택 영역을 이용하므로 호출 횟수를 무리하게 많이 지정하여 연산하지 않는다.
// - 코드를 복잡하지 않게 한다.

fun main() {
    val number = 5
    var result : Long = 0

    result = factorial(number)
    println("Fatorial : ${number}! -> ${result}")

}

fun factorial(n : Int) : Long {
    return if(n == 1) n.toLong() else n * factorial(n-1)
}

// tailrec 키워드가 하는 역할은 꼬리 재귀 함수를 코드가 컴파일 될 때 반복문(while)을 사용한 코드로 변경되게 만든다.
// 스택 오버플로우에서 더욱 안전한 코드가 되는 것이다.
/*
tailrec fun factorial(n : Long, run : Long = 1L) : Long {
    return if(n == 1L) run else n * factorial(n-1, run * n)
}*/
