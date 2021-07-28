package estudos.funcoesDeOrdemSuperior

fun main() {

    val x: Int
    val z: Int
    z = calculate(34, 90) { a, b ->
        println("Vou calcular! $a * $b")
        (a * b)
    }
    println("Resultado: $z")
}
/*

Operacoes caso feitos a mão

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun sub(a1:Int, a2:Int) = a1.minus(a2)

fun mult(a1:Int, a2:Int) = a1.times(a2)

fun div(a1:Int, a2:Int) = a1.div(a2)

*/

fun calculate(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(n1, n2)
    return result
}
