package estudos.arrays

fun main() {
    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Gabriel = Funcionario("Gabriel", 2000.0, "PJ")
    val Maria = Funcionario("Maria", 3000.0, "CLT")

    val funcionarios1 = setOf(Joao, Gabriel)
    val funcionarios2 = setOf(Maria)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    println("-------------------")
    val funcionarios3 = setOf(Joao, Gabriel, Maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("--------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}