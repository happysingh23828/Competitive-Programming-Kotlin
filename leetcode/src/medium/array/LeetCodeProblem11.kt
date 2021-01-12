package medium.array

// Not able to solve :-(
class Solution11WithBruteForce {

    fun maxArea(height: IntArray): Int {

        var maximumArea = 0

        for (i in 0 until height.size) {

            for (j in i + 1 until height.size) {

                var areaBetweenLines = Math.min(height[i], height[j]).times(j - i)
                maximumArea = Math.max(areaBetweenLines, maximumArea)

            }
        }

        return maximumArea
    }
}

class Solution11WithTwoPointer {

    fun maxArea(height: IntArray): Int {

        var maximumArea = 0
        var left = 0
        var right = height.size - 1

        while (left < right) {
            maximumArea = Math.max(maximumArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maximumArea
    }
}
