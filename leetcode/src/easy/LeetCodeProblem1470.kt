package easy

// problem https://leetcode.com/problems/shuffle-the-array/

class Solution1470 {

    fun shuffle(nums: IntArray, n: Int): IntArray {

        var i = 0

        val returningArray = IntArray(nums.size)

        var returningArrayIndex = 0


        for(j in n..nums.size-1) {
            returningArray[returningArrayIndex] = nums[i]
            returningArray[returningArrayIndex+1] = nums[j]
            returningArrayIndex+=2
            i++
        }

        return returningArray

    }
}