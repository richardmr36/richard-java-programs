package com.myprograms.miscellaneous.interviewquestions;

public class TrickyPrograms {

    public static double compareDoubleMinValueWithZero() {
        return Math.min(Double.MIN_VALUE, 0.0d);
    }

    public static void systemExitOnTryCatch() {
        try {
            System.exit(0);
        }
        catch (Exception e) {

        }
        finally {
            System.out.println("Finally block will not be executed");
        }
    }

    public static double divideByZeroDoubleValue() {

        double x = 0.0d;

        try {
            x = 1.0 / 0.0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }

        return x;
    }
}
