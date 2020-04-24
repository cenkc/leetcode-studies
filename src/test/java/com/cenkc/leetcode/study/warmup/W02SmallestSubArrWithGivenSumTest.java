package com.cenkc.leetcode.study.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created by cenkc on 4/24/2020
 */
class W02SmallestSubArrWithGivenSumTest {

    @Test
    public void smallestSubArrWithGivenSumTest_shouldPass () {
        W02SmallestSubArrWithGivenSum smallestSubArrWithGivenSum = new W02SmallestSubArrWithGivenSum();
        assertEquals(1, smallestSubArrWithGivenSum.solution(new int[]{4, 2, 1, 7, 8, 1 ,2, 8, 1, 0}, 8));
        assertEquals(2, smallestSubArrWithGivenSum.solution(new int[]{4, 2, 1, 7, 5, 1 ,2, 3, 1, 0}, 8));
    }
}