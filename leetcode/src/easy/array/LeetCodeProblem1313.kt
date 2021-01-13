package easy.array

// problem https://leetcode.com/problems/decompress-run-length-encoded-list
class Solution1313 {
    fun decompressRLElist(nums: IntArray): IntArray {

        // length of the answer array
        var length = 0

        for (i in 0 until nums.size / 2) {
            length += nums[2 * i]
        }

        // initializing answer array
        val answer = IntArray(length)
        var j = 0

        for (i in 0 until nums.size / 2) {

            // no of elements to add in sub array
            val count = nums[2 * i]

            // number to add in sub array
            val num = nums[2 * i + 1]

            // adding sub array to answer array
            for (k in 0 until count) {
                answer[j++] = num
            }
        }

        return answer
    }
}