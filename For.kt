fun main(){
    val nombres = list0f(
        "Cesar",
        "Alan",
        "Jhonny",
        "Alex",
        "Kevin",
        "Eduardo",
        "Mon",
        "Berta",
        "Alexis"
    )
    for (nombre in nombres){
        println(nombre)
        if (nombre=="Mon"){
            println("Personaje Encontrado!")
            break
        }
    }
}
