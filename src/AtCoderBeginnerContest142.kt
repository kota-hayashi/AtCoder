private fun a(args: Array<String>) {
    val n = readLine()!!.toInt()
    if (n%2 == 0) {
        println(n/(2.0*n))
    }else {
        println((n+1)/(2.0*n))
    }
}

private fun b(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map(String::toInt)
    val hList = readLine()!!.split(" ").map(String::toInt)
    println(hList.count { it >= k })
}

private fun c(args: Array<String>) {
    val n = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map(String::toInt)
    println(aList.mapIndexed { index, i -> index+1 to i }.sortedBy { it.second }.map{ it.first}.joinToString(" "))
}

//fun main(args: Array<String>) {
//    val (a, b) = readLine()!!.split(" ").map(String::toInt)
//    val dList = (1..Math.min(a,b)).filter { a % it == 0 && b % it == 0 }
//    val ddList = dList.map { (2..it).filter { x -> it % x == 0 } }
//    println(dList.joinToString(" "))
//    println(ddList.joinToString(" "))
//    var count = 0
//    for (i in 0 until dList.size) {
//        for (j in i+1 until dList.size) {
//            println("di ${dList[i]} dj ${dList[j]}")
//            if (!ddList[i].any { it in ddList[j] }) {
//                count++
//                println("yes")
//            }
//        }
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val (a, b) = readLine()!!.split(" ").map(String::toInt)
//    val dList = (1..Math.min(a,b)).filter { a % it == 0 && b % it == 0 }
//    val ddList = dList.map { (2..it).filter { x -> it % x == 0 } }
////    println(dList.joinToString(" "))
//    val cList = mutableListOf(1)
//    var count = 1
//    for (i in 1 until dList.size) {
//        if (!cList.any { it in ddList[i] }) {
////            println("di ${dList[i]}")
//            cList.add(dList[i])
//            count++
//        }
//    }
//    println(count)
//}

//fun main(args: Array<String>) {
//    val (a, b) = readLine()!!.split(" ").map(String::toLong)
//    val dList = (1..Math.min(a,b)).filter { a % it == 0L && b % it == 0L }
//    val ddList = dList.map { (2..it).filter { x -> it % x == 0L } }
////    println(dList.joinToString(" "))
//    val cList = mutableListOf(1L)
//    var count = 1
//    for (i in 1 until dList.size) {
//        if (!cList.any { it in ddList[i] }) {
////            println("di ${dList[i]}")
//            cList.add(dList[i])
//            count++
//        }
//    }
//    println(count)
//}

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toLong)
    val dList = (1..Math.min(a,b)).filter { a % it == 0L && b % it == 0L }
//    val ddList = dList.map { (2..it).filter { x -> it % x == 0L } }
//    println(dList.joinToString(" "))
    if (dList.size == 1) {
        println(1)
        return
    }
    if (dList.size == 2) {
        println(2)
        return
    }
    val cList = mutableListOf(dList[1])
    for (i in 2 until dList.size) {
        if (cList.all { dList[i] % it != 0L }) {
//            println(cList.joinToString(" "))
            cList.add(dList[i])
//            println("di ${dList[i]}")
//            println(cList.joinToString(" "))
        }
    }
    println(cList.size+1)
}