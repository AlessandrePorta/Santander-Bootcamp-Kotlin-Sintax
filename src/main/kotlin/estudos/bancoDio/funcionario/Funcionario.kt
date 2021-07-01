package estudos.bancoDio.funcionario

import estudos.bancoDio.pessoa.Pessoa
import java.math.BigDecimal

abstract class Funcionario(nome: String, cpf: String, val salario: BigDecimal) : Pessoa(nome, cpf) {
    abstract fun auxilio():
}