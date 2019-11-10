package com.myprograms.algorithms.utility;

public final class Printer {
    public static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + Constants.SINGLE_SPACE);
        System.out.println();
    }

    public static void printArray(int[] arr, String header) {
        System.out.print(header + ": ");
        for (int a : arr)
            System.out.print(a + Constants.SINGLE_SPACE);
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String a : arr)
            System.out.print(a + Constants.SINGLE_SPACE);
        System.out.println();
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(Constants.SINGLE_SPACE);
                System.out.print(arr[i][j]);
                System.out.print(Constants.SINGLE_SPACE);
            }
            System.out.println();
        }
    }

    public static void print2DArrayWithSingleAndDoubleDigitsMixed(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(Constants.SINGLE_SPACE);
                System.out.print(arr[i][j] < 10 ? Constants.SINGLE_SPACE + arr[i][j] : arr[i][j]);
                System.out.print(Constants.SINGLE_SPACE);
            }
            System.out.println();
        }
    }

}
