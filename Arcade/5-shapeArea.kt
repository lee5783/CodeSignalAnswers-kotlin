fun main() {
    println("shapeArea: ${shapeArea(3)}")
}

fun shapeArea(n: Int): Int {
    return (n * 2 - 1) + 2 * lineArea(n)
}

fun lineArea(n: Int): Int {
    if(n == 1) return 0
    if(n == 2) return 1
    return n * 2 - 3 + lineArea(n - 1)
} 