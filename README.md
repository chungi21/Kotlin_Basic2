<H2>src 밑에 해당 파일들에 대한 설명</H2> 

## sec01

### exam01.kt

- 함수 기초와 사용 예제
- Point
    - 함수는 코드의 재활용을 위해 사용.
    - 함수는 입력값(인자)과 반환값(return)이 있을 수도, 없을 수도 있음.
    - **main() 함수는 프로젝트당 하나만 존재**해야 하며 프로그램의 진입점.
    - **지역 변수**는 함수가 끝나면 **스택 프레임에서 제거됨** (LIFO 구조).
    - `Scanner`를 사용해 사용자 입력 받기.

### exam02.kt

- 계산기 만들기 + 예외 처리
- Point
    - `try~catch`로 잘못된 입력(예: 문자)을 예외 처리 (`NumberFormatException`)
    - `readLine()`을 사용해 문자열 입력 받기 → `Integer.parseInt()`로 변환.
    - 사용자가 연산자 `+`, , , `/`, `%` 중 선택해 계산 수행.

### exam03.kt

- 반환값 없는 함수 (`Unit`)
- Point
    - Kotlin에서 **반환값이 없으면 `Unit`을 반환**.
    - `Unit`은 Java의 `void`와 비슷하지만 객체화된 타입임.
    - `return`문은 생략 가능. 써도 `return` 뒤에 값 없이 써야 함.

### exam04.kt

- 디폴트 인자값 & 가변인자 함수
- Point
    - **기본값(default value)** 제공으로 오버로딩을 줄이고 유연한 함수 호출 가능.
    - **매개변수 이름 지정 가능** → 명확한 파라미터 전달.
    - `vararg`를 사용하면 **가변 인자(여러 개 인자)를 배열처럼 처리** 가능.
 <br><br><hr>

## sec02

### exam01.kt

- 고차 함수의 개념 소개
- 일반 함수로 고차 함수 구현
- `sum()`과 `mul()` 함수 예시
- Point
    - `mul(sum(10, 5), 5)` → 함수가 함수의 인자로 전달되므로 **고차 함수**
    - 함수형 프로그래밍, 일급 객체, 순수 함수에 대한 기본 개념 설명

### exam02.kt

- 함수를 반환값으로 사용하는 고차 함수 예시
- Point
    - `funcFunc()`이 `add()` → `remaind()`를 호출
    - `add()`는 일반 함수지만, 고차 함수의 요건(`함수 반환 또는 전달`)을 충족

### exam03.kt

- 람다식을 변수에 할당하고 사용하는 고차 함수
- Point
    - `val multi = {x:Int, y:Int -> x * y}`
    - 람다식은 **일급 객체**이며, 변수에 할당 가능
    - 람다식을 직접 호출 → 고차 함수 활용 방식 학습

### exam04.kt

- 람다식 문법의 축약형 이해 및 중첩 람다식
- Point
    - 다양한 람다식 표현법 (`(Int, Int) -> Int` 생략, 추론 등)
    - `val greet = { println("Hi~") }` → 인자/반환형 없는 람다
    - `val nested = { { println("nested 람다식") } }` → **중첩 람다식** 구조

### exam05.kt

- 람다식을 인자로 사용하는 고차 함수
- Point
    - `hihtOrder({x,y -> x+y}, 10, 20)` → 람다식 전달
    - 고차 함수 `hihtOrder()`는 람다식 실행 후 그 결과에 추가 연산

### exam06.kt

- 인자와 반환값이 없는 람다식, 변수에 할당 및 전달
- Point
    - `val out = { println("대한민국 만세!") }`
    - 람다식은 인자 없이도 정의 가능하며, `Unit`을 반환
    - **함수 자체를 변수처럼 사용** 가능하다는 점 강조
    - 코틀린은 **값에 의한 호출(Call by Value)** 방식만 존재

### exam07.kt

- 람다식을 호출하면서 값으로 전달되는 구조(Call by Value)
- Point
    - `callByValue(lambda())` → `lambda()` 먼저 호출됨
    - 람다식 결과가 `Boolean`으로 반환되어 전달
    - 람다식도 호출 즉시 실행되는 값이라는 점을 설명

### exam08.kt

- 람다식을 이름에 의한 호출(Call by Name)처럼 사용하는 예제
- Point
    - `callByName(otherLambda)` → 호출 시점까지 `otherLambda()` 실행 안됨
    - 람다식을 **함수처럼 전달하고, 실행 시점 제어** 가능
    - 실질적으로는 Call by Name은 아니지만 유사한 동작을 보임

### exam09.kt

- 함수 참조(::)와 고차 함수 결합 사용
- Point
    - `::plus`, `::text` → 일반 함수 참조 전달
    - `funcParam(3,2,::plus)`처럼 함수 이름 참조 가능
    - 함수 참조를 변수처럼 다루기 (`val likeLambda = ::plus`)
    - 람다식 또는 일반 함수 참조 모두 고차 함수의 인자로 사용 가능

<br><br><hr>
## sec03

### exam01.kt

매개변수 개수에 따라 람다식을 구성하는 방법에 대해서 실습

### exam02.kt

일반 매개변수와 람다식 매개변수를 같이 사용하는 실습

### exam03.kt

- 고차 함수와 람다식 예제 코드
- 동기화를 위한 코드 구현 예제 코드

<br><br><hr>
## sec04

### exam01.kt

- 익명 함수와 람다식
- Point
    - `return`, `break`, `continue`는 람다식에서 직접 사용 불가 → 라벨(`@label`)과 함께 사용.
    - `forEach` 내에서 라벨을 사용해 람다를 빠져나올 수 있음.

### exam02.kt

- 인라인 함수(inline) : 함수 호출 부분에 코드가 복사되어 실행됨 → 성능 향상 가능.
- Point
    - 코드가 짧을 때 사용, 함수 호출 오버헤드 감소.
    - `noinline` 키워드 사용 시 복사 금지 가능.

### exam03.kt

- 인라인 함수와 비지역 반환
- Point
    - 인라인 함수 내 람다식에서 `return`을 사용하면 **비지역 반환(Non-local Return)** 발생.
    - `return`이 람다뿐 아니라 호출한 함수도 종료시킴.

### exam04.kt

- `crossinline`
- Point
    - `crossinline` 키워드: **람다식에서 비지역 반환 금지**.
    - 인라인 함수 안에서 `return` 사용 시 컴파일 오류 발생 → 안전한 람다 사용 보장.

### exam05.kt

- 확장 함수(Extension Function)
- Point
    - 기존 클래스에 **새로운 함수 추가** 가능.
    - `fun String.getLongString(...)` → `String` 클래스 확장 예시.
    - 동일 이름의 멤버 함수가 있으면, **기존 함수가 우선 호출**됨.

### exam06.kt

- 중위 함수 (Infix Function)
- Point
    - `infix` 키워드 필수.
    - 멤버함수 또는 확장함수.
    - 매개변수 1개.

### exam07.kt

- 재귀 함수와 꼬리 재귀 (Tail Recursion)
- Point
    - **`tailrec` 키워드**: 컴파일 시 반복문으로 최적화 → **스택 오버플로우 방지**.
    - `tailrec` 함수는 마지막에 자기 자신을 호출하는 경우에만 적용 가능.
