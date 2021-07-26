package estudos.arrays

fun main() {
    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Gabriel = Funcionario("Gabriel", 2000.0, "PJ")
    val Maria = Funcionario("Maria", 3000.0, "CLT")

    val funcionarios = listOf(Joao, Gabriel, Maria)

    funcionarios.forEach { println(it) }

    println("---------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("----------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}