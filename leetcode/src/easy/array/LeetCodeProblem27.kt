package easy.array

// [Problem] https://leetcode.com/problems/remove-element/
class Solution27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {

        var i = 0

        for (j in nums.indices) {

            if (nums[j] != `val`) {
                nums[i] = nums[j]
                i++
            }

        }

        return i
    }
}