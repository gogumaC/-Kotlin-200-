package ex_constructor

class Person constructor(name:String,age:Int)
{
    val name:String //프로퍼티 선언 but 초기화 안함
    val age:Int

    init    //생성자의 매개변수는 init블록 내부에서 사용가능->init블록 안에서 프로퍼티 초기화하면 프로퍼티를 선언과 동시에 초기화 안해도됨
    {
        this.name=name
        this.age=age
    }
}

fun main(args:Array<String>)
{
    val person=Person("홍길동",46)     //-> Person생성자를 호출하며 인수를 전달
    println("이름 : ${person.name}")
    println("나이 : ${person.age}")
}

/*
객체를 생성하면서 동시에 원하는 값으로 한번에 초기화 하는 방법: 생성자(constructor)

생성자란?
    : 객체를 초기화하는 특수 멤버함수
    : 클래스를 정의할때 클래스 이름과 동일한 특수함수가 같이 정의되는데 그 함수가 생성자이다.
    : 클래스에 아무런 생성자를 정의하지 않으면 매개변수가 없는 기본 생성자가 자동으로 정의된다.

생성자 정의
    : class 클래스이름 constructor(생성자의 매개변수 선언)
      { ... }


 */