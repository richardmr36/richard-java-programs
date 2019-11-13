package com.myprograms.algorithms.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class SinglyLinkedListPalindrome {
    private static Node left = null;

    public static boolean isPalindrome(Node head, int size) {
        if (head == null || size < 1)
            throw new IllegalArgumentException();

        if (head != null && size == 1)
            return true;

        int mid = size / 2;
        int[] arr = new int[mid];

        boolean isOddSized = size % 2 != 0;

        Node current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = current.data;
            current = current.next;
            if (index == mid) {
                if (isOddSized)
                    current = current.next;
                break;
            }
        }

        while (current != null) {
            if (current.data != arr[--index])
                return false;
            current = current.next;
        }

        return true;
    }

    public static boolean isPalindromeUsingRecursion(Node head) {
        left = head;
        return isPalindrome(head);
    }

    private static boolean isPalindrome(Node right) {
        if (right == null)
            return true;

        if (!isPalindrome(right.next))
            return false;

        boolean isEqual = left.data == right.data;
        left = left.next;
        return isEqual;
    }

    public static boolean isPalindromeUsingStack(Node head) {
        Deque<Integer> stack = new ArrayDeque<>();
        Node left = head;
        while (head != null) {
            stack.push(head.data);
            head = head.next;
        }

        while (!stack.isEmpty() && left.data == stack.pop())
            left = left.next;

        return stack.isEmpty();
    }
}
