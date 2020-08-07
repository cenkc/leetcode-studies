package com.cenkc.leetcode.study.s01;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Difficulty : Medium
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

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * <p><p>
     * <p><b>Example 1:</b>
     * <p>
     * <pre>{@code
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * }</pre>
     *
     * <p><b>Example 2:</b>
     * <p>
     * <pre>{@code
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * }</pre>
     *
     * <p><b>Example 3:</b>
     * <p>
     * <pre>{@code
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     * }</pre>
     *
     * @param s String to find Longest Substring Without Repeating Characters
     * @return length of the Longest Substring Without Repeating Characters
     */
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
