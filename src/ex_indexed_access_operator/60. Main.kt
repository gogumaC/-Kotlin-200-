package ex_indexed_access_operator

fun main(args:Array<String>)
{
    val person=Person("Kotlin","2016-02-15")
    println(person[0])  //person[0]은 컴파일시 person.get(0)으로 번역됨
    println(person[1])
    println(person[-1])

    person[0]="Java"    //컴파일시 person.set(0,"java")로 번역됨
    println(person.name) //->Java가 출력된다.
}