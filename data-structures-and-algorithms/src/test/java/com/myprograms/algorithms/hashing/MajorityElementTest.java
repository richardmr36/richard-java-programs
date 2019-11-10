package com.myprograms.algorithms.hashing;

import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void findMajority() throws Exception {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.findMajority(a);
    }

    @Test
    public void findMajorityForSortedArrays() throws Exception {
        int a[] = new int[]{1, 2, 3, 3, 3, 3, 10};
        MajorityElement majorityElement = new MajorityElement();
        int n = a.length;
        int x = 3;
        if(majorityElement.isMajority(a,n,x))
            System.out.println(x + " appears more than "+ n/2 + " times in arr[]");
        else
            System.out.println(x + " does not appear more than "+ n/2 + " times in arr[]");
    }
}