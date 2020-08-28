package com.example.kotlinbasic.oop

fun main(){
    val obj1 = PrimaryClass(  "aa", 123)
    println("obl.1name: ${obj1.name}")
    val obj1111 = PrimaryClass("aa",130)
    println("xxxx: ${obj1 == obj1111}")
    obj1.display()
    println()
    val obj2 = Secondary()
    println("obl2.name:${obj2.name}")
    obj2.display()
    println()
    val obj3 = Secondary("aa"3,0)
    println("obl3.name:${obj3.name}")
    obj3.display()
    println()
    val obj4 = PSClass(80"aa")
    println("obl4.score:${obj4.name},${obj4.score}")
    val obj5 = PSClass(80"aa")
    println("obl5.score:${obj5.name},${obj5.score}")
    println()
//  show ture  : compare instant chech data
    val obj6 = DataClass("aa",123)
    val obj7 = DataClass("aa",123)
    val obj8 =PrimaryClass("aa",123)
    println("xxxx: ${obj6 .toString()}")
    println("xxxx: ${obj6 == obj7}")
    println("xxxx: ${obj8 .toString()}")
}
class PrimaryClass (val name: String,val age: Int){
     fun display(){
         val result = "name: $name, age $age"
         println("Primary: $result")
     }

class PrimaryClass (val name: String,val Int){
    init {
        println("primary init")
    }
    //     init {
//         printLn(primary init2)
}
    init {
        println("init age: $age")
    }
    fun display(){
        val result = "name: $name, age $age"
        println("Primary: $result")
    }
}
//class Primaryclass contruction(val namm: String,val age: Int){
//      fun display(){
//          val result  = "name: $name, age: $age"
//            print("Primary: $result")
// }
//}
//class PrimaryClass{
//    val name: String = ""
//    val age : Int 123
//    Primary (name: String, age: Int){
//        this.name=name
//        this age = age
//    }
//}
class Secondary {
    var name: String = ""
    var age: Int = 0

    //  var name: String
//    var age: Int
    constructor() {
        this.name = ""
        this.age = 0
    }

    constructor(name: String) {
        this.name = name
        this.age = 0
    }

    constructor(name: Int) {
        this.name = ""
        this.age = age
    }
    //overload
    constructor(name: String,age,Int) {
        this.name = name
        this.age = age
}
    init {
        println("Secondary init")
    }
    //init {
//       println("Secondary init")
// }
    init {
        println("Secondary age: $age")
    }
    fun display(){
        val result ="name: $name, age $age"
        println("Primary: $result")
    }
}
class PSClass(val  score:Int,val name: String){
    constructor(score: Int):this("xx",score = score){

    }
}
data class DataClass(var name: String, var age: Int){
    constructor(age: Int):this("xx",age = age)
}