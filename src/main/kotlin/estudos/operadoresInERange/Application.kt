package estudos.operadoresInERange

const val MIN_AGE = 10
const val MAX_AGE = 60

fun main(){

    val lista = listOf(1,3,4,6,8,9,11,12,13,15,17,18,19,22,23,24,25,32,34)
    var numero = (1..34).random()

    println(numero)
    println(numero in lista)


    //'in' para ver se esta entre '..(Range)' para ditar o intervalo
    var aux = (10..60).random()
    println(aux)
    println(aux in MIN_AGE..MAX_AGE)
    println(aux >= MIN_AGE && aux <= MAX_AGE)

}