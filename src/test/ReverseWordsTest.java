package test;

import leetcode.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseWordsTest {
    ReverseWords test = new ReverseWords();

    @Test
    void blueIsSkyThe(){
        String s = "the sky is blue";
        String expectedResult = "blue is sky the";

        assertEquals(expectedResult, test.reverseWords(s));
    }

    @Test
    void worldHello(){
        String s = "  hello world  ";
        String expectedResult = "world hello";

        assertEquals(expectedResult, test.reverseWords(s));
    }

    @Test
    void exampleGoodA(){
        String s = "a good    example";
        String expectedResult = "example good a";

        assertEquals(expectedResult, test.reverseWords(s));
    }
}
