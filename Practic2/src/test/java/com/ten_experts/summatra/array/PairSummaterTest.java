package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;
import org.junit.Assert;
import org.junit.Test;

public class PairSummaterTest {

    PairSummater pairSummater = new PairSummater();

    @Test
    public void simplePositivePairSumTest() throws ArraySummaterException {
        Assert.assertEquals(6, pairSummater.sum(new int[]{2, 4, 1, 3}));
    }

    @Test(expected = ArraySummaterException.class)
    public void negativePairSumTest() throws ArraySummaterException {
        pairSummater.sum(new int[]{2, 4, 1});
    }

    @Test(expected = ArraySummaterException.class)
    public void nullArrayPairSumTest() throws ArraySummaterException {
        pairSummater.sum(new int[]{});
    }

    @Test
    public void equalNumbersPairSumTest() throws ArraySummaterException {
        Assert.assertEquals(200, pairSummater.sum(new int[]{100, 100, 100, 100}));
    }

    @Test
    public void negativeNumbersPairSumTest() throws ArraySummaterException {
        Assert.assertEquals(-104, pairSummater.sum(new int[]{-5, -100, -100, -4}));
    }

}
