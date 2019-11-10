package com.myprograms.algorithms.general;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DayFinderTest {

    @Test
    public void findDayForTheGivenDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1995,Calendar.MARCH,27);
        new DayFinder().findDayForTheGivenDate(calendar.getTime());
    }
}