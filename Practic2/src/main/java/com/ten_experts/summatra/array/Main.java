package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;

/**
 * Main application entry point
 */
public final class Main {

    private Main(){}
    /**
     * Main function for app
     * @param args - console arguments
     * @throws ArraySummaterException when array is not valid
     */
    public static void main(final String[] args) throws ArraySummaterException {
        PairSummater pairSummater = new PairSummater();
        System.out.println(pairSummater.sum(new int[]{55, 587, 4398, 453}));
    }
}
