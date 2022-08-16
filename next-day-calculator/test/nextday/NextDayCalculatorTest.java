package nextday;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Case 1/1/2018")
    void getNextDay1() {
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String expected = "2/1/2018";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Case 31/1/2018")
    void getNextDay31() {
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Case 30/4/2018")
    void getNextDay30() {
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Case 28/2/2018")
    void getNextDay28Feb() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Case 29/2/2020")
    void getNextDay29FebLeapYear() {
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Case 31/12/2018")
    void getNextDay31Dec() {
        int dayTest = 31;
        int monthTest = 12;
        int yearTest = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(expected, result);
    }
}