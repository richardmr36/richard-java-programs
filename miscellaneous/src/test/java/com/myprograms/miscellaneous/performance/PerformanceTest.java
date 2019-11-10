package com.myprograms.miscellaneous.performance;

import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Ignore
public class PerformanceTest {

    private static final int MBinBytes = 1048576;
    private static final int KBinBytes = 1024;

    @Test
    public void testStringBuilder() {
        System.out.println("Memory Start: "+memoryUsed());
        long startTime = System.nanoTime();
        StringBuilder d = new StringBuilder("Hello");
        for(int i=0;i<100000;i++) {
            d.append(i);
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time in millis: "
                + elapsedTime/1000000);

        System.out.println("Memory end: "+memoryUsed());
    }

    @Test
    public void testStringPlus() {
        System.out.println("Memory Start: "+memoryUsed());
        long startTime = System.nanoTime();
        String str = " ";
        for(int i=0;i<100000;i++) {
            str += i;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time in millis: "
                + elapsedTime/1000000);

        System.out.println("Memory end: "+memoryUsed());
    }

    private long memoryUsed() {
        return ((Runtime.getRuntime().totalMemory() / KBinBytes) - (Runtime
                .getRuntime().freeMemory() / KBinBytes));
    }

    //When there is no size declared for arraylist, default of size 10 is initialized.
    @Test
    public void testArrayList() throws Exception {
        List<String> stringList = new ArrayList<>();
        stringList.add("hell0");
        for(int i=0;i<30;i++) {
            stringList.add("hell"+i);
            System.out.println(getCapacity(stringList));
        }
    }

    int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
