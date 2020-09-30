fun main(args:Array<String>):Unit
{
    val value:Int=if(10>5)//10>5가 참이면 value는 10, 아니면 5
    {
        println("10은 5보다 크다.")
        10
    }
    else
    {
        println("10은 5보다 크지 않다.")
        5
    }

    println(value)
}