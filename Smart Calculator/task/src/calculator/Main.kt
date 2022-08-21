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
    while (true){
        val inputLine = readln()
        when (inputLine){
            "" -> continue
            "/exit" -> {
                println("Bye!")
                return
            }
            else ->{
                val list = inputLine.split(" ").map { it.toInt() }
                if (list.size==1){
                    println(list[0])
                }
                else
                    println(sum(list[0],list[1]))
            }
        }
    }
}
