fun main(){
    val openOffice = 7
    val now = 8

    //Case 1 = dikatakan expression jika nilai value sudah di sum
    sum(1, 1*4)

    //Case 2 = dikatakan statement jika nilai dalam sum berupa variable yang diinisialisasi
    //val value1 = 10 //deklarasi val tersebut yang dianggap sebagai statement
    //val value2 = 10
    //sum(value1,value2)

    //ini adalah statement, tidak ada nilai kembalian
    if(now > openOffice)
        println("Office already open")
    else
        println("Office close")

    //ini adalah expression, terdapat nilai kembalian dari penyataan if.
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

}

//Case 1 = expression didalam expression
fun sum(value1: Int, value2: Int) = value1+value2