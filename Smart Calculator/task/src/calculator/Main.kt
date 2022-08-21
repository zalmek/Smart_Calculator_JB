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
        var inputLine = readln()
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
                inputLine = inputLine.filterNot { it == ' ' }
                if (!inputLine.matches(Regex("\\s*[+-]*\\d+\\s*(\\s*[+-]+\\d+\\s*)*"))) {
                    if (inputLine.contains(Regex("/"))) {
                        println("Unknown command")
                        continue
                    }
                    println("Invalid expression")
                    continue
                }
                //println(inputLine)
                inputLine = inputLine.replace("+", " ").replace("--", " ").replace("-", " -")
                while (inputLine.replace("  ", " ") != inputLine) {
                    inputLine = inputLine.replace("  ", " ")
                }
                inputLine = inputLine.trim()
                val list: List<Int> = (inputLine.split(" ").map { it.toInt() })
                println(sum(list))
            }
        }
    }
}
