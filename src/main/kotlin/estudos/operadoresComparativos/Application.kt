package estudos.operadoresComparativos

fun main() {
    var aux = 10
    var aux1 = 2

    //Sempre irá retornar -1(menor que), 0(igual), 1(maior que)

    //Maior que
    var maiorQue = aux > aux1
    //aux.compareTo(aux1) > 0
    println(maiorQue)

    //Menor que
    var menorQue = aux < aux1
    //aux.compareTo(aux1) < 0
    println(menorQue)

    //Maior ou igual que
    maiorQue = aux >= aux1
    //aux.compareTo(aux1) >= 0
    println(maiorQue)

    //Menor que
    menorQue = aux <= aux1
    //aux.compareTo(aux1) <= 0
    println(menorQue)

    //Irá retornar um boolean, verdadeiro ou falso

    //Igualdade
    var igual = aux == aux1
    //aux.equals(aux1)
    println(igual)

    //Diferença
    var diferente = aux != aux1
    //!aux.equals(aux1)
    println(diferente)
}