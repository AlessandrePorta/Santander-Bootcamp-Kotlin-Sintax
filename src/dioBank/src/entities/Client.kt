package entities

//alter class
class Client {
    var nome: String = "Alessandre"
    var cpf : String = "123.123.123-20"

    /*

    //Para criar uma classe dentro de uma classe usa inner class

    inner class Endereco{
        var rua: String = "Rua teste, 123"
    }

     */
}

fun main(){
    val alessandre = Client()

    println(alessandre.nome)
    println(alessandre.cpf)
    //println(alessandre.Endereco().rua)  para acessar a inner classe
}