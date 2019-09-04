import kotlin.math.abs

fun main0(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b, c) = readLine()!!.split(" ").map(String::toInt)
    val s = readLine()!!
    println("${a + b + c} $s")
}

fun main1(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)

    println(if ((a * b) % 2 ==0) "Even" else "Odd")
}

fun main2(args: Array<String>) {
    val a = readLine()!!.count { c -> c == '1' }
    println(a)
}

fun main3(args: Array<String>) {
    val a = readLine()!!.toInt()
    var intList = readLine()!!.split(" ").map(String::toInt)
    var count = 0
    while(true) {
        intList = intList.filter { it % 2 == 0 }.map { it / 2 }
        if (intList.count() == a) count += 1
        else break
    }
    println(count)
}

fun main4(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    var count = 0
    a.downTo(0).forEach { an ->
        b.downTo(0).forEach { bn ->
            c.downTo(0).forEach { cn ->
                if (an * 500 + bn * 100 + cn * 50 == x) count += 1
            }
        }
    }
    println(count)
}

fun main5(args: Array<String>) {
    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)
    println((0..n).filter { it.toString().toCharArray().map(Char::toInt).map{c -> c-48}.sum()in a..b}.sum())
}

fun main6(args: Array<String>) {
    val n = readLine()!!.toInt()
    val intList = readLine()!!.split(" ").map(String::toInt)
    var alice = 0
    var bob = 0
    intList.sorted().forEachIndexed { index, num ->
        if (index % 2 == 0) alice += num else bob += num
    }
    val x = alice - bob
    println(if(x >= 0) x else -x)
}

fun main7(args: Array<String>) {
    val n = readLine()!!.toInt()
    val intSet: MutableSet<Int> = mutableSetOf<Int>()
    (0 until n).forEach {
        intSet.add(readLine()!!.toInt())
    }
   println(intSet.count())
}

fun main8(args: Array<String>) {
    val (n, y) = readLine()!!.split(" ").map(String::toInt)
    val y2 = y/1000
    (0..n).forEach { n1 ->
        (0..n-n1).forEach { n2 ->
            val n3 = n-n1-n2
                if (10*n1 + 5*n2 + n3 == y2) {
                    println("$n1 $n2 $n3")
                    return
            }
        }
    }
    println("-1 -1 -1")
}

fun main9(args: Array<String>) {
    val s = readLine()!!
    val y1 = "dream"
    val y2 = "dreamer"
    val y3 = "erase"
    val y4 = "eraser"
    val s2 = s.replace(y4, "").replace(y3, "").replace(y2, "").replace(y1, "")
    println(if(s2 == "") "YES" else "NO")
}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ct = 0
    var cx = 0
    var cy = 0
    (0 until n).forEach a@ {
        val (t, x, y) = readLine()!!.split(" ").map(String::toInt)
        val moveCount = t - ct
        val moveX = cx - x
        val absMoveX = if(moveX >= 0) moveX else -moveX
        val moveY = cy - y
        val absMoveY = if(moveY >= 0) moveY else -moveY
        if ((absMoveX + absMoveY) > moveCount) {
            println("No")
            return
        }
//        (0..moveCount).forEach { i ->
//            val j = moveCount - i
//            if (i%2 == absMoveX%2 && j%2 == absMoveY%2) {
//                ct = t
//                cx = x
//                cy = y
//                return@a
//            }
//        }
        if ((absMoveX + absMoveY)%2 != moveCount%2) {
            println("No")
            return
        }
        ct = t
        cx = x
        cy = y
    }
    println("Yes")
}