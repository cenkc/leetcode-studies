package com.cenkc.leetcode.study.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created by cenkc on 4/24/2020
 */
class W01MaxSumSubArrOfAFixedSizeKTest {

    @Test
    public void max_shouldPass() {
        W01MaxSumSubArrOfAFixedSizeK maxSumSubArrOfAFixedSizeK = new W01MaxSumSubArrOfAFixedSizeK();
        assertEquals(16, maxSumSubArrOfAFixedSizeK.solution(new int[]{4, 2, 1, 7, 8, 1 ,2, 8, 1, 0}, 3));
        assertEquals(17, maxSumSubArrOfAFixedSizeK.solution(new int[]{4, 2, 1, 7, 8, 2 ,2, 8, 1, 0}, 3));
        assertEquals(19, maxSumSubArrOfAFixedSizeK.solution(new int[]{4, 2, 1, 7, 8, 4 ,2, 8, 1, 0}, 3));
    }
}