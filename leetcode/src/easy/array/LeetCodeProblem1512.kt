package easy.array

// Problem https://leetcode.com/problems/number-of-good-pairs/

class Solution1512 {

    fun numIdenticalPairs(nums: IntArray): Int {
        // return bruteForce(nums)
        return optimized(nums)
    }

    // https://leetcode.com/problems/number-of-good-pairs/discuss/731624/C%2B%2BJava-O(n)
    private fun optimized(nums : IntArray) : Int {
        val cnt = IntArray(101)
        var result = 0

        for (n in nums) {
            result += cnt[n]++
        }
        return result
    }

    private fun bruteForce(nums : IntArray) : Int {
        var count = 0

        for(i in 0..nums.size-2) {

            for (j in i+1..nums.size-1) {
                if(nums[i] == nums[j]) {
                    count++
                }
            }
        }

        return count
    }
}