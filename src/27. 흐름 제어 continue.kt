fun main(args:Array<String>):Unit
{
    var i=0
    while(i<10)
    {
        i+=1
        if(i%2==0) //짝수이면
            continue //continue아래의 문장들을 모두 skip
        print(i)
    }
}

/*
continue : 반복무느이 일부문장을 무시하고 건너뛸 수 있음

 */
