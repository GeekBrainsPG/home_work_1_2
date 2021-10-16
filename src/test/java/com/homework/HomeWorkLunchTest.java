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
}