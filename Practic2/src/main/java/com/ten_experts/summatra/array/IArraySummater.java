package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;

/**
 * Interface with summater
 */
public interface IArraySummater {
    /**
     * Sum function sums up integers from an array and return integer with some value
     * @param arr - array of integers
     * @return integer with some value
     * @throws ArraySummaterException when array is not exist or not valid
     */
    int sum(int[] arr) throws ArraySummaterException;
}
