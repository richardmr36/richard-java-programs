package com.myprograms.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharFinder {
    public static char find(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.get(c) == 1)
                return c;
        }

        return 0;
    }
}
