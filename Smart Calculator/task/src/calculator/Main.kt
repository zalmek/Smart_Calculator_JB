package calculator

/**
 * @param a [Int]: first integer
 * @param b [Int]: second integer
 * @exception NumberFormatException if input is wrong
 * @return sum of two integers : a+b
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println(sum(a, b))
}
