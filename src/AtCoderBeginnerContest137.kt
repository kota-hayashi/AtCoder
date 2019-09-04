
//fun main(args: Array<String>) {
//    val (a, b) = readLine()!!.split(" ").map(String::toInt)
//    println(listOf(a+b, a-b, a*b).max())
//}

//fun main(args: Array<String>) {
//    val (k, x) = readLine()!!.split(" ").map(String::toInt)
//    println((x-k+1 until x+k).filter{it in -1000000..1000000}.joinToString(" "))
//}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val strings = Array(n) { readLine()!!.toCharArray().sorted().map { it - 'a' } }
    val stringSet = strings.toSet()
    val nums = stringSet.map { target ->
        strings.count { it == target } }
    println(nums.map { (1 until it).sum() }.sum())
}