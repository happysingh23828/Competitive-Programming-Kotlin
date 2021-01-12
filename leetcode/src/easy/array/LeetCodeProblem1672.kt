package easy.array

class Solution {

    fun maximumWealth(accounts: Array<IntArray>): Int {

        var maximumWealth = 0

        accounts.forEach { eachRow ->
            val sumOfEachRow = getSumOfArray(eachRow)

            if (sumOfEachRow > maximumWealth) {
                maximumWealth = sumOfEachRow
            }
        }

        return maximumWealth
    }

    fun getSumOfArray(nums: IntArray): Int {

        var totalSum = 0

        for (i in nums.indices) {
            totalSum += nums[i]
        }

        return totalSum
    }
}