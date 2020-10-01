fun main(args:Array<String>):Unit
{
    println(cToF(30))   //인수 30이  cToF 함수의 매개변수 celsius에 저장됨
    println(getAverage(89,96))  //인수 :89,96    // 저장되는 매개변수 :a,b
}

fun cToF(celsius:Int):Double  //( ) 안의 값이 매개변수(Parameter) : 함수를 호출한곳으로부터 값을 전달받을떄 이용
{
    return celsius*1.8+32
}

fun getAverage(a:Int,b:Int):Double  //매개변수가 여러개일경우는 콤마 이용
{
    return(a+b)/2.0
}