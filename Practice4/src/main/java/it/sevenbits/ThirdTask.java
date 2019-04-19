package it.sevenbits;

import java.util.ArrayList;


/**
 * Class for Practice 4, third task
 */
public class ThirdTask {
    /**
     * GetDifference function creates new list of collections from the first
     * excluding elements which contains elements from the second set.
     *
     * @param arr1 - List of collection of Integer
     * @param arr2 - Collection of Integer
     * @return arr1 with elements not containing elements from arr2
     */
    public ArrayList<ArrayList<Integer>> getDifference(final ArrayList<ArrayList<Integer>> arr1, final ArrayList<Integer> arr2) {
        ArrayList<ArrayList<Integer>> endArr = new ArrayList<>();
        int countOfCoincidence;
        for (int i = 0; i < arr1.size(); i++) {
            countOfCoincidence = 0;
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).contains(arr2.get(j))) {
                    countOfCoincidence++;
                }
            }
            if (countOfCoincidence == 0) {
                endArr.add(arr1.get(i));
            }
        }
        return endArr;
    }
}


