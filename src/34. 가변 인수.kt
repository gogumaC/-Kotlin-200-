fun main(args:Array<String>)
{
    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(32,57,12))
    println(getSumOf())
}

fun getSumOf(vararg numbers:Int):Int   //매개변수로 가변인수 설정
{
    val cout=numbers.size      //변수명.size -> 변수 내 인수의 개수
    var i=0; var sum=0

    while (i<cout){
        sum+=numbers[i]
        i+=1
    }
    return sum
}

/* 가변인수

매개변수 앞에 vararg키워드를 붙여서 정의 : 여러개의 인수를 받을 수 있게됨
변수명뒤에 [ ]를 이용하여 순번지정 / 첫번째 위치는 0
가변 매개변수에는 아무 인수도 지정하지 않을 수 있음. 이경우 number.size=0
ex) vararg number:int
 */