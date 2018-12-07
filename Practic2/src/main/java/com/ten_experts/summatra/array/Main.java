package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;

public final class Main {

    private Main(){}
    public static void main(String[] args) throws ArraySummaterException {
        PairSummater pairSummater = new PairSummater();
        System.out.println(pairSummater.sum(new int[]{55, 587, 4398, 453}));
    }
}
