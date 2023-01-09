package test;

import leetcode.LongestSubstringNoRepeating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringNoRepeatingTest {
    LongestSubstringNoRepeating test = new LongestSubstringNoRepeating();

    @Test
    public void returnsThree(){
        String input = "abcabcbb";
        int expectedOutput = 3;

        assertEquals(expectedOutput, test.lengthOfLongestSubstring(input));
    }

    @Test
    public void returnsOne(){
        String input = "bbbbb";
        int expectedOutput = 1;

        assertEquals(expectedOutput, test.lengthOfLongestSubstring(input));
    }

    @Test
    public void returnsFive(){
        String input = "pwwkewor";
        int expectedOutput = 5;

        assertEquals(expectedOutput, test.lengthOfLongestSubstring(input));
    }
}
