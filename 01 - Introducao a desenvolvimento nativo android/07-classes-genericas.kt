class MutableStack<E>(vararg items: E) {
    private val elements = mutableListOf(*items)

    fun push(item: E) = elements.add(item) //adiciona um item no final da pilha
    fun peek(): E = elements.last() //retorna o ultimo item sem remover
    fun pop(): E = elements.removeAt(elements.size - 1) //remove e retorna o ultimo item
    fun isEmpty() = elements.isEmpty() //verifica se a pilha esta vazia
    fun size() = elements.size //retorna o tamanho da pilha

    override fun toString(): String = elements.toString()
}

fun main() {
    val stack = MutableStack(2, 54, 7, 8)
    stack.push(9)
    println(stack)
    println("Peek: ${stack.peek()}") //imprime o ultimo item sem remover
    
    for (i in 1..stack.size()) { //remove e imprime todos os itens da pilha
        println("pop(): ${stack.pop()}")
        println(stack)
    }

}
