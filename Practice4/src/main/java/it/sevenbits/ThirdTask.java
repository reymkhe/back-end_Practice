package it.sevenbits;

import java.util.Set;

/**
 * Class for Practice 4, third task
 */
public class ThirdTask {
    /**
     * GetDifference function creates a new set from the first set excluding the second set.
     * @param set1 - first set of Integer
     * @param set2 - second set of Integer
     * @return difference between set1 and set2 in set1
     */
    public Set<Integer> getDifference(final Set<Integer>set1, final Set<Integer>set2) {
        set1.removeAll(set2);
        return set1;
    }
}
