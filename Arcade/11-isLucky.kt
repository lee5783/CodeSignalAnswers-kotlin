fun main() {
    println("isLucky: ${isLucky(1230)}")
}

fun isLucky(n: Int): Boolean {
  var str = "${n}"
  if(sumOfString(str.slice(0..(str.length/2)-1)) == sumOfString(str.slice(str.length/2..str.length-1))) {
    return true
  }
  return false
}

fun sumOfString(str: String): Int {
    var sum = 0
    for(i in str.asSequence()) {
		sum += Character.getNumericValue(i)
    }
    return sum
}