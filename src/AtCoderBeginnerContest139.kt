import kotlin.math.sqrt

//fun main(args: Array<String>) {
//    val S = readLine()!!.toCharArray()
//    val T = readLine()!!.toCharArray()
//    var count = 0
//    for (i in 0..2) {
//        if (S[i] == T[i]) count += 1
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val (a, b) =  readLine()!!.split(" ").map(String::toInt)
//    var x = 1
//    var count = 0
//    val inc = a - 1
//    while (true) {
//        if (x >= b) {
//            println(count)
//            return
//        }
//        count += 1
//        x += inc
//    }
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val hList =  readLine()!!.split(" ").map(String::toDouble)
//    var count = 0
//    var maxCount = 0
//    for (i in 0 until n-1) {
//        if (hList[i] >= hList[i+1]) {
//            count += 1
//        } else {
//            maxCount = Math.max(maxCount, count)
//            count = 0
//        }
//    }
//    maxCount = Math.max(maxCount, count)
//    println(maxCount)
//}

//fun main(args: Array<String>) {
//    val N = readLine()!!.toInt()
//    println((1L until N).sum())
//}

//fun main(args: Array<String>) {
//    val N = readLine()!!.toInt()
//    val aListList = Array(N) {
//        readLine()!!.split(" ").map(String::toInt).toIntArray()
//    }
//
//    var iterList = IntArray(N)
//    var nextList = (0 until N).map { aListList[it][iterList[it]] }
//    var count = 0
//    while (true) {
//
//    }
//    println(nextList.joinToString(" "))
//}

data class A(
    val n: Int,
    val x: Int,
    val y: Int
)

fun distance(x: Int, y: Int) :Double {
    return Math.sqrt(x*x.toDouble() + y*y.toDouble())
}

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val engineList = Array(N) {
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        Pair(x, y)
    }
//    val useAllX = (0 until N).map { engineList[it].first }.sum()
//    val useAllY = (0 until N).map { engineList[it].second }.sum()
//    val useAllDis = distance(useAllX, useAllY)
//    println(useAllDis)
    for (i in 0 until N) {
        var max = 0.0
        val remins = (0 until N).filter { it != i }
        println(remins.joinToString(" "))
        for (j in remins) {
            val dis = distance(engineList[i].first + engineList[j].first, engineList[i].second + engineList[j].second)
            max = Math.max(max, dis)
        }
        println("i $i max $max")
    }

    var dis = 0.0
    var now = Pair(0, 0)
    for (i in 0 until N) {
        now = Pair(now.first + engineList[i].first, now.second + engineList[i].second)
        dis = distance(now.first, now.second)
    }
    println(dis)
}