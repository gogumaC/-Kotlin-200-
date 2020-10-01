var count=0     //전역변수 : 함수호출이 끝나도 사라지지 않음

fun main(args:Array<String>)
{
    val a=15        //지역변수 : 블록밖으로 나가면 사라짐
    println(a)

    count+=1
    printCount()
    println(count)
}

fun printCount()
{
    println(count)
    count+=1
}
