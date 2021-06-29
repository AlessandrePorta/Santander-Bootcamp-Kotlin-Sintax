package estudos.emptyXblank

fun main(){

    val s = ""

    //true
    println(s.isEmpty()) //empty == a string apenas é empty se o tamanho for 0

    false
    println(s.isBlank()) //blank == quando há qualquer alteração ela é blank mesmo que seja apenas espaçamento

    val a = "     "
    //false
    println(a.isEmpty())
    //true
    println(a.isBlank())
}