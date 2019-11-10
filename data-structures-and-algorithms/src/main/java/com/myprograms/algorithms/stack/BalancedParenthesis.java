package com.myprograms.algorithms.stack;

import java.util.Stack;

public class BalancedParenthesis {
    private Stack<Character> parenthesis;

    public BalancedParenthesis() {
        this.parenthesis = new Stack<>();
    }

    public boolean isParenthesisBalanced(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                parenthesis.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (parenthesis.empty())
                    return false;
                char poppedChar = parenthesis.pop();
                if (!matchingParenthesis(ch, poppedChar)) {
                    return false;
                }
            }
        }
        return parenthesis.empty();
    }

    private boolean matchingParenthesis(char ch, char poppedChar) {
        if (ch == ')' && poppedChar == '(')
            return true;
        else if (ch == '}' && poppedChar == '{')
            return true;
        else return ch == ']' && poppedChar == '[';
    }
}
