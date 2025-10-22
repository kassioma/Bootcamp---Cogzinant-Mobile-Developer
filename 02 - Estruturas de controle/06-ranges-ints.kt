fun main () {
    for (i in 1..5) { // inclui o 5
        print(i)
    }
    print("  ")

  	for (i in 0 until 5) { // não inclui o 5
        print(i)
    }
    print("  ")

    for (i in 2..10 step 2) { // incrementa de 2 em 2
        print(i)
    }
    print("  ")

    for (i in 5 downTo 1) { // contagem regressiva
        print(i)
    }
    print("  ")
}