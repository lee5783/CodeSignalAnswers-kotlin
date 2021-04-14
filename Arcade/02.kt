fun main() {
    println("centuryFromYear: ${centuryFromYear(2021)}")
}

fun centuryFromYear(year: Int): Int {
    val century = year / 100
    return if(year % 100 > 0) century + 1 else century  
}