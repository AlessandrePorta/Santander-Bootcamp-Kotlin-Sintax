package estudos.arrays

fun main() {
    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Gabriel = Funcionario("Gabriel", 2000.0, "PJ")
    val Maria = Funcionario("Maria", 3000.0, "CLT")

    val repositorio = RepositoryMutableMapList<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Gabriel.nome, Gabriel)
    repositorio.create(Maria.nome, Maria)

    println(repositorio.findById(Joao.nome))

    println("-----------------------")

    repositorio.findAll().forEach { println(it) }

    println("-----------------------")
    repositorio.remove(Joao.nome)
    repositorio.findAll().forEach { println(it) }


}