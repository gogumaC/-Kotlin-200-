fun main(args:Array<String>):Unit
{
    var a=15
    val b=11
    if(a>b)//중괄호안 문장이 한문장이라면 중괄호 생략가능
    {
        println("if 안으로 들어옴")
        a-=b//a=a-b
    }
    println(a)
}

//if(boolean 타입 표현식) : 괄호안 내용이 true면 {}내용 실행
//{실행할 내용}