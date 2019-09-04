import com.sun.tools.javac.util.List

//fun main(args: Array<String>) {
//    val a = readLine()!!.toInt()
//    val s = readLine()!!
//    println(if (a >= 3200) s else "red")
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val aList =  readLine()!!.split(" ").map(String::toFloat)
//    val a2List = aList.map { if(it != 0f) 1/it else 0f }.sum()
//    println(if(a2List !=0f) 1/a2List else 0)
//}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val vList =  readLine()!!.split(" ").map(String::toFloat).sorted()
//    println(vList.fold(vList[0]) { x, y -> (x+y)/2})
//}

fun main(args: Array<String>) {
    val (n, q) = readLine()!!.split(" ").map(String::toInt)
    val aBList = Array(n-1) { val (a, b) = readLine()!!.split(" ").map(String::toInt); Pair(a,b) }
    val pxList = Array(q) { val (p, x) = readLine()!!.split(" ").map(String::toInt); Pair(p,x) }
    val pairList = (1..n).map { mutableListOf<Int>() }
    aBList.forEach { (a, b) ->
        pairList[a-1].add(b)
        (0 until n).forEach {
            if(pairList[it].contains(a)) pairList[it].add(b)
        }
    }
//    pairList.forEach {
//        println(it)
//    }
    val pairList2 = (1..n).toMutableList()
    pxList.forEach { (p, x) ->
        pairList[p - 1].forEach {
            pairList2[it - 1] += x
        }
    }
    println(pairList2[0])
}