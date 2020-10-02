package ex_string_plus

fun main(args:Array<String>)
{
    var first="Hello"
    var second="World"
    first+=second       //기존 문자열은 그대로 남고 합쳐진 문자열이 새로 생성되어 first에 할당됨 -->그렇다면 메모리가 계속 낭비된다!-->50. 가비지 컬렉션에서 해결
}

/*
참조타입 : 스택이 아닌 힙영역에 실제 공간이 할당되는 타입
        :Byte, Short, Int, Long, Float, Double, Char, Boolean제외한 모든 타입

        ->String타입
            :문자역은 힙영역에 생성되며,String변수는 문자열의 참조값을 저장하기 위한 공간만 가짐
 */

/*
스택영역 : args -> first   -> second
힙 영역 :          "Hello" -> "World"  ->"Hello World"(first)
 */