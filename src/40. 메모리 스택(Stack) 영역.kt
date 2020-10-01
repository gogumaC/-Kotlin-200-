fun main(args:Array<String>)        //스택영역에 매개변수 args생성
{
    val a=-36       //args다음으로 a가 생성
    val result=absolute(a)  //함수가 실행되며 함수로 넘어간 후에 result 할당
    println(result)
}//함수가 종료되며 모든 변수 삭제

//입력받은 정수의 절대값을 반환하는 함수
fun absolute(number:Int):Int    //매개변수 number생성->함수가 끝나면 없어짐
{
    return if(number>=0)
        number
    else -number
}

/*스택에 쌓이는 순서
args->a->number->number삭제->result->함수종료-모든변수삭제
 */

/*지역변수값은 메모리의 스택(stack)이라는 영역에 저장됨.
    ->변수가 생성될떄 생성된 순서대로 차곡차곡 쌓여 이러한 이름이 붙음
 */