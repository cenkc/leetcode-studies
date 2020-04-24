package com.cenkc.leetcode.study.warmup;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest substring length with K distinct characters
 *
 * created by cenkc on 4/24/2020
 */
public class W03LongestSubstrLenWithKDistinctChars {

    public static void main(String[] args) {
        char[] A = new char[]{'A','A','A','H','H','I','B','C'};
        int K = 2;
        W03LongestSubstrLenWithKDistinctChars longestSubstrLenWithKDistinctChars =
                new W03LongestSubstrLenWithKDistinctChars();

        System.out.println(longestSubstrLenWithKDistinctChars.solution(A, K));
    }

    public int solution(char[] A, int K) {
        int maxWindowLength = Integer.MIN_VALUE;
        int windowStart = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < A.length; windowEnd++) {
            char rightChar = A[windowEnd];
            charMap.put(rightChar, charMap.getOrDefault(rightChar, 0) + 1);
            while (charMap.size() > K) {
                char leftChar = A[windowStart];
                charMap.put(leftChar, charMap.get(leftChar) - 1);
                if (charMap.get(leftChar) == 0) {
                    charMap.remove(leftChar);
                }
                windowStart++;
            }
            maxWindowLength = Math.max(maxWindowLength, windowEnd - windowStart + 1);
        }
        return maxWindowLength;
    }
}
