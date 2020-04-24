package com.cenkc.leetcode.study.warmup;

/**
 * Smallest subarray with given sum
 *
 * created by cenkc on 4/24/2020
 */
public class W02SmallestSubArrWithGivenSum {
    public static void main (String[] args) {
//        int[] A = new int[]{4, 2, 1, 7, 8, 1 ,2, 8, 1, 0};
        int[] A = new int[]{4, 2, 1, 7, 5, 1 ,2, 3, 1, 0};
        int K = 8;
        W02SmallestSubArrWithGivenSum smallestSubArrWithGivenSum = new W02SmallestSubArrWithGivenSum();
        System.out.println(smallestSubArrWithGivenSum.solution(A, K));
    }

    public int solution(int[] A, int K) {
        int minWindowSize = Integer.MAX_VALUE;
        int sumOfWindow = 0;
        int windowStart = 0;
        for (int i = 0; i < A.length; i++) {
            sumOfWindow += A[i];
            while (sumOfWindow >= K) {
                minWindowSize = Math.min(minWindowSize, i - windowStart + 1);
                sumOfWindow -= A[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }
}
