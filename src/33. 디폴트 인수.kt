fun main(args:Array<String>)
{
    println(getAverage(89,96))
    getAverage(100,50,true)
    println(getAverage(90))
    getAverage(66,print=true)
    getAverage(print=true,a=10,b=30)
}

fun getAverage(a:Int=0,b:Int=0, print:Boolean=false):Double  /*매개변수 선언과 동시에 디폴트값으로 초기화
                                                                -> 함수호출시 매번 해당 매개변수에 인수지정 안해도됨
                                                                -> 인수가 지정되지 않은 매개변수는 디폴트값으로 초기화됨
                                                                -> 중간에 있는 인수는 생략이 불가능하며 오른쪽부터 하나씩 생략가능
                                                                -> 인수를 전달할 매개변수의 이름을 직접 지정하면 중간에 있는 인수도 생략가능
                                                                */
{
    val result=(a+b)/2.0
    if(print)
        println(result)
    return result
}


/* 주의점

매개변수의 이름을 지정한 인수는 일반 인수보다 항상 오른쪽에 있어야한다.
따르지 않을경우 오류발생
-> MIxing named and positioned arguments is not allowed
 */
