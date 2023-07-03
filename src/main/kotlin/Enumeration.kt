
fun main(){
    val color: Color = Color.GREEN

    when(color){
       Color.RED -> print("Color is Red")
       Color.GREEN -> print("Color is Green")
       Color.BLUE -> print("Color is Blue")
    }
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

