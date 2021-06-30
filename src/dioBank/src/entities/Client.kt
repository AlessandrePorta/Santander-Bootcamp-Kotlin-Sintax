package entities

class Client {
    var nome: String = "Alessandre"
    var cpf : String = "123.123.123-20"
}

fun main(){
    val alessandre = Client()

    println(alessandre.nome)
    println(alessandre.cpf)
}