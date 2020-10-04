package ex_triple_equals

fun main(args:Array<String>)
{
    var a="one"
    var b="one"
    //a,b에 같은 문자열 저장
    // -> String 타입의 리터럴로 이루어진 표현식에서 컴파일러는 새 문자열을 생성하지 않고 하나의 문자열을 가리키도록 한다.
    //a,b->one

    println(a===b)  //->true출력

    b="on"
    b+="e"  //b="one"
    println(a!==b)
    /*
    이와같이 표현식이 리터럴로만 이루어져있지 않으면 a,b가 똑같은 문자열을 지녀도 힙 영역에 새로운 문자열이 만들어진다.
    a->one, b->one
    =>따라서 a,b가 서로 다른 문자열을 가리키므로 ture가 출력된다.
     */

    b=a //b가 가지고 있는 참조값을 a에 저장
    println(a===b)  //->true출력
}

/*
두 참조 변수가 같은 객체를 가리키고 있는지 확인할때
 참조변수1 === 참조변수2 -> 두 참조변수가 같은 객체를 가리킬때 true, 다른 객체를 가리키면 false
 참조변수1 !== 참조변수2 -> 두 참조변수가 다른 객체를 가리키면 true
 */