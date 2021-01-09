package easy

// [Problem] https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution26 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size == 1)
            return 1

        var updatedIndex = 1
        for (i in nums.indices) {

            if (i + 1 == nums.size)
                return updatedIndex

            if (nums[i] != nums[i + 1]) {
                nums[updatedIndex] = nums[i + 1]
                updatedIndex += 1
            }

        }

        return updatedIndex
    }
}