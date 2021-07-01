package estudos.bancoDio.funcionario

import estudos.bancoDio.pessoa.Pessoa

fun main() {
    val alessandre = Pessoa("Alessandre", "123123123-20")
    println("Nome Pessoa: ${alessandre.nome}, Cpf Pessoa: ${alessandre.cpf}")

    val f1 = Funcionario("Alessandre", "123123123-20", 2000.0)
    println("Nome Funcionario: ${f1.nome}, cpf funcionário: ${f1.cpf}, salario funcionario: ${f1.salario}")
}