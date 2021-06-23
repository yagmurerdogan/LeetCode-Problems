package com.yagmurerdogan.problem_1_twosum

class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                val tmp = map[target - nums[i]]!!.toInt()
                return intArrayOf(tmp, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}