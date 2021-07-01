package estudos.bancoDio.cliente

import estudos.bancoDio.login.TesteAutenticacao

fun main(){
    val ale = Cliente(
        "Alessandre",
        "123.123.123-20",
        ClienteTipo.PF,
        senha = "123"
    )
    println(ale)

    TesteAutenticacao().autentica(ale)
}