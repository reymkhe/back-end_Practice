package it.sevenbits;

import java.util.*;

/**
 * Class for Practice 4, first task
 */
public class FirstTask {
    /**
     * Function for first task. Creates map with Integer keys and String values. Adds keys and values at different sets.
     */
    public static void firstTask() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
    }
}
