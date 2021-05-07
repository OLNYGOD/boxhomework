package com.Bill

import java.util.*

fun main() {
    val box3 = Box("Box3", 23F, 14F, 13)
    val box5 = Box("Box5", 39.5f, 27.5f ,23)
    val scanner = Scanner(System.`in`)
    print( "Please enter object's length: ")
    var length:Float=scanner.nextFloat()
    print( "Please enter object's width: ")
    var width:Float=scanner.nextFloat()
    print( "Please enter object's length: ")
    var height:Int=scanner.nextInt()
    if (box3.validate(length,width,height))
        println(box3.name)
    else if (box5.validate(length,width,height))
        print(box5.name)
    else
        print("It's too big to contain!")
}

class Box(val name : String, val length : Float, val width : Float, val height : Int){
    fun validate(length : Float, width : Float, height : Int) : Boolean{
        return (length <= this.length && width <= this.width && height <= this.height)
    }
}