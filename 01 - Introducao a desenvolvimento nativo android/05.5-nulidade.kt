fun describeString(maybeString: String?) {
    if (maybeString != null && maybeString.isNotEmpty()) {
        println("A string tem ${maybeString.length} caracteres.")
    } else {
        println("A string é nula ou vazia.")
    }
}
fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("Estudando Kotlin"))
}