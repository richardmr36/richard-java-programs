package com.myprograms.algorithms.searching;

public class SaddleBackSearch {
    public static int[] findRecursively(int[][] arr, int row, int col, int searchElement) {
        int[] position = {-1, -1};

        if(row < 0 || col >= arr[row].length)
            return position;

        if(arr[row][col] == searchElement) {
            position[0] = row;
            position[1] = col;
            return position;
        }
        else if(arr[row][col] > searchElement)
            return findRecursively(arr, row - 1, col, searchElement);

        return findRecursively(arr, row, col + 1, searchElement);
    }

    public static int[] findIteratively(int[][] arr, int searchElement) {
        int row = arr[0].length;
        int col = 0;
        int[] position = {-1, -1};

        while (row > 0 && col < arr[row].length) {
            if(arr[row][col] == searchElement) {
                position[0] = row;
                position[1] = col;
                break;
            }
            else if(arr[row][col] > searchElement)
                row--;
            else
                col++;
        }

        return position;
    }
}