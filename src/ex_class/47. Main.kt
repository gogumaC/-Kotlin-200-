package ex_class

/*
class란?
    :객체를 찍어내는 틀

class 정의
    :class 클래스이름
        {
            프로퍼티
        }

 */
class Person
{
    var name:String=""
    var age:Int=0
}

fun main(args:Array<String>)
{
    val person:Person   //class를 선언하면 클래스 이름과 동일한 이름의 타입이 만들어진다.
    person=Person()     //클래스를 선언하면 클래스 이름과 동일한 특수 함수가 같이 선언된다. ->반환타입은 Person, 값은 갓 생성된 객체의 참조값
                        // ->Person()함수를 호출하면 Person클래스의 내용대로 객체가 힙 영역에 만들어진다.
    /*
    클래스로부터 선언된 생성자는 인스턴스(Instance)라고 부름
     */
    person.name="홍길동"   //프로퍼티 값 채워넣음
    person.age=36

    val person2:Person
    person.name="김미영"
    person.age=29

    val person3:Person
    person.name="Jhon"
    person.age=52

}
/*
클래스도 함수와 같이 클래스 단위로 소스파일 분리가능
일반적으로 클래스 하나당 파일 하나로 분리
파일이름은 클래스 이름을 권장
 */


/*
참조변수 사용시 주의점
    : 참조변수를 초기화 하지 않고 프로퍼티에 접근하면 오류발생 -> 참조변수가 어떤 객체를 가리키고 있는지 알수 없기때문
    : 따라서 반드시 참조변수에 Person()을 대입해야함

    오류 : Variable 'person' must be initialized(변수 person은 반드시 초기화 되어야한다.)
 */