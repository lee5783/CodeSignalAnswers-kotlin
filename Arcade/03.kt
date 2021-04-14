fun main() {
    var str = "aabaa"
    println("checkPalindrome: ${checkPalindrome(str)}")
}

fun checkPalindrome(inputString: String): Boolean {
    val maxLoop = inputString.length / 2
    for(i in 0..maxLoop)  {
        if(inputString.get(i) != inputString.get(inputString.length - 1 - i)) {
            return false
        }
    }
    return true
}