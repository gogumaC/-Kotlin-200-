package ex_import

//패키지 이름 없이 함수를 다른 패키지에 선언된 함수 호출 ->import이용

import ex_package.max       //import 패키지이름.함수이름  ->이 다음부터는 함수를 패키지 이름없이 호출가능
import ex_package.min as ex_min     //import 패키지이름.함수이름 as 새로운이름 -> 불러온 함수를 새로운 이름으로 호출가능

fun main(args:Array<String>)
{
    println(max(55,47))     //패키지 이름없이 max함수를 호출함
    println(ex_min(3,10))      //새로운 이름으로 min함수가 호출됨
}