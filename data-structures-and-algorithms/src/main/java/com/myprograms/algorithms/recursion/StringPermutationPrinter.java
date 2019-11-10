package com.myprograms.algorithms.recursion;

public class StringPermutationPrinter {
    public void permute(String str) {
        permute(str, 0, str.length()-1);
    }

    private void permute(String str, int left, int right) {
        if(left == right) {
            System.out.println(str);
            return;
        }

        for(int i=left; i<=right;i++) {
            if(left == i || (str.charAt(left) != str.charAt(i))) {
                str = swap(str,left,i);
                permute(str, left+1,right);
                str = swap(str,left,i);
            }
        }
    }

    private String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
