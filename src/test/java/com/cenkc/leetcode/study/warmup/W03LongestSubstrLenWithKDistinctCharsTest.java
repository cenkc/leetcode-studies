package com.cenkc.leetcode.study.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created by cenkc on 4/24/2020
 */
class W03LongestSubstrLenWithKDistinctCharsTest {

    @Test
    public void longestSubstrLenWithKDistinctCharsTest_shouldPass() {
        W03LongestSubstrLenWithKDistinctChars longestSubstrLenWithKDistinctChars
                = new W03LongestSubstrLenWithKDistinctChars();
        assertEquals(5, longestSubstrLenWithKDistinctChars.solution(new char[]{'A','A','A','H','H','I','B','C'}, 2));
        assertEquals(4, longestSubstrLenWithKDistinctChars.solution(new char[]{'A','A','A','H','I','I','B','C'}, 2));
    }
}