package com.myprograms.algorithms.geometric;

public class ClockAngleFinder {
    private static final double TOTAL_DEGREE_OF_A_CLOCK = 360;
    private static final double TOTAL_HOURS = 12;
    private static final double MINUTES_PER_HOUR = 60;
    private static final double DEGREES_PER_MINUTE = TOTAL_DEGREE_OF_A_CLOCK / MINUTES_PER_HOUR;
    private static final double DEGREES_PER_HOUR = TOTAL_DEGREE_OF_A_CLOCK / TOTAL_HOURS;

    public static double findAngle(int hour, int minute) {
        double minuteAngle = minute * DEGREES_PER_MINUTE;
        double hourAngle = hour * DEGREES_PER_HOUR;
        double additionalHourAngle = (minute / MINUTES_PER_HOUR) * DEGREES_PER_HOUR;
        hourAngle += additionalHourAngle;
        double difference = Math.abs(minuteAngle - hourAngle);
        if (difference > TOTAL_DEGREE_OF_A_CLOCK / 2)
            return TOTAL_DEGREE_OF_A_CLOCK - difference;

        return difference;
    }
}
