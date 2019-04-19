package it.sevenbits;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Test for the third task, practice 4
 */
public class ThirdTaskTest {
    private ThirdTask thirdTask = new ThirdTask();
    private ArrayList<Integer> arr11 = new ArrayList<Integer>();
    private ArrayList<Integer> arr12 = new ArrayList<Integer>();
    private ArrayList<Integer> arr13 = new ArrayList<Integer>();
    private ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
    private ArrayList<Integer> arr2 = new ArrayList<>();

    /**
     * Simple positive test for getDifference function
     */
    @Test
    public void simpleThirdTaskTest() {
        arr11.add(1);
        arr11.add(2);
        arr11.add(3);
        arr12.add(2);
        arr12.add(4);
        arr12.add(8);
        arr13.add(8);
        arr13.add(6);
        arr13.add(7);
        arr1.add(arr11);
        arr1.add(arr12);
        arr1.add(arr13);
        arr2.add(1);
        arr2.add(3);
        arr2.add(5);

        ArrayList<ArrayList<Integer>> expectedArr = new ArrayList<>();
        expectedArr.add(arr12);
        expectedArr.add(arr13);
        Assert.assertArrayEquals(expectedArr.toArray(), thirdTask.getDifference(arr1, arr2).toArray());
    }

    /**
     * Test for getDifference function using array consisting of one element
     */
    @Test
    public void oneCharacterElementsTest() {
        arr11.add(1);
        arr12.add(1);
        arr13.add(3);
        arr1.add(arr11);
        arr1.add(arr12);
        arr1.add(arr13);
        arr2.add(1);

        ArrayList<ArrayList<Integer>> expectedArr = new ArrayList<>();
        expectedArr.add(arr13);
        Assert.assertArrayEquals(expectedArr.toArray(), thirdTask.getDifference(arr1, arr2).toArray());
    }
}

