package sec01

import java.util.*

// * 함수
// - 여러 값(인자)을 입력을 받아 기능을 수행하고 결과값을 반환 or 반환x 하는 코드의 모음
// - 함수는 인자값 혹은 매개변수가 없어도 상관없고, 반환값도 없어도 상관없다.
// - 함수를 사용하는 궁극적인 목적은 바로 코드의 재활용이다.
// - 함수는 선언부와 정의부(구현부, 몸체)로 나뉘며 선언부가 정의부보다 훨씬 중요하다.

fun main() { // main() 함수는 프로젝트에서 하나만 존재해야 한다.
    //  main() 함수 본문인 중괄호 안에 있는 지역변수는 첫 번째 스택 프레임에 들어간다.
    // 지역변수는 함수가 종료됨과 동시에 삭제가 되는 변수이다.
    // main()에서 sum()함수를 호출하여 두 번째 스택 프레임에 들어간다.
    // 지역변수로는 a,b가 존재하는 영역이다.
    // sum()함수가 기능을 다 하고 리턴하면서 스택 프레임에서 사라지고 마지막으로 main()도 역시 코드를
    // 다 실행하고 스택 프레임이 삭제가 되어 스택이 비워진다.
    // 스택 : 후입선출(LIFO)
    // 큐 : 선입선출(FIFO)

    var sc : Scanner = Scanner(System.`in`)

    var num1 = 0
    var num2 = 0
    var result = 0

    println("첫 번째 숫자를 입력해주세요.")
    num1 = sc.nextInt()
    println("두 번째 숫자를 입력해주세요.")
    num2 = sc.nextInt()
    result = sum(num1,num2)
    println("함수 호출 후 result 값 : ${result}")

    sc.close()

}

// 기본적인 함수의 원형
// 선언부 : fun키워드 + 함수명(매개변수):리턴타입
// 구현부(정의부) : {..}에 작성된 코드
fun sum(a:Int, b:Int) : Int{
    var hqp : Int = a+b // 지역변수 : 함수 내에 선언된 변수이다. 함수 종료와 함께 사라진다.
    return  hqp // 함수는 return을 만나면 자동으로 종료가 이루어진다.
}

// 함수의 코드를 줄이는 내용
// 방법1
fun sumMethod1(a:Int, b:Int) : Int{
    return a + b
}

// 방법2 - 함수의 중괄호 안에 코드가 한 줄이면 중괄호와 return문을 생략할 수 있다.
fun sumMethod2(a:Int, b:Int) : Int = a+b

// 방법3 - Int형끼리 더해서 return을 하면 컴파일러가 타입을 추론한다.
fun sumMethod3(a:Int, b:Int) = a+b
