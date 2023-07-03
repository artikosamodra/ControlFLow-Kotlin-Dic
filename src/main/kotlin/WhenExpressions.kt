
import kotlin.random.Random

fun main(){

    //when expressions
    val value = 20
    val stringOfValue = when(value){
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }

        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
//=============================================================

    //3.1 when expressions untuk memeriksa instance type tertentu dari objek => menggunakan 'is' atau '!is'
    val anyType : Any = 100L

    //dengan when expresson bisa digunakan lebih dari 2x
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }

    //dengan if expression, hanya satu kali.
    if(anyType is Long){
        println("the value has a Long type")
    }else{
        println("the value is not Long type")
    }
//=============================================================

    //when expressions untuk mengecheck sebuah nilai masih didalam range atau tidak
    val value1 = 27
    val ranges = 10..50

    when(value1){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
//===============================================================
    
    //khusus kotlin 1.3 ke atas, kita dapat menangkap subjek dari when didalam variable
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
//=============================================================
    
    println(stringOfValue)
}

fun getRegisterNumber() = Random.nextInt(100)