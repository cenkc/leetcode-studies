package com.cenkc.leetcode.study.s01;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 *
 * created by cenkc on 4/24/2020
 */
public class LongestSubstrWithoutRepeatingChars {

    public static void main(String[] args) {
//        String input = "abcabcbb";
//        String input = "bbbbb";
        String input = "pwwkew";
        LongestSubstrWithoutRepeatingChars study
                = new LongestSubstrWithoutRepeatingChars();
        System.out.println(study.lengthOfLongestSubstring(input));
    }

    public int lengthOfLongestSubstring(String s) {
        int lengthOfChars = 0;
        int windowStart = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            if (charMap.containsKey(s.charAt(windowEnd))) {
                windowStart = Math.max(charMap.get(s.charAt(windowEnd)), windowStart);
            }
            lengthOfChars = Math.max(lengthOfChars, windowEnd - windowStart + 1);
            charMap.put(s.charAt(windowEnd), windowEnd + 1);
        }
        return lengthOfChars;
    }
}
