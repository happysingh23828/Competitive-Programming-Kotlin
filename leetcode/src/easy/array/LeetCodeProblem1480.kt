package easy.array
class Solution1480 {

    fun runningSum(nums: IntArray): IntArray {

        // if array has only one element
        if(nums.size == 1) {
            return nums
        }


        for (i in 1..nums.size-1) {
            nums[i] += nums[i-1]
        }

        return nums
    }
}