import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Chia het cho 3")
    void fizzBuzz1() {
        int number = 9;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Chia het cho 5")
    void fizzBuzz2() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Chia het cho ca 3 va 5")
    void fizzBuzz3() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Khong chia het cho so nao")
    void fizzBuzz4() {
        int number = 11;
        String expected = "11";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Co so 3")
    void fizzBuzz5() {
        int number = 32;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Co so 5")
    void fizzBuzz6() {
        int number = 52;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(result, expected);
    }

}