fun main(){
    val value = 20
    val stringOfValue = when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    println(stringOfValue)
}