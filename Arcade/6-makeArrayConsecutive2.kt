fun main() {
    val input = mutableListOf(6, 2, 3, 8)
    println("makeArrayConsecutive2: ${makeArrayConsecutive2(input)}")
}

fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    if(statues.size > 10 || statues.size < 1) return 0
    statues.sort()
    var result = 0
    for(i in 0 until statues.size - 1) {
        if(statues[i] < statues[i+1]) {
            result += statues[i+1] - statues[i] - 1
        }
    }
    return result
}