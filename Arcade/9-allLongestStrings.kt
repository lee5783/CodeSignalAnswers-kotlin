
fun main() {
    val input = mutableListOf(
        "aba", "aa", "ad", "vcd", "aba"
    )
    println("allLongestStrings: ${allLongestStrings(input)}")
}

fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
  var longest = inputArray.maxByOrNull { it.length }
  return inputArray.filter { it.length == longest!!.length }.toMutableList()
}
