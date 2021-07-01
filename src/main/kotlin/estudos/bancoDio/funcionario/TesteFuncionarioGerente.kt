package estudos.bancoDio.funcionario

fun main() {
    val f1 = Gerente("Gerente", "123123123-20", 15000.0)
    println("Nome Funcionario: ${f1.nome}, cpf funcionário: ${f1.cpf}, salario funcionario: ${f1.salario}")
    imprimeRelatorio(f1)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
