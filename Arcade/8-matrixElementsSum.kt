fun main() {
    val input = mutableListOf(
        mutableListOf(0, 1, 1, 2),
        mutableListOf(0, 5, 0, 0),
        mutableListOf(2, 0, 3, 3),
    )
    println("matrixElementsSum: ${matrixElementsSum(input)}")
}

fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var shouldAdd = MutableList(matrix[0].size) { true }
    for(i in 0 until shouldAdd.size) {
        shouldAdd[i] = true
    }
    
    var results = 0
    for(rowIndex in 0 until matrix.size) {
        var row = matrix[rowIndex]
        for(colIndex in 0 until row.size) {
            if(shouldAdd[colIndex]) {
                results += row[colIndex]
            }
            if(row[colIndex] == 0) {
                shouldAdd[colIndex] = false
            }
        }   
    }
    return results
}
