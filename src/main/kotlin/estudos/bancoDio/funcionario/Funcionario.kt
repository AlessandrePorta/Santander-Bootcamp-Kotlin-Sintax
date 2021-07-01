package estudos.bancoDio.funcionario

import estudos.bancoDio.pessoa.Pessoa

abstract class Funcionario(nome: String, cpf: String, val salario: Double) : Pessoa(nome, cpf) {
    protected abstract fun auxilio(): Double

    override fun toString(): String = """
        "Nome: $nome
         Cpf: $cpf
         Salario: $salario
         Auxilio: ${auxilio()}
         """.trimIndent()

}