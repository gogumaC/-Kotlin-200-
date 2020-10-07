package ex_operator_overloading

class Point(var x:Int=0, var y:Int=0)
{
    operator fun plus(other:Point):Point            //멤버함수 정의문앞에 operator : Point인스턴스간에 연산자를 이용했을떄 이 멤버함수를 대신 호출해라
    {            //plus함수의 매개변수는 반드시 1개, 매개변수탑입과 함수반환타입은 마음대로
        return Point(x+other.x,y+other.y)
    }

    operator fun minus(other:Point):Point//minus : -연산자 오버로딩
    {
        return Point(x-other.x,y-other.y)
    }

    operator fun times(number:Int):Point
    {
        return Point(x*number,y*number)
    }

    operator fun div(number: Int):Point
    {
        return Point(x/number,y/number)
    }

    //좌표값 출력
    fun print()
    {
        println("x:$x,y:$y")
    }

}

/*
사용자 정의 클래스에서 연산자를 사용할 수 있게 하는방법
->원래 클래스 객체끼리는 연산자를 사용할 수없지만 연산자 오버로딩을 사용하면가능
 */