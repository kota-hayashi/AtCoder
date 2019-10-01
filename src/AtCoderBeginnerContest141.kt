private fun a(args: Array<String>) {
    val t = readLine()!!
    println(when(t) {
        "Sunny" -> "Cloudy"
        "Cloudy" -> "Rainy"
        "Rainy" -> "Sunny"
        else -> ""
    })
}

private fun b(args: Array<String>) {
    val s = readLine()!!
    val a = s.filterIndexed { index, c -> index % 2 == 0 }.all { it != 'L' }
    val b = s.filterIndexed { index, c -> index % 2 == 1 }.all { it != 'R' }
    println(if(a && b) "Yes" else "No")
}

private fun c1(args: Array<String>) {
    val (n, k, q) = readLine()!!.split(" ").map(String::toInt)
    val As = Array(q) {
        readLine()!!.toInt()
    }
    val xxx = Array(n) {k}
    As.forEach {
        val target = it - 1
        for (i in 0 until n) {
            if (i != target) xxx[i]--
        }
    }
    xxx.forEach {
        println(if (it > 0) "Yes" else "No")
    }
}

private fun c(args: Array<String>) {
    val (n, k, q) = readLine()!!.split(" ").map(String::toInt)
    val As = Array(q) {
        readLine()!!.toInt()
    }
    val Cs = Array(n) {0}
    As.forEach { Cs[it-1]++ }
    for (i in 0 until n) {
        println(if(k+Cs[i]-q > 0) "Yes" else "No")
    }
}

private fun d(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val aList = readLine()!!.split(" ").map(String::toInt).toMutableList()
    val origin = aList.toIntArray().copyOf()
    val count = Array(n) {0}
    for (i in 0 until m) {
        val maxIndex = aList.indices.maxBy { aList[it] } ?: -1
        aList[maxIndex] /= 2
        count[maxIndex]++
    }
//    println(origin.joinToString(" "))
    val xxx = origin.mapIndexed { index, i -> i / Math.pow(2.0, count[index].toDouble()).toInt() }

    println(xxx.map { it.toDouble() }.sum())
}

class Pad(
    val index: Int,
    val lengeth: Int,
    val sameList: List<Int>
)

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    if (s == "") {
        println(0)
        return
    }
    val dp = Array(n) {
        Array(s.length, { mutableListOf<Int>()})
    }

    var max = 0
    for (i in 0 until s.length) {
        for (j in i+1 until s.length) {
            if (s[i] == s[j]){
                dp[i][1].add(j)
                max = 1
            }
        }
    }

    for (si in 2 until s.length) {
        for (i in 0 until s.length) {
            dp[i][si-1]   .forEach {
                if (it + si > s.length) return@forEach
                if (i + si > it) return@forEach
                if (s[i+1] == s[it+1]){
                    dp[i][si].add(it)
                    max = si
                }
            }
        }
    }
    println(max)
}