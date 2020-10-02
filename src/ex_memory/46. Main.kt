package ex_memory

/*
메모리 힙(heap)영역
    :객체가 만들어지는 메모리

**stack스택 영역과 비교
:힙 영역은 스택과 다르게 임의의 위치에 객체가 생성된다
 */

fun main(args:Array<String>)
{
    val person=object       //person변수를 선언과 동시에 객체로 초기화 -> 이때 변수 선언이 먼저 이루어지므로 스택에 쌓임
                                                                    //-> 이후 object부분이 실행되어 힙영역에 객체 생성

    {
        val name:String="홍길동"
        val age:Int=36
    }

    /*(object{...} 표현식은 힙 영역에서 객체를 생성하며, 갓 생성된 객체의 좌푯값을 가진다.
       person변수에는 객체의 좌표를 저장하기 위한 공간만 존재
        ==> person 변수와 같이 실제값을 가지지않고 객체의 좌표만
       저장하는 변수를 참조변수(Reference Variable)이라고 하고
       객체의 좌푯값은 참조값(Reference Value)라고 부른다.*/

    println(person.name)
    println(person.age)

}
/*
stack영역 : args변수 생성->person 변수생성->
heap 영역 :                               person 객체생성(name, age포함)->
 */