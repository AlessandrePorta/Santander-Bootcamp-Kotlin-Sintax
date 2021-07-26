package estudos.arrays

fun main() {

    val salarios = doubleArrayOf(1000.0, 2000.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("-------------------------")
    salarioMaiorQue2500.forEach { println(it) }

}