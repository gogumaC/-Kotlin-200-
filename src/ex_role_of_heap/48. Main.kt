package ex_role_of_heap

fun main(args:Array<String>)
{
    val product:Product
    product=createProduct()     //Product 타입 값을 반환하는 함수호출하고 결과를 product(참조변수)에 저장
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)
}

fun createProduct():Product
{
    val apple=Product()     //Product의 인스턴스 생성, apple의 참조 변수에 그 위치 저장
    apple.name="Apple"      //apple 참조변수가 가리키는 객체의 프로퍼티에 값을 채워넣음
    apple.price=1000

    return apple        /*apple 참조 변수가 가지고 있는 참조값 반환
                          !!이때 apple참조 변수는 함수가 끝났으므로 스택에서 지워지지지만
                           apple참조 변수가 가리키고 있던 객체는 힙에서 지워지지 않는다!!

                           -힙 영역에 만들어진 변수의 수명-
                            어느 블록에서 생성했던 블록을 나와도 지워지지 않음
                            */
}



fun processProduct(product:Product)// 같은 참조값을 공유하므로 결과가 그대로 힙영역에 남음
{
    product.price+=500      // price : 1000->1500
}

fun printProductInfo(product: Product)      //전달받은 참조값을 매개변수 product에 저장
{
    println("이름 :${product.name}")
    println("가격 :${product.price}")
}

/*
스택영역 : args ->product -> apple ->                       ->apple삭제                                   ->...
힙 영역 :                          ->apple객체(name,price)               ->but, apple객체는 힙영역에 남아있음
 */

/*힙영역의 역할
        하나의 객체를 여러 참조변수에서 공유하는 형태로 사용할수있어 훨씬 메모리 공간을 절약할 수 있다.
 */