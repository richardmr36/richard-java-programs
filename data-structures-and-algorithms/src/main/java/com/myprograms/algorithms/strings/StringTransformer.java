package com.myprograms.algorithms.strings;

import com.myprograms.algorithms.dynamicprogramming.LongestCommonSubsequence;

public class StringTransformer {
    public static int minNoOfOpsToTransformByRemovingAnyCharAndInsertAtFront(String source, String target) {
        /*  https://www.geeksforgeeks.org/transform-one-string-to-another-using-minimum-number-of-given-operation/
            source = EACBD, target = EABCD
        *    Pick B and insert at front, EACBD => BEACD
             Pick A and insert at front, BEACD => ABECD
             Pick E and insert at front, ABECD => EABCD
        * */

        if(source.length() != target.length())
            return -1;

        int i, j, res = 0;
        int count [] = new int [256];

        for(i = 0; i < source.length(); i++) {
            count[source.charAt(i)]++;
            count[target.charAt(i)]--;
        }

        for(i = 0; i < 256; i++)
            if(count[i] != 0)
                return -1;

        i = source.length() - 1;
        j = target.length() - 1;

        while(i >= 0) {
            // If there is a mismatch, then keep incrementing result res until target[j] is not found in source[0..i]
            if(source.charAt(i) != target.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }

    public static int minNoOfOpsToTransformBinaryStringBySwappingOrReplacing(String source, String target) {
        /*  https://www.geeksforgeeks.org/minimum-number-of-given-operations-required-to-convert-a-string-to-another-string/
        *   Swap any two characters of the string.
            Replace a ‘0’ with a ‘1’ or vice versa.
        */

        int ct0 = 0, ct1 = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(i))
                continue;

            if (source.charAt(i) == '0')
                ct0++;
            else
                ct1++;
        }

        return Math.max(ct0, ct1);
    }

    public static void minNoOfOpsToTransformByDeletingOrInserting(String source, String target) {
        //https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/

        int lengthOfLongestCommonSubsequence = LongestCommonSubsequence.findLongestCommonSubsequenceUsingDp(source, target);
        System.out.println("Minimum no of Deletions: " + (source.length() - lengthOfLongestCommonSubsequence));
        System.out.println("Minimum no of Insertions: " + (target.length() - lengthOfLongestCommonSubsequence));
    }
}
