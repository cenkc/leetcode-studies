package com.cenkc.leetcode.study.warmup;

/**
 * Find the max sum subarray of a fixed size K
 *
 * created by cenkc on 4/24/2020
 */
public class W01MaxSumSubArrOfAFixedSizeK {
    public static void main (String[] args) {
        int[] A = new int[]{4, 2, 1, 7, 8, 1 ,2, 8, 1, 0};
        int K = 3;
        W01MaxSumSubArrOfAFixedSizeK maxSumSubArrOfAFixedSizeK = new W01MaxSumSubArrOfAFixedSizeK();
        System.out.println(maxSumSubArrOfAFixedSizeK.solution(A, K));
    }

    public int solution(int[] A, int K) {
        int max_val = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (i > K - 1) {
                sum -= A[i - K];
            }
            max_val = Math.max(sum, max_val);
        }
        return max_val;
    }
}
