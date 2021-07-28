package estudos.bancoDio.funcionario

import estudos.bancoDio.login.Login

class Gerente(nome: String, cpf: String, salario: Double, val senha: String) :
    Funcionario(nome = nome, cpf = cpf, salario = salario),
    Login {
    override fun auxilio(): Double = salario * 0.4

    override fun autenticacao(): Boolean = "123" == senha
}