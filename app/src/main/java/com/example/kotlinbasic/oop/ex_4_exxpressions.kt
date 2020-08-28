package com.example.kotlinbasic.oop

fun main() {
    println(InjectorUtils.name)
    println(InjectorUtils.getFool())
    println(InjectorUtils == InjectorUtils)
    println()
    println(MyClass() == MyClass())
    println(MyClass.create() == MyClass.create())
    MyClass.fingersnap()
}
//singleton
//static
object InjectorUtils {
    var name = "iBlurBlur"
        private set

    fun getFool() = 1234
}
class MyClass{
    var name = "iBlurBlur"

    fun getfool()=1234

    companion object Factory{
        //

        private var INSTANCE: MyClass? =null

        fun create(): MyClass {
            if (INSTANCE == null){
               INSTANCE = MyClass()
            }
            return INSTANCE!!
        }
        fun
    }
}
