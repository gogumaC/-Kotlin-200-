fun main(args:Array<String>):Unit
{
    var isRight:Boolean = (10+70)>(3*25)  //비교연산자의 결과 타입은 boolean : true와 false만 저장가능
    println(isRight)
    
    isRight=false
    println(isRight)

    isRight=30==(10+20)
    println(isRight)

    isRight=0.00001f==0.005f*0.002f //실수타입의 한계로 두 실수값 정확한 비교 어려워서 false나옴
    println(isRight)
}

//비교연산자
/*
* ==
* !=
* >
* <
* >=
* <=
*
* */

