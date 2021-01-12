package easy.array.array

class Solution665 {

    /**
     * Not able to solve :-(
     */
    fun checkPossibility(nums: IntArray): Boolean {

        // if only has 1 element
        if (nums.size == 1) {
            return true
        }

        var noOfElementsNeedToRearrange = 0

        for (i in 1..nums.size - 1) {


            if (nums[i] < nums[i - 1]) {

                noOfElementsNeedToRearrange += 1

                // understood and copied this logic , https://leetcode.com/problems/non-decreasing-array/discuss/106826/JavaC++-Simple-greedy-like-solution-with-explanation/227119
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1];
                }
            }

            if (noOfElementsNeedToRearrange > 1) {
                return false
            }
        }

        return true

    }
}

fun main() {
    print(Solution665().checkPossibility(intArrayOf(3, 4, 2, 3)))
}