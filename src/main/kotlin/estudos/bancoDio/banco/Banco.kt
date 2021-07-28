package estudos.bancoDio.banco

data class Banco(val nome: String, val numero: Int) {
    fun infoBanco() = "Nome do banco: $nome, Número: $numero"
}