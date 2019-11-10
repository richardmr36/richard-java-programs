package com.myprograms.algorithms.bitmanipulation;

public class UniqueCharStringChecker {
    public static boolean isUniqueWithLowerCase(String str) {
        int checker = 0;

        for (int i = 0; i < str.length(); ++i) {
            int val = (str.charAt(i) - 'a');

            // If bit corresponding to current character is already set
            if ((checker & (1 << val)) > 0)
                return false;

            // set bit in checker
            checker |= (1 << val);
        }

        return true;
    }

    public static boolean isUnique(String str) {
        boolean[] checker = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(checker[val])
                return false;

            checker[val] = true;
        }

        return true;
    }
}
