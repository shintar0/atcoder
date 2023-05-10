fun main(args: Array<String>) {
    val (_, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }
 
    c.forEachIndexed { index, i ->
        if (a+b == i) {
            println(index+1)
            return@forEachIndexed
        }
    }
}