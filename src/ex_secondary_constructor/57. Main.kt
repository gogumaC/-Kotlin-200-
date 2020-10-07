package ex_secondary_constructor
//생성자는 여러개 둘 수 있음
class Time(val second:Int)
{
    init {
        println("init블록 실행 중")
    }

    //보조 생성자1
    constructor(minute:Int, second: Int):this(minute*60+second)  //->여기서는 Int타입 인수하나를 전달했으므로 주생성자가 호출됨
    {
        println("보조 생성자 1 실행중")
    }

    //보조 생성자2
    constructor(hour:Int,minute: Int,second: Int):this(hour*60+minute,second)   //시,분,초로 Time인스턴스 초기화 할수있는 보조생성자 정의
                                                                                       // ->주생성자 먼저 호출
                                                                                        //->여기서는 Int타입 인수두개를 전달하여 생성자 호출했으므로 보조생성자 1이 호출됨
                                                                                        // ->보조생성자 1은 다시 주 생성자 호출
                                                                                        //->궁극적으로 주 생성자가 가장 먼저 호출됨
    {
        println("보조 생성자2 실행중")
    }

    init {
        println("또다른 init 블록 실행중")
    }


}

fun main(args:Array<String>)
{
    println("${Time(15,6).second}초")
    /*
  분,초로 TIme인스턴스 생성 후 바로 second프로퍼티 출력.
  ->보조생성자 1이 호출되고 연이어 주 생성자가 곧바로 호출되어 init블록들이 가장먼저 수행됨
  ->주 생성자 끝나면 보조생성자1의 코드 실행
  -> 보조생성자 1 실행중이 출력되고 second값 906초가 출력됨.
   */

    println("${Time(6,3,17).second}초")
    /*
    시,분,초로 TIme인스턴스 생성 후 바로 second프로퍼티 출력.
    ->보조생성자 2가 호출되고 연이어 주 생성자가 곧바로 호출되어 init블록들이 가장먼저 수행됨
    ->주 생성자 끝나면 보조생성자2의 코드 실행
    -> 보조생성자 2 실행중이 출력되고 second값 21797초가 출력됨.
     */

}

/*
생성자를 여러개 두기

class 클래스 이름 constructor(매개변수)  //주생성자 : 클래스 이름 옆에오는 생성자
{
    //보조생성자1    :클래스 내부에 오는 생성자, 여러개가 올 수 있음 ->클래스에 주생성자가 있으면 주생성자를 반드시 먼저 호출해야함
    constructor(매개변수):this(인수)       ->:this(인수) 는 이 클래스에 포함된 또다른 생성자를 호출하는 문법이다.
    {... }

    //보조 생성자2
    constructor(매개변수):this(인수) 
}
 */
