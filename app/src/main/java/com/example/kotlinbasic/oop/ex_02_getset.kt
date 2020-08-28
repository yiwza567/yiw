package com.example.kotlinbasic.oop

import java.util.*

fun main(){
    val obj1 = GetAndSet()
    println(obj1.name)
}
class GetAndSet {
    var name: String = "iBlurBlur"
        get() = field.toUpperCase(Locale.ROOT)
    var age: Int =0
        get() {
            if(field > 100){
                field = 100
            }
            return field
        }
    set(value){
        field = if (value < 0) 0 else value
    }
}

