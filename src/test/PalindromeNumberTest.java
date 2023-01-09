package test;

import leetcode.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    PalindromeNumber test = new PalindromeNumber();

    @Test
    void trueFor121(){
        int x = 121;

        assertTrue(test.isPalindrome(x));
    }

    @Test
    void falseForNegative121(){
        int x = -121;

        assertFalse(test.isPalindrome(x));
    }

    @Test
    void falseFor10(){
        int x = 10;

        assertFalse(test.isPalindrome(x));
    }
}
