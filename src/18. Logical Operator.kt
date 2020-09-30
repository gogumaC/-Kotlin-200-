fun main(args:Array<String>):Unit
{
    val a=15
    val b=17

    var bool:Boolean=(a-b<a+b)&&(a==15)
    println(bool)

    bool=!((a+b)>(a*3)||(b-a)>0)
    println(bool)
}

/*
* 논리연산자
* && :and
* ||:or
* !a : a가 ture면 결과값은 false, a가 false면 결과값은 true
*
* +) 5<a<10으로 쓰면 첫번째 연산결과 true<10이 되버려서 동작 불가능 이렇게 쓰고싶으면
*    5<a&&a<10 으로 써야함
* */