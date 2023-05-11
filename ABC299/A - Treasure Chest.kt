fun main(args: Array<String>) {
    readLine()!!
    val string = readLine()!!.split("")
    
    var isInclude: Boolean = false
    var answer: String = "out"
    string.forEach { s ->
        when {
            (s == "*") and isInclude -> {
                answer = "in"
            }
            (s == "|") -> {
                isInclude = !isInclude
            }
        }
    }
    println(answer)
}