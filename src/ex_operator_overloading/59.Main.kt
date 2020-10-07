package ex_operator_overloading

fun main(args:Array<String>)
{
    val pt1=Point(3,7)
    val pt2=Point(2,-6)     //인스턴스 생성및 초기화

    val pt3=pt1+pt2 //Point클래스의 plus멤버함수가 대신 호출
    val pt4=pt3*6   //times멤버함수가 대신호출
    val pt5=pt4/3   //div멤버함수가 대신 호출

    pt3.print()     //각 Point 인스턴스값 출력
    pt4.print()
    pt5.print()
}

//오버로딩 가능한 연산자는 p.168에 표로 정리되어있음

