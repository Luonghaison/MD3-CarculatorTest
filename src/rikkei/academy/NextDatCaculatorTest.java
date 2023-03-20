package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDatCaculatorTest {
    @Test
    void testDay1month1(){
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = 2 + "/" +1+ "/"+ 2018;
        String result = NextDatCaculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void testDay31month1(){
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = 1 + "/" +2+ "/"+ 2018;
        String result = NextDatCaculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void testDay30month4(){
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = 1 + "/" +5+ "/"+ 2018;
        String result = NextDatCaculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void testDay28month2(){
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = 1 + "/" +3+ "/"+ 2018;
        String result = NextDatCaculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void testDay29month2(){
        int day = 29;
        int month = 2;
        int year = 2018;
        String expected = 1 + "/" +3+ "/"+ 2018;
        String result = NextDatCaculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
    void testDay31month12(){
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = 1 + "/" +1+ "/"+ 2018;
        String result = NextDatCaculator.nextDay(day,month,year);
        assertEquals(expected, result);
    }
}