package com.example.kotlinbasic.playground.basic

fun main() {
    """
        
    

    var ex :Int
    if (true) {
        ex = 1234
    }else {
        ex=9999
    }
 """
var expression1 = if (true){        
    1234
}else{
    9999   
}

var expression2 = if(true)1234 else 9999
}

//switch case

val name ="iBlurBlur"

 when (name){
    "iBlurBlur" -> {

    }
    "cat" ->{

    }
     "red" ->{

    }
    "grenn" ->{

    }
    else ->{
        println(default case)
    }

}


 when (name){
    "iBlurBlur" -> {
        //todo
    }
    "cat" ->{
       //todo
    }
    "red","green","blue" ->{
       //todo
    }


    else ->{
        println(default case)
    }

}
     val score =80
     if(score)=100){
    //todo
}else if (score>=80){
    //todo
}else if (score>=50){
    //todo
}else{

}
  when(score){
      in 0..10 ->{
        //todo
    }
    in 10..50 ->{
        //todo
    }
    in 50..100 ->{
        //todo
    }
    else ->{
        //todo
    }
}
val expression =when ("name"){
    "name"  -> "iBlurBlur"
    "age" -> 30
    else -> true
}