package estudos.arrays

fun main() {
    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Gabriel = Funcionario("Gabriel", 2000.0, "PJ")
    val Maria = Funcionario("Maria", 3000.0, "CLT")

    val funcionarios = mutableListOf(Joao, Maria)
    funcionarios.forEach { println(it) }

    println("---------- List -------------")

    funcionarios.add(Gabriel)
    funcionarios.forEach { println(it) }

    println("-----------------------")

    funcionarios.remove(Joao)
    funcionarios.forEach { println(it) }


    println("----------- SET ------------")
    val funcionarioSet = mutableSetOf(Joao)
    funcionarioSet.forEach { println(it) }

    println("-----------------------")

    funcionarioSet.add(Gabriel)
    funcionarioSet.add(Maria)
    funcionarioSet.forEach { println(it) }

    println("-----------------------")

    funcionarioSet.remove(Maria)
    funcionarioSet.forEach { println(it) }

}