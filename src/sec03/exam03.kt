package sec03

import java.util.concurrent.locks.ReentrantLock

// 고차 함수와 람다식 사례
// 동기화를 위한 코드 구현 사례
// 동기화 : 변경이 일어나면 안 되는 특정 코드를 보호하기 위한 잠금 기법을 의미한다.
// 동기화로 보호되는 코드는 임계영역(Critical Section)이다.
// 프로그래밍을 하다 보면 특정한 공유자원이나 공유객체를 서로 사용할 때 무분별하게 누구나
// 다 접근해서 사용한다면 데이터 신뢰성 자체가 보장이 되지않는다.
// 하여 동기화로 처리해서 데이터의 신뢰성을 높인다.


var sharable = 1 // 공유 자원(보호가 필요한 변수), 전역변수이며 프로그램 라이프 사이클과 같이 움직인다.

fun main() {
    val reLock = ReentrantLock() // ReentrantLock() 생성자 호출하여 잠금처리를 해줄 인스턴스를 생성

    lock(reLock,{criticalFunc()})
    lock(reLock) {criticalFunc()} // lock함수의 마지막 매개변수가 람다식이라서 이렇게 호출 가능함
    lock(reLock,::criticalFunc) // 일반 함수 참조(::)

    println("sharable 의 값 : ${sharable}")
}

fun criticalFunc(){
    // 보호되어야 하는 변수
    sharable += 1
}

// 제네릭 타입으로 제네릭 함수를 설계
// T는 Type의 약자로 보면된다.
// T로 설계된 것은 어떤 타입이 들어와도 된다.
fun <T> lock(reLock : ReentrantLock, body : () -> T) : T {
    reLock.lock() // 잠금
    // 예외 처리 구문 : try~catch~finally
    try{
        // 실행 코드
        return body()
    }finally{
        // finally 구문은 실행 코드 구문에 예외가 발생하든 안하든 무조건 실행이 된다.
        reLock.unlock()
    }
}