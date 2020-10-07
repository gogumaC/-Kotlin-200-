package ex_indexed_access_operator

class Person(var name:String,var birthday:String)
{
    operator fun get(position:Int):String  //[]연산자 오버로딩하는 get 멤버함수 선언->position에 해당하는 위치의 프로퍼티값 반환
    {
        return when(position)
        {
            0->name
            1->birthday
            else->"알수없음"
        }
    }

    operator fun set(position: Int,value:String)//[]연산자 오버로딩하는 set멤버함수 선언->position에 해당하는 위치의 프로퍼티값을 vlaue로 변경
    {
        when(position)
        {
            0->name=value
            1->birthday=value
        }
    }
}

/*
[]연산자 : 표현식[표현식] 형태로 적음 -> 객체의 일부값을 추출해낼때 사용
오버로딩 :get,set
 */