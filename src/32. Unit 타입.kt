fun main(args:Array<String>):Unit       //unit생략가능
{
    celsiusToFah(27)
}

//이전 예제의 cToF함수와 이름이 겹치지 않도록 함수의 이름 변경
fun celsiusToFah(celsius:Int):Unit  //:Unit을 붙이며 유닛 타입으로 설정 -> 반환값이 필요없는 함수임을 의미
                                    //이때 함수내에 return을 써도 되지만 return값은 적지 않아야한다.
{
    println(celsius*1.8+32)
}

//함수 간단히 쓰기
// fun celsiusToFah(celsius:Int):Unit=println(celsius*1.8+32)



/*자바와 비교
자바 -> void :반환값없음을 의미하는 특수타입
코틀린 -> Unit: class 키워드로 정의된 일반타입 (자바의 Void클래스와 비슷한개념)
 */