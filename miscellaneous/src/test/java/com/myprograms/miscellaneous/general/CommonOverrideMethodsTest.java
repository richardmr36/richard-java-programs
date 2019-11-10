package com.myprograms.miscellaneous.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonOverrideMethodsTest {

    @Test
    public void checkEquals() {
        CommonOverrideMethods e1 = new CommonOverrideMethods(1,"Richard");
        CommonOverrideMethods e2 = new CommonOverrideMethods(1,"Richard");
        CommonOverrideMethods e3 = new CommonOverrideMethods(1,"Richard");
        assertTrue("Objects are not equal", e1.equals(e2));
        assertTrue("Objects are not equal", e2.equals(e1));
        assertTrue("Objects are not equal", e2.equals(e3));
        assertTrue("Objects are not equal", e1.equals(e3));
        Map<CommonOverrideMethods, CommonOverrideMethods> commonOverrideMethodsList = new HashMap<>();
        commonOverrideMethodsList.put(e1,e1);
        assertTrue("Objects are not equal", commonOverrideMethodsList.containsKey(e2));

    }

    @Test
    public void cloneTest() {
        CommonOverrideMethods e1 = new CommonOverrideMethods(1,"Richard");
        CommonOverrideMethods e2 = e1.clone();
        System.out.println(e2);
    }

}