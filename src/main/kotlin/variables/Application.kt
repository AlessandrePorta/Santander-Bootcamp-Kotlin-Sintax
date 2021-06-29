package variables

//Valor imutavel, SNAKE_CASE
const val currentAge3 = 90

fun main(){
    //Valor mutavel, camel case
    var currentAge1:Int?
    currentAge1 = 90
    println(currentAge1)

    //Valor imutavel, camel case
    val currentAge2:Int?
    currentAge2 = 90
    println(currentAge2)

    println(currentAge3)
}