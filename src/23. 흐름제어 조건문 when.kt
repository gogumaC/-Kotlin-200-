fun main(args:Array<String>):Unit
{
    val score=64

    when(score/10)
    {
        6->{println('D')}//실행할 문장이 하나일때는 중괄호 생략가능wh
        7->{println('C')}
        8->{println('B')}
        9,10->{println('A')}
        else->{println('F')} //else는 생략가능
    }

    println("test")
}

/*
when (타깃 표현식) :switch 와 비슷
{
    타깃 표현식과 비교할 값->{실행할내용}
}
 */