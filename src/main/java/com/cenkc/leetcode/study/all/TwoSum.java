package com.cenkc.leetcode.study.all;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 *
 * https://leetcode.com/problems/two-sum/
 * Difficulty : Medium
 * Related Topics : Array, HashTable
 *
 * created by cenkc on 07.08.2020
 */
public class TwoSum {
    /**
     *
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * <p>You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * <p><b>Example:</b>
     * <p>
     * <pre>{@code
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * }</pre>
     *
     * @param nums array of integers
     * @param target target number
     * @return indices of the two numbers such that they add up to a specific target
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> bucket = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int complement = target - nums[i];
            if (bucket.containsKey(complement)) {
                return new int[]{bucket.get(complement), i};
            }
            bucket.put(nums[i], i);
        }
        throw new IllegalArgumentException("no result");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] givenNums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(givenNums, target)));
    }
}
