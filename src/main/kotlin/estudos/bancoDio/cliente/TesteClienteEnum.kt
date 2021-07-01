package estudos.bancoDio.cliente

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.s}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.s}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.s}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.s}")
}