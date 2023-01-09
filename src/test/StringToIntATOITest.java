package test;

import leetcode.StringToIntegerATOI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringToIntATOITest {
    StringToIntegerATOI test = new StringToIntegerATOI();

    @Test
    void numberReturnsOnlyNumber(){
        String s = "42";
        int expectedResult = 42;

        assertEquals(expectedResult, test.myAtoi(s));
    }

    @Test
    void spacesBeforeNegativeNumberReturnsNegativeNumber(){
        String s = "   -42";
        int expectedResult = -42;

        assertEquals(expectedResult, test.myAtoi(s));
    }

    @Test
    void wordsAfterNumberReturnsOnlyNumber(){
        String s = "4193 with words";
        int expectedResult = 4193;

        assertEquals(expectedResult, test.myAtoi(s));
    }
}
