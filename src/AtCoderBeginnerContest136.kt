
//fun main(args: Array<String>) {
//    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
//    val r = c -(a-b)
//    println(if (r >= 0) r else 0)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    var count = 0
//    for (i in 1..n) {
//        if (i.toString().count() % 2 == 1) count += 1
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val hList = readLine()!!.split(" ").map(String::toInt).toMutableList()
//    for (i in n-2 downTo 0) {
//        if(hList[i] > hList[i+1] + 1) {
//            println("No")
//            return
//        } else if (hList[i] == hList[i+1] + 1) hList[i] -= 1
//    }
//    println("Yes")
//}

// オーダーがダメ
//fun main(args: Array<String>) {
//    val s = readLine()!!.toCharArray()
//    val result = IntArray(s.size)
//    for (i in 0 until s.size) {
//        if (s[i] == 'R') {
//            for (j in i+1 until s.size) {
//                if (s[j] == 'L') {
//                    if ((j - i) % 2 == 1) result[j-1] += 1
//                    else result[j] += 1
//
//                    break
//                }
//            }
//        }else{
//            for (j in i-1 downTo  0) {
//                if (s[j] == 'R') {
//                    if ((i - j) % 2 == 1) result[j+1] += 1
//                    else result[j] += 1
//
//                    break
//                }
//            }
//        }
//
//    }
//    println(result.joinToString(" "))
//}

//fun main(args: Array<String>) {
//    val s = readLine()!!.toCharArray()
//    val r = IntArray(s.size)
//    var c = 0
//    for (i in 0 until s.size) {
//        if (s[i] == 'R') {
//            c += 1
//            if (s[i+1]  == 'L') {
//                r[i+1] += c/2
//                r[i] += (c+1)/2
//            }
//        } else c = 0
//    }
//    c = 0
//    for (i in s.size-1 downTo 0) {
//        if (s[i] == 'L') {
//            c += 1
//            if (s[i-1] == 'R') {
//                r[i-1] += c/2
//                r[i] += (c+1)/2
//            }
//        } else c = 0
//    }
//    println(r.joinToString(" "))
//}

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map(String::toInt)
    val aList = readLine()!!.split(" ").map(String::toInt)
    val sumA = aList.sum()
    val max = aList.max()!!.plus(k)
    val modAList = (1..sumA).filter { sumA % it == 0 && it <= max }.reversed().toIntArray()

    for (mod in modAList) {
        val sortedAList = aList.map { it % mod }.filter { it % mod != 0 }.sorted().toIntArray()
        if (sortedAList.sum() % mod == 0 && sortedAList.sum() < 2 * k) {
            println(mod)
            return
        }
     }
}
