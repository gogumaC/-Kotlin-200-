package ex_func_in_another_package

//다른 패키지 함수 호출하기



fun main(args:Array<String>)
{
    println(ex_package.min(30,10))      //패키지이름.함수이름() 사용
}


/*
+) 패키지가 서로 다르면 이름과 시그니처가 같은 함수를 선언해도 상관없음
ex ) aaa.func()   ;   bbb.func()    ->구분가능하므로 문제 없음
 */
