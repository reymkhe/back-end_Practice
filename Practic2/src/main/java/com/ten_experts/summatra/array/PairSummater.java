package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;

public class PairSummater implements IArraySummater {

    public int sum(int[] arr) throws ArraySummaterException {
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
