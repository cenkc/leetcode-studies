package com.cenkc.leetcode.study.all;

import com.cenkc.leetcode.study.all.LongestSubstrWithoutRepeatingChars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * created by cenkc on 4/25/2020
 */
class LongestSubstrWithoutRepeatingCharsTest {

    @Test
    public void longestSubstrWithoutRepeatingChars_shouldPass() {
        LongestSubstrWithoutRepeatingChars longestSubstrWithoutRepeatingChars
                = new LongestSubstrWithoutRepeatingChars();
        assertEquals(3, longestSubstrWithoutRepeatingChars.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, longestSubstrWithoutRepeatingChars.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, longestSubstrWithoutRepeatingChars.lengthOfLongestSubstring("pwwkew"));
    }
}