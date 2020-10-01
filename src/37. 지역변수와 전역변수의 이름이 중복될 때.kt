//한 블록 내에서 변수의 이름은 중복불가능 but 지역, 전역변수끼리는 중복가능
var a=5

fun main()
{
    val a=30
    println(a)  //가까운 a인 지역변수가 인식됨 -> main함수안에서는 지역변수 a가 인식됨
    func()
}

fun func()
{
    println(a)
}