fun main1() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    println(if (a * b % 2 == 0) "Even" else "Odd")
}

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b, c) = readLine()!!.split(" ").map(String::toInt)
    val s = readLine()!!
    println("${a + b + c} $s")
}