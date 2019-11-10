package com.myprograms.algorithms.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class DateTimeUtility {
    private static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");
    private static final long MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;
    private static final long MILLISECONDS_PER_MINUTE = 1000 * 60;

    //private DateTimeUtility() {}

    public static Calendar getCalendar(final TimeZone timeZone, final Date date) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        return calendar;
    }

    public static Calendar getCalendar(final Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getClonedDate(date));
        return calendar;
    }

    public static Date getClonedDate(final Date date) {
        return new Date(date.getTime()); //clone method is not used as the Date class is not final
    }

    public static Date adjustDate(final Date date, final int adjustValue) {
        final Calendar calendar = getCalendar(date);
        calendar.add(Calendar.DATE, adjustValue);
        return calendar.getTime();
    }

    public static int getDayOfTheWeek(final Date date) {
        Calendar calendar = getCalendar(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static Date adjustDateToFrequency(final Date date, final String frequency, final int direction) {
        Date adjustedDate = getClonedDate(date);
        for (int i = 0; i < Calendar.DAY_OF_WEEK; i++) {
            int dayOfWeek = getDayOfTheWeek(adjustedDate);
            if (frequency.indexOf(String.valueOf(dayOfWeek)) != -1)
                break;
            adjustedDate = adjustDate(adjustedDate, direction);
        }

        return adjustedDate;
    }

    public static int getNoOfDaysInBetweenDates(Date startDate, Date endDate) {
        if (startDate.compareTo(endDate) == 0)
            return 0;

        return getDaysFromMilliSeconds(endDate.getTime() - startDate.getTime());
    }

    public static int getDaysFromMilliSeconds(Long milliseconds) {
        return (int) (milliseconds / MILLISECONDS_PER_DAY);
    }

    public static String getFormattedDateTime(final Date dateTime, final String format) {
        if (dateTime == null)
            return null;

        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.US);
        return simpleDateFormat.format(dateTime).toUpperCase();
    }

    public static Date getDateFromFormattedDate(final String date, final String format) {
        if (StringUtility.isEmpty(date))
            return null;

        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIMEZONE);
        simpleDateFormat.setLenient(false);
        return parseDate(simpleDateFormat, date);
    }

    public static String getFormattedDateTime(final String dateTime, final String inputFormat, final String outputFormat) {
        if (StringUtility.isEmpty(dateTime))
            return null;

        final SimpleDateFormat simpleDateInputFormat = new SimpleDateFormat(inputFormat, Locale.US);
        final SimpleDateFormat simpleDateOutputFormat = new SimpleDateFormat(outputFormat, Locale.US);
        Date parsedDate = parseDate(simpleDateInputFormat, dateTime);

        return parsedDate == null ? null : simpleDateOutputFormat.format(parsedDate);
    }

    private static Date parseDate(SimpleDateFormat simpleDateFormat, String date) {
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Parse exception for Date value: " + date.toString());
        }

        return null;
    }

    public static Date findNextDateOfGivenDayOfWeek(final Date date, final int dayOfWeek) {
        final int currentDayOfWeek = getDayOfTheWeek(date);
        int noOfDaysToBeAdjusted = dayOfWeek - currentDayOfWeek;
        if (noOfDaysToBeAdjusted < 0)
            noOfDaysToBeAdjusted += Calendar.DAY_OF_WEEK;

        return DateTimeUtility.adjustDate(date, noOfDaysToBeAdjusted);
    }

    public static Date findPreviousDateOfGivenDayOfWeek(final Date date, final int dayOfWeek) {
        final int currentDayOfWeek = getDayOfTheWeek(date);
        int noOfDaysToBeAdjusted = dayOfWeek - currentDayOfWeek;
        if (noOfDaysToBeAdjusted > 0)
            noOfDaysToBeAdjusted -= Calendar.DAY_OF_WEEK;

        return DateTimeUtility.adjustDate(date, noOfDaysToBeAdjusted);
    }

    public static int getYear(Calendar calendar) {
        return calendar.get(Calendar.YEAR);
    }

    public static boolean areDateRangesOverlapping(Date startDate1, Date endDate1, Date startDate2, Date endDate2) {
        startDate1 = resetTime(getClonedDate(startDate1));
        endDate1 = resetTime(getClonedDate(endDate1));
        startDate2 = resetTime(getClonedDate(startDate2));
        endDate2 = resetTime(getClonedDate(endDate2));

        if (endDate1.compareTo(startDate2) == 0)
            return true;
        return startDate1.before(endDate2) && endDate1.after(startDate2);
    }

    public static Date resetTime(final Date date) {
        final Calendar calendar = getCalendar(getClonedDate(date));
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.AM_PM, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        return calendar.getTime();
    }

    public static boolean areDatesMatching(Date date1, Date date2) {
        date1 = resetTime(getClonedDate(date1));
        date2 = resetTime(getClonedDate(date2));
        return date1.compareTo(date2) == 0;
    }

    public static long getDateDifferenceInMinutes(Date startDate, Date endDate) {
        return (endDate.getTime() - startDate.getTime()) / MILLISECONDS_PER_MINUTE;
    }
}
