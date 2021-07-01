package estudos.bancoDio.pessoa

import estudos.bancoDio.funcionario.Funcionario
import java.math.BigDecimal

fun main() {
    val alessandre = Pessoa("Alessandre", "123.123.123-20")
    println("Nome pessoa: ${alessandre.nome}, Cpf Pessoa: ${alessandre.cpf}")


    val f1 = Funcionario("Alessandre", "123123123-20", BigDecimal(2000.0))
    println("Nome Funcionario: ${f1.nome}, Cpf Funcionario: ${f1.cpf}, Salario Funcionario: ${f1.salario}")
}