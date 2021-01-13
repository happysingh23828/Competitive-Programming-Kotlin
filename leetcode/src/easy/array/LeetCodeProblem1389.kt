package easy.array

// problem https://leetcode.com/problems/create-target-array-in-the-given-order/
class Solution1389 {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {

        val list : MutableList<Int> = mutableListOf()

        for(i in nums.indices) {
            list.add(index[i],nums[i])
        }

        return list.toIntArray()
    }
}