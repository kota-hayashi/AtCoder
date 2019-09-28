//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    println(n*n*n)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val aList = readLine()!!.split(" ").map(String::toInt)
//    val bList = readLine()!!.split(" ").map(String::toInt)
//    val cList = readLine()!!.split(" ").map(String::toInt)
//
//    var count = 0
//    for (i in 0 until aList.size - 1) {
//        if (aList[i] + 1 == aList[i+1]) count += cList[aList[i]-1]
//    }
//    println(count + bList.sum())
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val bList = readLine()!!.split(" ").map(String::toInt)
//
//    var count = bList[0]
//    for (i in 1 until n-1) {
//        count += Math.min(bList[i-1], bList[i])
//    }
//    println(count + bList.last())
//}

//fun main(args: Array<String>) {
//    val (n, k) = readLine()!!.split(" ").map(String::toInt)
//    val s = readLine()!!
//    var count = 0
//    for (i in 0 until n) {
//        when (s[i]) {
//            'L' -> {
//                if (i != 0 && s[i-1] == 'L') count += 1
//            }
//            'R' -> {
//                if (i != n-1 && s[i+1] == 'R') count += 1
//            }
//        }
//    }
//    for (i in 1..k) {
//        count += 2
//        if (count >= n - 1) {
//            println(n -1)
//            return
//        }
//    }
//    println(count)
//}

// 計算量多すぎ
//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val pList = readLine()!!.split(" ").map(String::toInt)
//    var count = 0
//    for (l in 0 until n-1) {
//        for (r in l+1 until n) {
//            println("l $l r $r")
//            println(pList.subList(l, r+1))
//            println(pList.subList(l, r+1).sortedDescending())
//            println(pList.subList(l, r+1).sortedDescending()[1])
//            count += pList.subList(l, r+1).sortedDescending()[1]
//        }
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val pList = readLine()!!.split(" ").map(String::toInt)
//    var count = 0
//    for (l in 0 until n-1) {
//        var max = Math.max(pList[l], pList[l+1])
//        var second = Math.min(pList[l], pList[l+1])
//        count += second
//        for (r in l+2 until n) {
//            val target = pList[r]
//            when {
//                target > max -> {
//                    second = max
//                    max = target
//                }
//                target > second -> {
//                    second = target
//                }
//            }
//            println("l $l r $r")
//            println("max $max second $second")
//            count += second
//        }
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val pList = readLine()!!.split(" ").map(String::toInt)
//    val dp = Array(n, {arrayOfNulls<Int>(n)})
//    var count = 0
//    for (i in 0 until n-1) {
//        val max = Math.max(pList[i], pList[i+1])
//        val second = Math.min(pList[i], pList[i+1])
//        dp[i+1] = second
//        count += second
//    }
//
//    for (x in 2..n) {
//        for (i in 0 until  n-x) {
////            println("i $i i+x ${i+x}")
//            val max = Math.max(dp[i][i+x-1]!!, dp[i+x-1][i+x]!!)
//            val second = Math.min(dp[i][i+x-1]!!, dp[i+x-1][i+x]!!)
//            dp[i][i+x] = max
//            count += second
//        }
//    }
//
//}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val sList = readLine()!!.split(" ").map(String::toInt)
}