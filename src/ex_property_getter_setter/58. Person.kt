package ex_property_getter_setter

class Person
{
    var age:Int=0
    get()   //age프로퍼티의 getter   -> 타입은 프로퍼티타입과 같으므로 생략가능
    {
        return field  //field는 실제값이 저장된 프로퍼티 속의 변수를 나타내는 특수 식별자
        //여기서는 return을 이용하여 프로퍼티 속 변수에 저장된 값을 반환
    }

    set(value)      //age프로퍼티의 setter  ->value는 저장하려는 값 -30을 담는 매개변수 -> value타입은 프로퍼티 타입과 같으므로 생략가능
    {
        field=if(value>=0)value else 0  //field는 실제값이 저장되는 프로퍼티속의 변수를 나타내는 '특수 식별자'
                                        //(value>=0)그값을 그대로 저장 ,(value<0)0저장 ->value가 -30이므로 0 저장됨
    }
}

/*
프로퍼티는 클래스에 묶이는 변수라고 지난 예제에서 배웠지만 변수뿐만아니라 Getter/Setter이라 부르는 특수함수도 포함됨.
getter와setter를 정의하면 프로퍼티에 값을 저장하거나 저장된 값을 가져오려고 하는 순간에 원하는 동작 실행시킬 수 있음
==> 프로퍼티의 구조
   실제로 데이터가 저장되는 공간 : Field
   저장된 값을 읽으려고 할때 호출되는 함수 : Getter
   값을 저장하려고 할때 호추로디는 함수 :Setter

==> val 프로퍼티의 setter?
    val 프로퍼티는 초기값을 변경할 수 없으므로 val프로퍼티에서는 getter만 존재하고 setter를 정의하려고 하면 오류가 발생

==> Getter, Setter의 정의하지 않을때
    -> 디폴트 getter,setter가 자동으로 정의됨
    ->프로퍼티의 기본적인 동작은 프로퍼티 속 변수값을 단순히 읽고 쓰는 동작

==>프로퍼티의 getter,setter는 다양한 형태로 정의가 가능함 p.164
 */