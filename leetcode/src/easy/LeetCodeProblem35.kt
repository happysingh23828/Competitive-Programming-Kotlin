package easy

// Problem https://leetcode.com/problems/search-insert-position/
class Solution35 {

    fun searchInsert(nums: IntArray, target: Int): Int {

        if(nums[0] >= target) {
            return 0
        }

        for(i in 0 until nums.size-1) {

            if (nums[i] == target) {
                return i
            }

            if (nums[i+1] == target) {
                return i+1
            }

            if(nums[i] < target && nums[i+1] > target) {
                return i+1
            }
        }


        return nums.size
    }
}