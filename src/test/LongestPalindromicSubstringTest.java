package test;

import leetcode.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring test = new LongestPalindromicSubstring();

    @Test
    public void returnsBab(){
        String input = "babad";
        String expectedResult = "bab";

        assertEquals(expectedResult, test.longestPalindrome(input));
    }

    @Test
    public void returnsBb(){
        String input = "cbbd";
        String expectedResult = "bb";

        assertEquals(expectedResult, test.longestPalindrome(input));
    }

}
