package com.myprograms.algorithms.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListPalindromeTest {

    @Test
    public void testForOddSizePalindrome() {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        Node head = buildLinkedList(arr);
        Assert.assertTrue(SinglyLinkedListPalindrome.isPalindrome(head, arr.length));
        Assert.assertTrue(SinglyLinkedListPalindrome.isPalindromeUsingRecursion(head));
        Assert.assertTrue(SinglyLinkedListPalindrome.isPalindromeUsingStack(head));
    }

    @Test
    public void testForEvenSizePalindrome() {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};
        Node head = buildLinkedList(arr);
        Assert.assertTrue(SinglyLinkedListPalindrome.isPalindrome(head, arr.length));
        Assert.assertTrue(SinglyLinkedListPalindrome.isPalindromeUsingRecursion(head));
        Assert.assertTrue(SinglyLinkedListPalindrome.isPalindromeUsingStack(head));
    }

    @Test
    public void testForNotPalindrome() {
        int[] arr = {1, 2, 4, 3, 2, 1};
        Node head = buildLinkedList(arr);
        Assert.assertFalse(SinglyLinkedListPalindrome.isPalindrome(head, arr.length));
        Assert.assertFalse(SinglyLinkedListPalindrome.isPalindromeUsingRecursion(head));
        Assert.assertFalse(SinglyLinkedListPalindrome.isPalindromeUsingStack(head));
    }

    private Node buildLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            temp.next = node;
            temp = temp.next;
        }

        return head;
    }
}