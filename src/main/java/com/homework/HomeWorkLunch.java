package com.homework;

public class HomeWorkLunch {

    private static final int MIN_LIMIT = 10;
    private static final int MAX_LIMIT = 20;

    public static void main(String[] args) {
        boolean isInRange = isWithinRange(3, 3);
        System.out.println("Sum of 3 and 3 is in range: " + isInRange);

        printIntegerStatus(0);
        printIntegerStatus(-1);
        printIntegerStatus(1);
    }

    public static boolean isWithinRange(int number1, int number2) {
        int sum = number1 + number2;

        return MIN_LIMIT <= sum && sum <= MAX_LIMIT;
    }

    public static void printIntegerStatus(int number) {
        if (isNumberPositive(number)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean isNumberPositive(int number) {
        return number >= 0;
    }

}
