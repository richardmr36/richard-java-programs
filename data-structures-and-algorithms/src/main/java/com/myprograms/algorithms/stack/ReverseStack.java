package com.myprograms.algorithms.stack;

import java.util.Stack;

public class ReverseStack {

    public static Stack<Integer> reverseStackUsingRecursion(Stack<Integer> stack) {
        reverseStack(stack);
        return stack;
    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.empty())
            return;

        int x = stack.pop();
        reverseStack(stack);
        rebuildFinalStackByInsertingAtBottom(stack, x);
    }

    private static void rebuildFinalStackByInsertingAtBottom(Stack<Integer> stack, int x) {
        if (stack.empty()) {
            stack.push(x);
            return;
        }

        int y = stack.pop();
        rebuildFinalStackByInsertingAtBottom(stack, x);
        stack.push(y);
    }

    public static LinkedListStack reverseStackWithoutUsingExtraSpaceOrCallStack(LinkedListStack stack) {
        stack.reverse();
        return stack;
    }
}
