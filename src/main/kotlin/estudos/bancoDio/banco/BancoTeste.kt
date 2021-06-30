package estudos.bancoDio.banco

fun main() {

    val dioBank = Banco("Dio Bank", 22)
    println("${dioBank.nome},  ${dioBank.numero}")

    val bancoTeste = dioBank.copy("Teste", 10)
    println(bancoTeste.infoBanco())
}