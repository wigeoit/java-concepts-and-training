package test;

import leetcode.ReversedInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversedIntegerTest {
    ReversedInteger test = new ReversedInteger();

    @Test
    void returns321(){
        int x = 123;
        int expectedResult = 321;

        assertEquals(expectedResult, test.reverse(x));
    }

    @Test
    void returnsNegative321(){
        int x = -123;
        int expectedResult = -321;

        assertEquals(expectedResult, test.reverse(x));
    }

    @Test
    void returns21(){
        int x = 120;
        int expectedResult = 21;

        assertEquals(expectedResult, test.reverse(x));
    }
}
