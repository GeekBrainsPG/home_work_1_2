package com.homework;

import junit.framework.TestCase;

public class HomeWorkLunchTest extends TestCase {

    public void testSumOf5and4LessThan10() {
        assertEquals(HomeWorkLunch.isWithinRange(5, 4), false);
    }

    public void testSumOf5and5Equal10() {
        assertEquals(HomeWorkLunch.isWithinRange(5, 5), true);
    }

    public void testSumOf5and6GreatThen10LessThen20() {
        assertEquals(HomeWorkLunch.isWithinRange(5, 6), true);
    }

    public void testSumOf10and10Equal20() {
        assertEquals(HomeWorkLunch.isWithinRange(10, 10), true);
    }

    public void testSumOf10and11GreatThan20() {
        assertEquals(HomeWorkLunch.isWithinRange(10, 11), false);
    }

    public void testIsNumber1Positive() {
        assertEquals(HomeWorkLunch.isNumberPositive(1), true);
    }

    public void testIsNumber0Positive() {
        assertEquals(HomeWorkLunch.isNumberPositive(0), true);
    }

    public void testIsNegative1NumberNegative() {
        assertEquals(HomeWorkLunch.isNumberPositive(-1), false) ;
    }

    public void testIs2020LeapYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearCustom(2020), true);
        assertEquals(HomeWorkLunch.isLeapYearUtil(2020), true);
    }

    public void testIs2021LeapYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearCustom(2021), false);
        assertEquals(HomeWorkLunch.isLeapYearUtil(2021), false);
    }

    public void testIs2022LeapYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearCustom(2022), false);
        assertEquals(HomeWorkLunch.isLeapYearUtil(2022), false);
    }

    public void testIs2023LeapYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearCustom(2023), false);
        assertEquals(HomeWorkLunch.isLeapYearUtil(2023), false);
    }

    public void testIs2024LeapYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearCustom(2024), true);
        assertEquals(HomeWorkLunch.isLeapYearUtil(2024), true);
    }

    public void testIs2000CenturyYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearUtil(2000), true);
        assertEquals(HomeWorkLunch.isLeapYearCustom(2000), true);
    }

    public void testIs1900NonCenturyYearCustom() {
        assertEquals(HomeWorkLunch.isLeapYearUtil(1900), false);
        assertEquals(HomeWorkLunch.isLeapYearCustom(1900), false);
    }
}