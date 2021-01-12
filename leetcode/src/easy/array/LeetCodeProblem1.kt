package easy.array

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        // if it has only 2 elements, returning same array indexs because all testcases will have only 1 solution.
        if(nums.size ==2) {
            return intArrayOf(0,1)
        }


        val returningArray = IntArray(2)

        for(i in 0..nums.size-2) {

            for(j in i+1..nums.size-1) {

                if((nums[i]+nums[j]) == target) {
                    return intArrayOf(i,j)
                }
            }
        }

        return returningArray
    }
}