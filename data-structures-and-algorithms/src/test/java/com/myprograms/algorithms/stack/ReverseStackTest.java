package com.myprograms.algorithms.stack;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStackTest {

    @Test
    public void reverseStackUsingRecursion() {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEach(e -> stack.push(e));

        Stack<Integer> expected = new Stack<>();
        int[] arrExpected = {4, 3, 2, 1};
        Arrays.stream(arrExpected).forEach(e -> expected.push(e));

        Stack<Integer> result = ReverseStack.reverseStackUsingRecursion(stack);
        while (!result.isEmpty())
            Assert.assertEquals(expected.pop(), result.pop());
    }

    @Test
    public void reverseStackWithoutUsingExtraSpaceOrCallStack() {
        LinkedListStack stack = new LinkedListStack();
        int[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEach(e -> stack.push(e));

        LinkedListStack expected = new LinkedListStack();
        int[] arrExpected = {4, 3, 2, 1};
        Arrays.stream(arrExpected).forEach(e -> expected.push(e));

        LinkedListStack result = ReverseStack.reverseStackWithoutUsingExtraSpaceOrCallStack(stack);
        while (!result.isEmpty())
            Assert.assertEquals(expected.pop(), result.pop());
    }
}