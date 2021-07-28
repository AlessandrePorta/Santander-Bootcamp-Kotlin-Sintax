package exercicios.calculadora

import exercicios.calculadora.Operacao.*
import java.lang.Exception

val x = Subtracao

fun main() {
    val a: Float?
    val b: Float?

    val result = operador(20f, 4f, x)
    println("O resultado da sua operação '${x.texto}', é igual a: $result")
}

fun operador(a: Float?, b: Float?, operacao: Operacao): Float {
    if (a != null && b != null) {
        return when (operacao) {
            Soma -> a + b
            Subtracao -> a - b
            Multiplicacao -> a * b
            Divisao -> a / b
            Resto -> a % b
            Potencia -> Math.pow(a.toDouble(), b.toDouble()).toFloat()
        }
    } else {
        throw Exception("Digite 2 valores válidos.")
    }
}

sealed class Operacao(val texto: String) {
    object Soma : Operacao("Soma")
    object Subtracao : Operacao("Subtração")
    object Multiplicacao : Operacao("Multiplicação")
    object Divisao : Operacao("Divisão")
    object Resto : Operacao("Resto")
    object Potencia : Operacao("Potência")

}