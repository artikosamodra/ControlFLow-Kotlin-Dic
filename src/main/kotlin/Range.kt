fun main(){
    //menggunakan 'step' untuk mendapatkan step pada rangenInt.
    val rangeInt = 1..10
    println(rangeInt.step)
    println()
    //===================================================

    //mengubah nilai step ketika menginisialisasi range tersebut
    val rangeInt1 = 1..10 step 2 //step 2, memeriksa range kelipatan 2
    rangeInt1.forEach{
        println("$it") //'it' dengan forEach, map, filter dll.
    }
    println(rangeInt1.step)
    println()
    //===================================================

    //penggunaan 'rangeTo()'
    val rangeInt2 = 1.rangeTo(10)
    println(rangeInt2)
    println()
    //===================================================

    //'downTo()' untuk step range dengan urutan terbalik
    val downInt = 10.downTo(1)
    println(downInt)
    println()
    //===================================================


    //pemeriksaaan dengan 'downTo()' dengan expression.
    val tentoOne = 10.downTo(1)
    //'in' untuk memeriksa apakah 7 diantara 1 sampai 10
    if(7 in tentoOne){
        println("Value 7 available")
        println()
    }
    //menggunakan '!in' untuk memeriksa nilai 'tidak ada' pada range
    if(11 !in tentoOne){
        println("No value 11 available")
        println()
    }
    //===================================================

    //memeriksa range dengan aturan logika AND (&&)boolean
    if(1 <= 7 && 7 <= 10){
        println("Value 7 available")
        println()
    }

    //CharRange
    val rangeChar = 'A'.rangeTo('F')
    println(rangeChar)
    println()
}