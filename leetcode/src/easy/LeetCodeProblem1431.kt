package easy

class Solution1431 {

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {

        val returningArray = BooleanArray(candies.size)
        val greatestNumber = getMaxValue(candies)

        for(i in candies.indices) {
            val neededCandiesToBeGreatest = greatestNumber - candies[i]
            returningArray[i] = neededCandiesToBeGreatest <= extraCandies
        }


        return returningArray
    }


    private fun getMaxValue(nums : IntArray) : Int {
        var maxValue = 0

        nums.forEach { eachNumber ->
            if(eachNumber > maxValue) {
                maxValue = eachNumber
            }
        }

        return maxValue
    }
}