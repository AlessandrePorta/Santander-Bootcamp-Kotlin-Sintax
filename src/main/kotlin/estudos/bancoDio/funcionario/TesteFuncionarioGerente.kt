package estudos.bancoDio.funcionario

import estudos.bancoDio.login.TesteAutenticacao

fun main() {
    val f1 = Gerente("Gerente", "123123123-20", 15000.0, "123")
    println("Nome Funcionario: ${f1.nome}, cpf funcionário: ${f1.cpf}, salario funcionario: ${f1.salario}")
    imprimeRelatorio(f1)

    TesteAutenticacao().autentica(f1)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
