package com.myprograms.algorithms.utility;

public final class StringUtility {
    public static boolean isEmpty(final String str) {
        return str != null && Constants.EMPTY_STRING.equals(str.trim());
    }

    public static String[] split(final String input, final String delimiter) {
        return ArrayUtility.removeEmptyStringItems(input.split(delimiter));
    }
}
