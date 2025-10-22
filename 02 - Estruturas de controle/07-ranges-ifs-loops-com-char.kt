fun main() {
    for (c in 'a'..'e') {
    print(c)
    }
    print("  ")

    for (c in 'z' downTo 'v') {
        print(c)
    }
    print("  ")

    val x = 'd'
    if (x in 'a'..'f') {
        print("$x está entre 'a' e 'f'")
    } else {
        print("$x não está entre 'a' e 'f'")
    }
}