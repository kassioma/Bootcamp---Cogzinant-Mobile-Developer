fun comerUmBolo() = println("Comendo um bolo...")
fun assandoUmBolo() = println("Assando um bolo...") 

fun main() {
    var bolosComidos = 0
    var bolosAssados = 0

    while (bolosComidos < 5) {
        comerUmBolo()
        bolosComidos ++
    }

    do {
        assandoUmBolo()
        bolosAssados ++
    } while (bolosAssados < bolosComidos)
}