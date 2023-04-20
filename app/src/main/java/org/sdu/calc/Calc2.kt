package org.sdu.calc

class Calc2() : Calculator2 {
    val alias:String = "홍길동"
    override val name:String
    get() = alias.substring(1)

    override fun subtract(a: Int, b: Int) = a -b


    override fun multiply(a: Int, b: Int) = a*b

    override fun divide(a: Int, b: Int) = a / b


}