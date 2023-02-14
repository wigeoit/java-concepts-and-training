package test;

import leetcode.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses test = new ValidParentheses();

    @Test
    void onlyParenthesesOpenAndCloseReturnTrue(){
        String s = "()";
        assertTrue(test.isValid(s));
    }

    @Test
    void onlyOneParenthesesOpenReturnFalse(){
        String s = "(";
        assertFalse(test.isValid(s));
    }

    @Test
    void onlyCurlyOpenAndCloseReturnTrue(){
        String s = "{}";
        assertTrue(test.isValid(s));
    }

    @Test
    void onlyOneCurlyOpenReturnFalse(){
        String s = "{";
        assertFalse(test.isValid(s));
    }

    @Test
    void onlyBracketOpenAndCloseReturnTrue(){
        String s = "[]";
        assertTrue(test.isValid(s));
    }

    @Test
    void onlyOneBracketOpenReturnFalse(){
        String s = "[";
        assertFalse(test.isValid(s));
    }

    @Test
    void allKindOpenAndCloseReturnTrue(){
        String s = "({[]})";
        assertTrue(test.isValid(s));
    }

    @Test
    void allKindMissingCloseReturnFalse(){
        String s = "({[";
        assertFalse(test.isValid(s));
    }

    @Test
    void oneKindMissingCloseReturnFalse(){
        String s = "({[})";
        assertFalse(test.isValid(s));
    }
}