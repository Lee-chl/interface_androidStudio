package org.sdu.calc

class Calc : Calculator {

    //더하기 함수
    override fun add(a:Int,b:Int)= a + b

    //빼기 함수
    fun subtract(a:Int,b:Int) = a- b

    //곱하기 함수
    fun multiply(a:Int,b:Int) = a*b

    //나누기 함수
    fun divide(a:Int,b:Int) = a/b
}