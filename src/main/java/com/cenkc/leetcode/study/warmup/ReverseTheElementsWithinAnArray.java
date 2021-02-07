package com.cenkc.leetcode.study.warmup;

import java.util.Arrays;

/**
 * created by Cenk Canarslan on 2021-01-24
 */
public class ReverseTheElementsWithinAnArray {
    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,3,4,5,6,7};
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("arr = " + Arrays.toString(arr));
        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = tmp;
        }
        System.out.println("newArr = " + Arrays.toString(arr));
    }

}
