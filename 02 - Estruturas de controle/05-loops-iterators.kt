class Animal (val name: String)

class Zoo (val animais: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animais.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("Leão"), Animal("Tigre"), Animal("Urso")))

    for (animal in zoo) {
        println("Visitando o animal: ${animal.name}")
    }
}