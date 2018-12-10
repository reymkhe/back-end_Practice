package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;

/**
 * PairSummater is implementation of IArraySummater with sum of pairs
 * */
public class PairSummater implements IArraySummater {
    /**
     * Sum function sums up pairs of integers from an array and return maximum sum
     * @param arr - array of integers
     * @return maximum sum of all pairs of integers
     * @throws ArraySummaterException when array is not exist or the amount of integers is not multiples of 2
     */
    public int sum(final int[] arr) throws ArraySummaterException {
        if (arr.length % 2 != 0 || arr.length == 0) {
            throw new ArraySummaterException();
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i = i + 2) {
            int sum = arr[i] + arr[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
