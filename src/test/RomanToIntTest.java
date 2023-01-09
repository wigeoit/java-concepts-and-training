package test;

import leetcode.RomanToInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntTest {
    RomanToInt test = new RomanToInt();

    @Test
    void iiiTo3(){
        String s = "III";
        int expectedResult = 3;
        assertEquals(expectedResult, test.romanToInt(s));
    }

    @Test
    void mcmxcivTo1993(){
        String s = "MCMXCIII";
        int expectedResult = 1993;
        assertEquals(expectedResult, test.romanToInt(s));
    }

    @Test
    void lviiiTo58(){
        String s = "LVIII";
        int expectedResult = 58;
        assertEquals(expectedResult, test.romanToInt(s));
    }
}
