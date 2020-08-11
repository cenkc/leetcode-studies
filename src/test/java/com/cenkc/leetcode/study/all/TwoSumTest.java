package com.cenkc.leetcode.study.all;

import com.cenkc.leetcode.study.all.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created by cenkc on 07.08.2020
 */
class TwoSumTest {

    @Test
    void twoSum_shouldPass() {
        TwoSum twoSum = new TwoSum();
        int[] expected1 = {0, 1};
        int[] arg1 = {2, 7, 11, 15};
        int arg2 = 9;
        assertArrayEquals(expected1, twoSum.twoSum(arg1, arg2));
    }
}