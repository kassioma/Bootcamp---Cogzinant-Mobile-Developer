fun main() {
    val authors = setOf("Aldous Huxley", "George Orwell", "Yuval Noah Harari")
    val writers = setOf("George Orwell", "J.K. Rowling", "Yuval Noah Harari")

    println("authors == writers: ${authors == writers}") // false
    println("authors != writers: ${authors != writers}") // true
    println("authors === writers: ${authors === writers}") // false
    println("authors !== writers: ${authors !== writers}") // true
}