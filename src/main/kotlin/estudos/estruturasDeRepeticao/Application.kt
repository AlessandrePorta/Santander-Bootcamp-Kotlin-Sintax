package estudos.estruturasDeRepeticao

fun main(){
    for (i in 0..20)
        print("$i ")

    print("\n")
    downTo()

    print("\n")
    until()

    print("\n")
    step(2)

    println("\n")
    letters()
}

fun downTo(){
    for(i in 20 downTo 0){
        print("$i ")
    }
}

fun until(){
    for(i in 0 until 20){
        print("$i ")
    }
}

fun step(num:Int){
    for(i in 0..20 step num){
        print("$i ")
    }
}

fun letters(){
    val sArray = "Olha essa String!"
    for(l in sArray){
        println(l.toUpperCase())
    }
    //ou

    sArray.forEach{a -> print(a + " ")}
}