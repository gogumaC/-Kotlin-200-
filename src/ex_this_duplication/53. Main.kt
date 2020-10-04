package ex_this_duplication

class AAA
{
    var num=15

    fun memberFunc(num:Int)
    {
        println(num) //매개변수로 인식
        println(this.num)   //프로퍼티로 인식

    }
}

fun main(args:Array<String>)
{
    val a=AAA()
    a.memberFunc(53)
}

//멤버함수의 매개변수와 프로퍼티의 이름은 중복가능
//멤버함수 내에서 프로퍼티로 인식시키고 싶으면 this.을 이용