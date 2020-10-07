package ex_property_getter_setter

fun main(args:Array<String>)
{
    val person=Person()
    person.age=-30  // -> person 객체의 age프로퍼티에 값저장 ->이렇게 프로퍼티에 특정값 대입하면 이 프로퍼티에 해당하는 setter가 호출됨
    println(person.age) //person 객체의 age프로퍼티에 저장된 값 읽어옴 -> 프로퍼티에 특정값을 읽어오려고 하면 프로퍼티에 해당하는 getter가 호출됨
    //->0출력
}
