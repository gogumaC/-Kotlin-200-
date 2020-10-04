package ex_member_function

class Building
{
    var name="" //건축명
    var date="" //건축일자
    var area=0 //면적(m^2)

    fun print()
    {
        println("이름:"+this.name)
        println("건축일자:"+this.date)
        println("면적:${this.area}m^2")
    }
}

/*
멤버함수(Member Function) : 클래스 안에 내장되어있는 함수
호출 : 변수.멤버함수()
멤버 : 프로퍼티와 멤버함수를 함께 지칭하는말
this. ->this는 멤버함수가 호출될때 어떤객체로부터 호출된것인지를 나타내는 키워드
        ex)building.print() 호출시 this 키워드는 building 참조변수가 가리키는 객체로 치환
      ->this는 생략가능  =>println("이름:"+name) (O)
 */

