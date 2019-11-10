package com.myprograms.algorithms.utility;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static com.myprograms.algorithms.utility.DateTimeFormat.DDDD_MMMM_D_YYYY;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeUtilityTest {

    Calendar calendar;

    @Before
    public void setUp() throws Exception {
        calendar = Calendar.getInstance();
    }

    @Test
    public void adjustDateToFrequency() {
        System.out.println(DateTimeUtility.adjustDateToFrequency(calendar.getTime(), "234",1));
    }

    @Test
    public void getFormattedDate() {
        System.out.println(DateTimeUtility.getFormattedDateTime(calendar.getTime(), DateTimeFormat.H_MM_SS));
        System.out.println(DateTimeUtility.getFormattedDateTime(calendar.getTime(), DateTimeFormat.D_MMMM_YYYY));
    }

    @Test
    public void getDateFromFormattedDateInDDMMMYY() {
        System.out.println(DateTimeUtility.getDateFromFormattedDate("29JUL18", DateTimeFormat.DDMMMYY));
    }

    @Test
    public void getFormattedDateFromDDMMMYY() {
        System.out.println(DateTimeUtility.getFormattedDateTime("29JUL18", DateTimeFormat.DDMMMYY, DateTimeFormat.D_MMMM_YYYY));
        System.out.println(DateTimeUtility.getFormattedDateTime("12:30", DateTimeFormat.H_MM, DateTimeFormat.H_MM_SS));
    }

    @Test
    public void areDateRangesOverlapping() {
        Calendar calendar = Calendar.getInstance();
        Date startDate1 = DateTimeUtility.adjustDate(calendar.getTime(), 0);
        Date endDate1 = DateTimeUtility.adjustDate(calendar.getTime(), 4);
        Date startDate2 = DateTimeUtility.adjustDate(calendar.getTime(), 4);
        Date endDate2 = DateTimeUtility.adjustDate(calendar.getTime(), 6);
        System.out.println(DateTimeUtility.areDateRangesOverlapping(startDate1, endDate1, startDate2, endDate2));
    }

    @Test
    public void test() {
        String[] str = "123.45".split(".");
    }
}