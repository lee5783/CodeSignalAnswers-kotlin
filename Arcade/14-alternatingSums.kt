fun main() {
    val input = mutableListOf(50, 60, 60, 45, 70)
    println("alternatingSums: ${alternatingSums(input)}")
}

fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    var team1 = 0
    var team2 = 0
    a.forEachIndexed { index, value ->
        if(index % 2 == 0) {
            team1 += value
        } else {
            team2 += value
        }
    }

    return mutableListOf(team1, team2)
}