package ex_garbage_collection
/*
가비지 컬렉션(Garbage Collection)
    : 미아 객체(어떤 참조변수에도 할당되지 않은 힙메모리 내의 객체 -49참조)를 수거해가는 기능
    :적당히 쌓이면 시스템이 알아서 자동으로 가비지 컬렉션 수행하여 쓰레기 객체를 수거한다 -> 신경안써도 된다!
    :이때는 삭제할 미아 객체들을 탐색해야 하기 때문에 순간적으로 프로그램이 멈추는 프리징현상이 나타날 수 있다.
 */
fun main(args:Array<String>)
{
    var result=""
    var i=1

    while(i<=100)
    {
        result+="$i"
        i+=1
    }

    println(result)
}