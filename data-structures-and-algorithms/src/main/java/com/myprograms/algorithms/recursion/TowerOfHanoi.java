package com.myprograms.algorithms.recursion;

public class TowerOfHanoi {
    public void solve(int n, char rodFrom, char auxiliaryRod, char rodTo) {
        if (n == 1) {
            System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
            return;
        }

        solve(n - 1, rodFrom, rodTo, auxiliaryRod);
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
        solve(n - 1, auxiliaryRod, rodFrom, rodTo);
    }
}
