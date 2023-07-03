import java.awt.Color //Jika tidak dicantumkan, case 2 akan memiliki output RED, jika dicantumkan output cas 2 bernilai rgb

//Enumeration => menyimpan kumpulan objek yang telah di definisikan menjadi tipe data konstanta
// misal => val colorRed =0xFF0000

fun main(){
/*
    //Case 1 = Cara penulisan untuk meminimalisir nilai yang saling tertukar, yaitu dengan menggunakan enum
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
 */

    //Case 2 = Sama seperti array, namun nilai enum berbentuk konstanta
    val color : Color = Color.RED
    println(color)


}


/*
//ENUM Dari Case 1
enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/


//ENUM Case 2
enum class Color{
    RED, GREEN, BLUE
}


/*
//ENUM Case 3 => menambahkan abstract function dan mendeklarasikan anonymous class
enum class Color(val value: Int){
    RED(0xFF0000){
        override fun printValue(){
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue(){
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue(){
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

*/
