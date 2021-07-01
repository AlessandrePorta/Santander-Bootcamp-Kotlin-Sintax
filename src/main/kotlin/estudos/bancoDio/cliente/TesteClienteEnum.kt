package estudos.bancoDio.cliente

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }
}