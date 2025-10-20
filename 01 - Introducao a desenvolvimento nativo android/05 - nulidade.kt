fun main () {
    var neverNull: String = "Esta variável não pode ser nula"
    neverNull = null

    var nullable: String? = "Esta variável pode ser nula"
    nullable = null

    var inferredNonNull = "O Kotlin infere que esta variável não pode ser nula"
    inferredNonNull = null

    fun strLength(notNull: String): Int { // Parâmetro não nulo
        return notNull.length
    }

    strLength(neverNull) // Ok
    strLength(nullable) // Erro de compilação
}