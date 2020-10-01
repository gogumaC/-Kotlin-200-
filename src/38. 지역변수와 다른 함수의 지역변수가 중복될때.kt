//서로다른 함수에서 지역변수이름은 중복가능
fun main(args:Array<String>):Unit
{
    val a=52
    println(a)

    printA()
    printA2()
}

fun printA()
{
    val a=17
    println(a)
}

fun printA2()
{
    val a=120
    println(a)
}
