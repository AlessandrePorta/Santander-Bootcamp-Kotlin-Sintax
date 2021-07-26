package estudos.arrays

fun main() {
    val Joao = Funcionario("Joao", 1000.0)
    val Gabriel = Funcionario("Gabriel", 2000.0)
    val Maria = Funcionario("Maria", 3000.0)

    val funcionarios = listOf(Joao, Gabriel, Maria)

    funcionarios.forEach { println(it) }

    println("---------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
}

class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}