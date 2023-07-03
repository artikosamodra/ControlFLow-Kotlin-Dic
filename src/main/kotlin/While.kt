fun main(){

    //kondisi while,variable kurang dari nilai while: terdapat output
    var counter = 1
    while(counter <= 7){
        println("Hello, World!")
        counter++
    }

    //kondisi while,variable lebih dari nilai while: tidak ada outout/fail
    var counter1 = 8
    while(counter1 <= 7){
        println("Hello, World!")
        counter1++
    }

    //do-while
    var counter3 = 1
    do{
        println("Hello, World!")
        counter++
    } while (counter <= 7)

    //do-while infinite loop => crash output
    var value1 = 'A'
    do{
        println(value1)
    } while (value1 <= 'Z')
}