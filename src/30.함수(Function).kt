fun main(args:Array<String>):Unit
{
    println(myFunction())
    println(myFunction()+10)

}

fun myFunction():Int
{
    val a=3
    val b=6
    println("a: "+a+"b: "+b)
    return a+b
}

/*
함수정의

fun 식별자():반환타입
{함수에 포함시킬 문장}

함수문장이 하나일경우 다음과같이 축약할수있다
fun function():Double = 3.0*7
fun function()=3.0*7
 */
