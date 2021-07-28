package estudos.bancoDio.cliente

import estudos.bancoDio.login.Login
import estudos.bancoDio.pessoa.Pessoa

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Login {
    override fun autenticacao(): Boolean = "123" == senha

    override fun toString(): String = """
            Nome: $nome
            Cpf: $cpf
            Salario: $clienteTipo
            """.trimIndent()
}
