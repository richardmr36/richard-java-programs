package com.myprograms.algorithms.stack;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class BalancedParenthesisTest {

    @Test
    public void isParenthesisBalanced() {
        final String str = "({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[";
        assertFalse("Parenthesis is not balanced", new BalancedParenthesis().isParenthesisBalanced(str));
    }
}