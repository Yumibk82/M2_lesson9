import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void nextDay() {
        int date=1;
        int month=1;
        int year=2018;
        int[] nextDay={2,1,2018};
        String expected= Arrays.toString(nextDay);
        String result=NextDayCalculator.nextDay(date,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void nextDay1(){
        int date=31;
        int month=1;
        int year=2018;
        int[] nextDay={1,2,2018};
        String expected=Arrays.toString(nextDay);
        String result=NextDayCalculator.nextDay(date,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void nextDay2(){
        int date=30;
        int month=4;
        int year=2018;
        int[] nextDay={1,5,2018};
        String expected=Arrays.toString(nextDay);
        String result=NextDayCalculator.nextDay(date,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void nextDay3(){
        int date=28;
        int month=2;
        int year=2018;
        int[] nextDay={1,3,2018};
        String expected=Arrays.toString(nextDay);
        String result=NextDayCalculator.nextDay(date,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void nextDay4(){
        int date=29;
        int month=2;
        int year=2020;
        int[] nextDay={1,3,2020};
        String expected=Arrays.toString(nextDay);
        String result=NextDayCalculator.nextDay(date,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void nextDay5(){
        int date=31;
        int month=12;
        int year=2018;
        int[] nextDay={1,1,2019};
        String expected=Arrays.toString(nextDay);
        String result=NextDayCalculator.nextDay(date,month,year);
        assertEquals(expected,result);
    }
}