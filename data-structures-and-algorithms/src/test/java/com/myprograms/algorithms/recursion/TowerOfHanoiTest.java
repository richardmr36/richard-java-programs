package com.myprograms.algorithms.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TowerOfHanoiTest {

    @Test
    public void solve() {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.solve(3,'A','B','C');
    }
}