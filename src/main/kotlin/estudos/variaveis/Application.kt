package estudos.variables

//Valor imutavel, SNAKE_CASE
const val currentAge3 = 90

fun main() {
    //Valor mutavel, camel case
    //o '?' significa que o valor pode ser inteiro ou nulo
    var currentAge1: Int?
    currentAge1 = 90
    println(currentAge1)

    //Valor imutavel, camel case
    val currentAge2: Int?
    currentAge2 = 90
    println(currentAge2)

    println(currentAge3)
}