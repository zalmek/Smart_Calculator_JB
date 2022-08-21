package calculator

/**
 * @param a [Int]: first integer
 * @param b [Int]: second integer
 * @exception NumberFormatException if input is wrong
 * @return sum of [List] integers
 */
fun sum(list: List<Int>): Int {
    return list.sum()
}

fun main() {
    while (true) {
        val inputLine = readln()
        when (inputLine) {
            "" -> continue
            "/exit" -> {
                println("Bye!")
                return
            }

            "/help" -> {
                println("The program calculates the sum of numbers")
            }

            else -> {
                val list: List<Int> = (inputLine.split(" ").map { it.toInt() })
                println(sum(list))
            }
        }
    }
}
