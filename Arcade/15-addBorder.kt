fun main() {
    val input = mutableListOf(
        "aaaa",
        "bbbb",
        "cccc"
    )
    println("addBorder: ${addBorder(input)}")
}

fun addBorder(picture: MutableList<String>): MutableList<String> {
    val longestStr = picture.maxByOrNull { it.length }

    var topBorder = ""
    for(i in 0 until longestStr!!.length + 2) {
        topBorder += "*"
    } 
    var result = mutableListOf(topBorder)
    result.addAll(picture.map {
        "*${it}*"
    })
    result.add(topBorder) 
    return result
}