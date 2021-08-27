fun main() {
    var arr = mutableListOf(3, 6, -2, -5, 7, 3)
    println("adjacentElementsProduct: ${adjacentElementsProduct(arr)}")
}

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
  if(inputArray.size > 10 || inputArray.size < 2) return 0
  
  var a = inputArray[0]
  var b = inputArray[1]
  for(i in 1 until inputArray.size - 1) {
      if(inputArray[i] * inputArray[i + 1] > a * b) {
          a = inputArray[i]
          b = inputArray[i+1]
      }
  }
  
  return a * b
}
