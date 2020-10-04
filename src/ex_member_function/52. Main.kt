package ex_member_function

fun main(args:Array<String>)
{
    val building = Building()
    building.name="A오피스텔"
    building.date="2017-12-13"
    building.area=120*8

    building.print()    //building 객체를 통해 print멤버함수 호출 ->이때 print멤버함수안의 this는 building객체로 치환됨
}

//멤버함수는 객체의 동작역할을 한다.