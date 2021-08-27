fun main() {
    val s1 = "aabcc"
    val s2 = "adcaa"
    println("commonCharacterCount: ${commonCharacterCount(s1, s2)}")
}

fun commonCharacterCount(s1: String, s2: String): Int {
    var counts = 0
    for(i in 'a'..'z') {
        var countS1 = s1.toCharArray().filter { it == i }.size
        var countS2 = s2.toCharArray().filter { it == i }.size
        counts += minOf(countS1, countS2)
    }
    
    return counts
}