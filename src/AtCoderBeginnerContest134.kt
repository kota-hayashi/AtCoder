fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    if (a == b) {
        println(0)
        return
    }
    if ((a - b) % 2 == 0) {
        val k = a+b
        if (k>=0){
            print(k/2)
        }else{
            print(-k/2)
        }
        return
    }
    print("IMPOSSIBLE")
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i+1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return(intArrayOf(i, j))
                }
            }
        }
        return(intArrayOf(0,0))
    }
}
