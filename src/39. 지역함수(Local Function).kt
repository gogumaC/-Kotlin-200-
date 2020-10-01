fun main(args:Array<String>)
{
    //지역함수 : 블록안에서 선언된 함수, 어떤 함수가 특정함수 안에서만 사용될때 이용
    fun printFomular(a:Int,b:Int)
    {
        println(a*b+a-b)
    }

    printFomular(73,1)
    printFomular(4,6)
}