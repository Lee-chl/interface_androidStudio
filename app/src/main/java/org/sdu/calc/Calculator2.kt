package org.sdu.calc

interface Calculator2 {

    val name:String

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int

    fun multiply(a: Int, b: Int): Int

    fun divide(a: Int, b: Int): Int
}