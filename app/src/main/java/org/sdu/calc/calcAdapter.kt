package org.sdu.calc

abstract class calcAdapter : Calculator {

    override fun add(a:Int,b:Int):Int = a+b

    abstract fun subtract(a:Int,b:Int):Int
}