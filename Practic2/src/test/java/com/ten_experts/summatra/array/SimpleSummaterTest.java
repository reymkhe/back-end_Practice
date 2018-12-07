package com.ten_experts.summatra.array;

import com.ten_experts.summatra.array.exceptions.ArraySummaterException;
import org.junit.Assert;
import org.junit.Test;

public class SimpleSummaterTest {

    SimpleSummater simpleSummater = new SimpleSummater();

    @Test
    public void simplePositiveSumTest() throws ArraySummaterException {
        Assert.assertEquals(10, simpleSummater.sum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void allNullsSumTest() throws ArraySummaterException {
        Assert.assertEquals(0, simpleSummater.sum(new int[]{0, 0, 0, 0, 0}));
    }

    @Test(expected = ArraySummaterException.class)
    public void nullArraySumTest() throws ArraySummaterException {
        simpleSummater.sum(new int[]{});
    }

    @Test
    public void negativeNumberSumTest() throws ArraySummaterException {
        Assert.assertEquals(-66, simpleSummater.sum(new int[]{-11, -22, -33}));
    }

    @Test
    public void bigEqualsSumTest() throws ArraySummaterException {
        Assert.assertEquals(245965665, simpleSummater.sum(new int[]{142846753, 71643571, 31475341}));
    }
}
