package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;

public class SimpleSummater implements IArraySummater {

    public int sum(int[] arr) throws ArraySummaterException {
        if (arr.length == 0) {
            throw new ArraySummaterException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
}

