package test;

import leetcode.DetectCapital;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetectCapitalTest {

    DetectCapital test = new DetectCapital();

    @Test
    public void firstUppercaseNextLowercaseShouldReturnTrue(){
        String word = "Google";
        assertTrue(test.detectCapitalUse(word));
    }

    @Test
    public void allUppercaseShouldReturnTrue(){
        String word = "GOOGLE";
        assertTrue(test.detectCapitalUse(word));
    }

    @Test
    public void allLowercaseShouldReturnTrue(){
        String word = "google";
        assertTrue(test.detectCapitalUse(word));
    }

    @Test
    public void noConditionMetShouldReturnFalse(){
        String word = "gooGle";
        assertFalse(test.detectCapitalUse(word));
    }
}
