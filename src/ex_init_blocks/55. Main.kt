package ex_init_blocks

class Size(width:Int, height:Int)
{
    val width=width
    val height:Int

    init {
        this.height=height  //height프로퍼티를 생성자의 매개변수 height로 초기화
    }

    val area:Int

    init {
        area=width*height   //area프로퍼티를 with*height로 초기화
    }

}

fun main(args:Array<String>)
{
    val size=Size(10,50)    //Size의 인스턴스 생성
    println(size.area)
}

/*
init블록은 여러개로 나누어 쓸수있다
 */