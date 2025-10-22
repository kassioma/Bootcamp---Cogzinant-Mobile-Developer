fun main() {
    val listadecompras = listOf("Leite", "Banana", "Pão") // listOf cria uma lista imutável
    println("Coisas para comprar:")
    for (item in listadecompras) {
        println("- $item")
    }

}