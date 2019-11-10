package com.myprograms.miscellaneous.reflectiontest;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ReflectionJUnitTest {

    @Test
    public void findMajority() throws Exception {
        ReflectionJUnit reflectionJUnit = new ReflectionJUnit();
        int a[] = new int[]{2,2,2,2,5,5,2,3,3};

        Class[] paramArray = new Class[1];
        paramArray[0] = int[].class;
        Method method = ReflectionJUnit.class.getDeclaredMethod("findMajority", paramArray);
        method.setAccessible(true);
        method.invoke(reflectionJUnit, a);
    }

    @Test
    public void testPrivateMethods() {
        Class noparams[] = {};

        //String parameter
        Class[] paramString = new Class[1];
        paramString[0] = String.class;

        //int parameter
        Class[] paramInt = new Class[1];
        paramInt[0] = Integer.TYPE;

        try{
            //load the AppTest at runtime
            Class cls = Class.forName("com.myprograms.miscellaneous.reflectiontest.ReflectionJUnit");
            Object obj = cls.newInstance();

            //call the printIt method
            Method method = cls.getDeclaredMethod("printIt", noparams);
            method.setAccessible(true);
            method.invoke(obj, null);

            //call the printItString method, pass a String param
            method = cls.getDeclaredMethod("printItString", paramString);
            method.setAccessible(true);
            method.invoke(obj, new String("mkyong"));

            //call the printItInt method, pass a int param
            method = cls.getDeclaredMethod("printItInt", paramInt);
            method.setAccessible(true);
            method.invoke(obj, 123);

            //call the setCounter method, pass a int param
            method = cls.getDeclaredMethod("setCounter", paramInt);
            method.setAccessible(true);
            method.invoke(obj, 999);

            //call the printCounter method
            method = cls.getDeclaredMethod("printCounter", noparams);
            method.setAccessible(true);
            method.invoke(obj, null);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}