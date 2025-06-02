package sec01

// 매개변수를 제대로 활용하기

fun main() {
    printInfo("Jinny","Jinny@email.com") // Jinny의 Email은 Jinny@gmail.com 입니다.
    printInfo("Kate","Kate@email.com") // Kate의 Email은 Kate@gmail.com 입니다.
    
    // 함수가 잘 작동을 하는데 이메일 주소를 가지고 있지 않은 사람이 있다면??
    // 함수의 매개변수의 기본값(디폴트 인자값)을 이용하면 된다.
    printInfo("Limi") // Limi의 Email은 이메일없음 입니다.
    printInfo("","xxx@email.com") // 의 Email은 xxx@email.com 입니다.

    defaultArg() // 100 + 200 = 300
    defaultArg(200) // 200 + 200 = 400

    // add() // z에 defaul값이 없어 error가 난다.
    add(z=50) // 100 + 200 + 50 + 400 = 750 // 매개변수 명을 지정할 수 있으니 어떤 값이 전달되었는지 한 눈에 알 수가 있다.
    // add(x=40,y=40) // 실행이 안된다. z값이 없으므로
    add(x=30,y=70,z=90,a=8)

    // 가변인자 함수 호출
    printVarArgs(1,2,3,4) // 1, 2, 3, 4,
    printVarArgs(1,2,3,4,5) // 1, 2, 3, 4, 5,

}

// print() 함수는 디폴트 인자값을 설정하고 함수가 만들어져 있다.
fun printInfo(name:String="아무개", Email:String="이메일없음") : Unit {
    println("${name}의 Email은 ${Email} 입니다.")
    return
}

fun defaultArg(x:Int=100, y:Int=200) : Unit {
    println("${x} + ${y} = ${x+y}")
}

// 매개변수가 4개나 존재한다.
// 이 함수를 존재할 때는 반드시 z값은 명시를 해야한다.
fun add(x:Int=100, y:Int=200,z:Int, a:Int=400) {
    println("${x} + ${y} + ${z} + ${a} = ${x+y+z+a}")
}

// vararg는 가변인자값을 이용하여 매개변수가 몇 개가 되든지 간에 다 받아서 출력을 해준다.
// counts는 Int배열이 되어서 for문 통하여 출력을 하는 것이다.
// 가변인자는 "인자의 개수가 변한다"를 의미한다.
fun printVarArgs(vararg counts:Int) : Unit {
    for(num in counts){
        print("$num, ")
    }
    println()
}








