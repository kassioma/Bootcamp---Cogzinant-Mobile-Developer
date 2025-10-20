fun main() {
    fun printAll(vararg messages: String) { // vararg permite passar um número variável de argumentos
        for (m in messages) println(m)
    }
    printAll("Hello", "Olá", "Bonjour", "Hola") // Chamando a função com múltiplos argumentos


    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println("$prefix $m")
    }
    printAllWithPrefix(
        "Hello", "Olá", "Bonjour", "Hola",
        prefix = "Greeting:"
    )

    fun log(vararg entries: String) {
        printAll(*entries) // O operador * "desempacota" o array para passar como vararg
    }

    log("Hello", "Olá", "Bonjour", "Hola")
}