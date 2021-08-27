fun main() {
    val input = "(abc)d(efg)"
    println("reverseInParentheses: ${reverseInParentheses(input)}")
}

fun reverseInParentheses(inputString: String): String {
    if(!inputString.contains("(") && !inputString.contains(")")) {
        return inputString
    }

    var resultString = inputString
    while(resultString.contains("(")) {
        val startIndex = resultString.indexOfFirst { it == '(' }
        //val endIndex = inputString.indexOfLast { it == ')' }
        var endIndex = -1
        var count = 1
        for(i in startIndex+1..resultString.length-1) {
            if(resultString[i] == '(') {
                count += 1
            } else if (resultString[i] == ')') {
                count -= 1
                if (count == 0) {
                    endIndex = i
                    break 
                }
            }
        }

        val left = resultString.slice(0..startIndex-1)
        val right = resultString.slice(endIndex+1..resultString.length-1)
        val mid = resultString.slice(startIndex+1..endIndex-1)
        println("${startIndex} ${endIndex}")
        println("${left}-${mid}-${right}")
        resultString =  "${left}${reverseInParentheses(mid).reversed()}${right}"
    }

    return resultString
}