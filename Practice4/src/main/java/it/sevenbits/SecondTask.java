package it.sevenbits;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for Practice 4, second task
 */
public class SecondTask {
    /**
     * GetMapFromStrings function creates map from strings.
     * The first letter of a string is a key, the last letter of a string is a value.
     * @param strings - list of strings
     * @return map with Char keys and Char values
     */
    public Map<Character, Character> getMapFromStrings(final String[] strings) {
        Map<Character, Character> map = new HashMap<>();
        for (String str: strings) {
            map.put(str.charAt(0), str.charAt(str.length() - 1));
        }
        return map;
    }
}

