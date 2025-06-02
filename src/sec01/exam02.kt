package sec01

// 간단한 계산기 만들기
// * 예외 처리 try~catch
// - 즉 잘못된 값이 들어오면 catch문에서 그 예외를 잡아 처리해준다.

fun main() {

    println("첫 번째 숫자를 입력 : ")
//    var num1 = Integer.parseInt(readLine()) // 문자열을 숫자로 바꾸는 코드
    var num1:Int = try{
        Integer.parseInt(readLine())
    }catch(e: NumberFormatException){
        println("잘못된 문자를 입력하였습니다. 정수만 입력이 가능합니다.")
        return
    }

    println("두 번째 숫자를 입력 : ")
    // var num2 = Integer.parseInt(readLine()) // 문자열을 숫자로 바꾸는 코드
    var num2:Int = try{
        Integer.parseInt(readLine())
    }catch(e: NumberFormatException){
        println("잘못된 문자를 입력하였습니다. 정수만 입력이 가능합니다.")
        return
    }


    println("어떤 +, -, *, /, % 중 연산을 하시겠습니까?")
    var operator:String? = readLine()
    if(operator=="+" || operator=="-" || operator=="*" || operator=="/" || operator=="%"){
        var result = 0;

        if(operator=="+"){
            result = add(num1, num2)
        }else if(operator=="-"){
            result = substract(num1, num2)
        }else if(operator=="*"){
            result = multipaly(num1, num2)
        }else if(operator=="/"){
            result = divide(num1, num2)
        }else if(operator=="%"){
            result = remains(num1, num2)
        }

        println("입력하신 ${num1} ${operator} ${num2}  = ${result} 입니다.")
    }else{
        println("잘못된 문자를 입력하였습니다. +, -, *, /, %만 가능합니다.")
        return
    }

}
// 더하기 함수
fun add(x:Int, y:Int) = x+y

// 빼기 함수
fun substract(x:Int, y:Int) = x-y

// 곱셈 함수
fun multipaly(x:Int, y:Int) = x*y

// 나눗셈 함수
fun divide(x:Int, y:Int) = x/y

// 나머지 함수
fun remains(x:Int, y:Int) = x%y