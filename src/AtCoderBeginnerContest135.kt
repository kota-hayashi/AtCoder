import kotlin.math.min

//fun main(args: Array<String>) {
//    val (a, b) = readLine()!!.split(" ").map(String::toInt)
//    if (a == b) {
//        println(0)
//        return
//    }
//    if ((a - b) % 2 == 0) {
//        val k = a+b
//        if (k>=0){
//            print(k/2)
//        }else{
//            print(-k/2)
//        }
//        return
//    }
//    print("IMPOSSIBLE")
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val pList = readLine()!!.split(" ").map(String::toInt)
//    val sortedPList = pList.sorted()
//
//    var count = 0
//    for (i in 0 until n) {
//        if (pList[i] != sortedPList[i]) count += 1
//    }
//    if (count == 2 || count == 0) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val aList = readLine()!!.split(" ").map(String::toInt).toMutableList()
//    val bList = readLine()!!.split(" ").map(String::toInt).toMutableList()
//
//    var count:Long = 0
//    for (i in 0 until n) {
//        val d = Math.min(aList[i], bList[i])
//        count += d
//        aList[i] -= d
//        bList[i] -= d
//        val d2 = Math.min(aList[i+1], bList[i])
//        count += d2
//        aList[i+1] -= d2
//        bList[i] -= d2
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val aList = readLine()!!.split(" ").map(String::toInt).toMutableList()
//    val bList = readLine()!!.split(" ").map(String::toInt)
//
//    var count: Long = 0
//    for (i in n-1 downTo 0) {
//        val b = bList[i]
//        if (aList[i+1] <= b) {
//            count += aList[i+1]
//            val b2 = b - aList[i+1]
//            if (aList[i] <= b2) {
//                count += aList[i]
//                aList[i] = 0
//            } else {
//                count += b2
//                aList[i] -= b2
//            }
//        }else{
//            count += b
//        }
//    }
//    println(count)
//}

fun main(args: Array<String>) {
    val s = readLine()!!
    val dp = Array(s.length+1) {Array(13) {0L} }
    val mod = 1000000007L
    dp[0][0] = 1L
    for (i in 0 until s.length) {
        for (j in 0 until 13) {
            if (s[i] == '?') {
                for(k in 0..9) {
                    dp[i+1][(j*10 + k) % 13] += dp[i][j]%mod
                }
            } else {
                dp[i+1][(j*10 + (s[i] - '0')) % 13] += dp[i][j]%mod
            }
        }
    }
    println(dp[s.length][5]%mod)
}