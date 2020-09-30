fun main(args:Array<String>):Unit
{
    var x=0
    var y=0

    outer@ while (x<=20)  //이름@ 레이블
    {
        y=0
        while(y<=20)
        {
            if(x+y==15&&x-y==5)
                break@outer  //break@이름 : @이름의 반복문에서 탈출
            y+=1
        }
        x+=1
    }

    println("x: $x, y: $y")
}

/*
break의 상위버전
특정 반복문에서 탈출가능
 */
