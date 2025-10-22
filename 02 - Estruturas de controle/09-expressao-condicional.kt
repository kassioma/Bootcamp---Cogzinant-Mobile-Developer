fun main () {
    
    fun maxOLD(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxNEW(a: Int, b: Int) = if (a > b) a else b

    println(maxOLD(3, 5)) // 5
    println(maxNEW(3, 5)) // 5

}

