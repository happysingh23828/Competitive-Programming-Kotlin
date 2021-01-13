package easy.array

import java.util.*
import kotlin.collections.HashMap

// problem https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution1365 {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val map: MutableMap<Int, Int> = HashMap()

        val copy = nums.clone()

        Arrays.sort(copy)

        for (i in nums.indices) {
            map.putIfAbsent(copy[i], i)
        }

        for (i in nums.indices) {
            copy[i] = map[nums[i]]!!
        }

        return copy
    }
}