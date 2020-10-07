package ex_property_in_constructor

class Car(val name:String, val speed:Int=0)

fun main(args:Array<String>)
{
    val car=Car("My Car")
    println(car.name)
    println(car.speed)
}

/*
    생성자 매개변수앞에 var,val 키워드를 붙이면 동일한 이름의 프로퍼티가 함께 선언됨
    -> 생성자 매개변수에 들어온 이수가 프로퍼티의 초기값이 됨


 */
