class MutableStack<E>(vararg items: E) {
    private val elements = mutableListOf(*items)

    fun push(item: E) = elements.add(item) //adiciona um item no final da pilha
    fun peek(): E = elements.last() //retorna o ultimo item sem remover
    fun pop(): E = elements.removeAt(elements.size - 1) //remove e retorna o ultimo item
    fun isEmpty() = elements.isEmpty() //verifica se a pilha esta vazia
    fun size() = elements.size //retorna o tamanho da pilha

    override fun toString(): String = elements.toString()
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements) //funcao generica para criar uma pilha mutavel

fun main() {
    val stack = mutableStackOf(2, 54, 7, 8) //usando a funcao generica para criar a pilha
    println(stack) 
}
