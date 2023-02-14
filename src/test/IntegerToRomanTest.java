package test;

import leetcode.IntegerToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    void convertsThreeIntoIII(){
        String expectedResult = "III";
        assertEquals(expectedResult, integerToRoman.intToRoman(3));
    }

    @Test
    void convertsFourIntoIV(){
        String expectedResult = "IV";
        assertEquals(expectedResult, integerToRoman.intToRoman(4));
    }

    @Test
    void convertsOneThousandFiveHundredAndFortyTwoIntoMDXLII(){
        String expectedResult = "MDXLII";
        assertEquals(expectedResult, integerToRoman.intToRoman(1542));
    }

    @Test
    void convertsTwoThousandNineHundredAndNineFourIntoMCMXCIV(){
        String expectedResult = "MCMXCIV";
        assertEquals(expectedResult, integerToRoman.intToRoman(1994));
    }
}