package medium.array

// problem https://leetcode.com/problems/count-number-of-teams/

// Not able to solve :-(
class Solution1395 {
    fun numTeams(rating: IntArray): Int {
        var teams = 0
        var smallL = 0
        var smallR = 0
        var bigL = 0
        var bigR = 0

        for (i in 1 until rating.size - 1) {
            for (j in i - 1 downTo 0) {
                if (rating[i] > rating[j]) {
                    smallL++
                } else {
                    bigL++
                }
            }
            for (j in i + 1 until rating.size) {
                if (rating[i] < rating[j]) {
                    bigR++
                } else {
                    smallR++
                }
            }
            teams += smallL * bigR + bigL * smallR
            bigL = 0
            bigR = 0
            smallR = 0
            smallL = 0
        }
        return teams
    }
}