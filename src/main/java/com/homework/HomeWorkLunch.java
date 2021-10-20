package com.homework;

import java.util.Calendar;

public class HomeWorkLunch {

    private static final int MIN_LIMIT = 10;
    private static final int MAX_LIMIT = 20;
    private static final int LEAP_YEAR_DIVIDER = 4;
    private static final int EXCLUDE_YEAR_DIVIDER = 100;
    private static final int CENTURIAL_YEAR = 400;

    public static void main(String[] args) {
        boolean isInRange = isWithinRange(3, 3);
        System.out.println("Sum of 3 and 3 is in range: " + isInRange);

        printIntegerStatus(0);
        printIntegerStatus(-1);
        printIntegerStatus(1);

        repeatPrintString("Text", 3);
    }

    public static boolean isWithinRange(int number1, int number2) {
        int sum = number1 + number2;

        return MIN_LIMIT <= sum && sum <= MAX_LIMIT;
    }

    public static boolean isNumberPositive(int number) {
        return number >= 0;
    }

    public static boolean isLeapYearUtil(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);

        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public static boolean isLeapYearCustom(int year) {
        return year % LEAP_YEAR_DIVIDER == 0 && ((year % EXCLUDE_YEAR_DIVIDER != 0) || (year % CENTURIAL_YEAR == 0));
    }

    private static void printIntegerStatus(int number) {
        if (isNumberPositive(number)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    private static void repeatPrintString(String text, int repeatNumber) {
        for (int i = 0; i < repeatNumber; i++) {
            System.out.println(text);
        }
    }

}
