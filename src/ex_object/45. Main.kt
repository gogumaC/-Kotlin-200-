package ex_object

/*
객체란?
 : 우리가 인식할 수 있는 물체 또는 물건을 의미
 : 예를 들어 상자, 사람, 가방 등
 : 객체들은 각자의 고유한 속성과 동작을 갖고있다.
 : 소프트웨어 관점에서 객체란 서로 연관있는 변수(속성)들을 묶어놓은 데이터 덩어리를 의미

 객체 정의
 val 변수이름 =object { 프로퍼티... ]

 +) 프로퍼티(property) : 속성/ 객체에 포함된 변수를 의미한다.
 */


fun main(args:Array<String>)
{
    val person = object
    {
        val name:String="홍길동"
        val age:Int=36
    }

    println(person.name)
    println(person.age)
}
