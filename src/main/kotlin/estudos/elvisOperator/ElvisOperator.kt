package estudos.elvisOperator

fun main() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())

    //Elvis operator exemplo
    var t: Int
    var x: Int? = null
    var o: Int? = null
    //verificar se o valor não é nulo
    t = x ?: o ?: -1
    //verificar se a string não é nulo
    var y: String? = x?.getStudentStatus()

    println(y)
    println(t)
}

fun Int.getStudentStatus(): String {

    println("nota $this")

    //Switch case exemplo
    return when (this) {
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }
}