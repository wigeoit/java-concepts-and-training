package test;

import leetcode.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {
    LongestCommonPrefix test = new LongestCommonPrefix();
    @Test
    public void returnsFl(){
        String[] strs = {"flower","flow","flight","fly"};
        String expectedResult = "fl";
        assertEquals(expectedResult, test.longestCommonPrefix(strs));
    }
    @Test
    public void returnsEmptyString(){
        String[] strs = {"dog","racecar","car"};
        String expectedResult = "";
        assertEquals(expectedResult, test.longestCommonPrefix(strs));
    }
    @Test
    public void returnsCar(){
        String[] strs = {"cartoon","car","care"};
        String expectedResult = "car";
        assertEquals(expectedResult, test.longestCommonPrefix(strs));
    }
}
