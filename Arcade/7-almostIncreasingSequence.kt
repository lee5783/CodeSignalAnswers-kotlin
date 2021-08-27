fun main() {
    val input = mutableListOf(1, 3, 2, 1)
    println("almostIncreasingSequence: ${almostIncreasingSequence(input)}")
}

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    if(sequence.size >= 100000 || sequence.size < 2) return true
    var newSequence = sequence.distinct()
    if (sequence.size - newSequence.size >= 2) return false
    
    var j = findFirstBadPair(sequence)
    if(j == -1) return true
    var tempArr = sequence.toMutableList().apply { this.removeAt(j) }
    //println("List: ${tempArr}")
    if(findFirstBadPair(tempArr) == -1) return true
    tempArr = sequence.toMutableList().apply { this.removeAt(j + 1) }
    //println("List 2: ${tempArr}")
    if(findFirstBadPair(tempArr) == -1) return true
    
    return false
    
}

fun findFirstBadPair(sequence: MutableList<Int>) : Int {
    for (i in 0 until sequence.size - 1) {
        if(sequence[i] >= sequence[i+1]) {
            return i
        }
    }
    return -1
}