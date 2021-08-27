fun main() {
    val input = mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)
    println("sortByHeight: ${sortByHeight(input)}")
}

fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
  var results = a.toMutableList()
  var people = a.filter { it != -1 }.sorted()
  
  var peopleIndex = 0
  for(i in 0 until results.size) {
      if(results[i] == -1) continue //skip if this is tree
      
      results[i] = people[peopleIndex]
      peopleIndex++
  }
  return results
}