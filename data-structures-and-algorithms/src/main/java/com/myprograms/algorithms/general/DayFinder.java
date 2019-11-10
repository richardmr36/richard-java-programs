package com.myprograms.algorithms.general;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DayFinder {

    public static final String SUNDAY = "SUNDAY";
    public static final String MONDAY = "MONDAY";
    public static final String TUESDAY = "TUESDAY";
    public static final String WEDNESDAY = "WEDNESDAY";
    public static final String THURSDAY = "THURSDAY";
    public static final String FRIDAY = "FRIDAY";
    public static final String SATURDAY = "SATURDAY";
    public static final int[] DOOMSDAY_BY_MONTH = {3, 28, 14, 4, 9, 6, 11, 8, 5, 10, 7, 12};
    public static final int[] CENTURY = {1500, 1600, 1700, 1800};
    public static final String[] DOOMSDAY_BY_CENTURY = {WEDNESDAY, TUESDAY, SUNDAY, FRIDAY};
    public static final String[] WEEK_DAYS = {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    public static Map<String, Integer> WEEK_DAYS_MAP = new HashMap<>();

    public DayFinder() {
        this.buildWeekDaysMap();
    }

    private void buildWeekDaysMap() {
        WEEK_DAYS_MAP.put(SUNDAY, 0);
        WEEK_DAYS_MAP.put(MONDAY, 1);
        WEEK_DAYS_MAP.put(TUESDAY, 2);
        WEEK_DAYS_MAP.put(WEDNESDAY, 3);
        WEEK_DAYS_MAP.put(THURSDAY, 4);
        WEEK_DAYS_MAP.put(FRIDAY, 5);
        WEEK_DAYS_MAP.put(SATURDAY, 6);
    }

    public void findDayForTheGivenDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        int doomsDayForGivenMonth = 0;
        if (year % 4 == 0 && month < 2)
            doomsDayForGivenMonth = DOOMSDAY_BY_MONTH[month] + 1;
        else
            doomsDayForGivenMonth = DOOMSDAY_BY_MONTH[month];
        int givenCentury = (int) (Math.floor(year / 100.0) * 100);
        int givenCenturyDoomsDay = WEEK_DAYS_MAP.get(DOOMSDAY_BY_CENTURY[getDoomsDayIndexForGivenCentury(givenCentury)]);
        int b = (year % 100) / 12;
        int c = (year % 100) % 12;
        int d = c / 4;
        int e = givenCenturyDoomsDay + b + c + d;
        while (e > 7)
            e -= 7;

        String doomsDayForTheGivenYear = WEEK_DAYS[e];
        int noOfDaysInDifference = day - doomsDayForGivenMonth;
        System.out.println(WEEK_DAYS[Math.abs((WEEK_DAYS_MAP.get(doomsDayForTheGivenYear) + noOfDaysInDifference) % 7)]);
    }

    private int getDoomsDayIndexForGivenCentury(int givenCentury) {
        return (int)((Math.floor(givenCentury / 100) + 1) % 4) % 4;
    }

}
