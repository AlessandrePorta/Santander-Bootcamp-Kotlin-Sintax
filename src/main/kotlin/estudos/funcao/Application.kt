package estudos.funcao

fun main(){
    var name:String
    var lastName:String

    name = "Alessandre"
    lastName = "Porta"

    println(getFullName(name, lastName))
}

private fun getFullName(name:String, lastName:String) = "$name $lastName"