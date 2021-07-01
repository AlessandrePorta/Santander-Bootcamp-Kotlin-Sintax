package estudos.bancoDio.pessoa

import java.math.BigDecimal

//alter class
open class Pessoa (
    open val nome: String = "Alessandre",
    open val cpf : String = "123.123.123-20"
) {
    //private set, para não poder alterar o valor do cpf e do nome

    /*
    //Para criar uma classe dentro de uma classe usa inner class
    inner class Endereco{
        var rua: String = "Rua teste, 123"
    }
     */
    /*constructor()

    fun infPessoa() = "Nome: $nome e Cpf: $cpf"*/
}

/*fun main(){
    val alessandre = Pessoa()

    println(alessandre.nome)
    println(alessandre.cpf)
    println(alessandre.infPessoa())
    //println(alessandre.Endereco().rua)  para acessar a inner classe
}*/