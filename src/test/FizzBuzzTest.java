package test;

import leetcode.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzBuzz test = new FizzBuzz();

    @Test
    public void onlyNumbers(){
        int num = 2;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        assertTrue(expectedResult.equals(test.fizzBuzz(num)));
    }

    @Test
    public void onlyFizz(){
        int num = 3;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        assertTrue(expectedResult.equals(test.fizzBuzz(num)));
    }

    @Test
    public void fizzAndBuzz(){
        int num = 5;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        assertTrue(expectedResult.equals(test.fizzBuzz(num)));
    }

    @Test
    public void fizzBuzz(){
        int num = 15;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");
        expectedResult.add("4");
        expectedResult.add("Buzz");
        expectedResult.add("Fizz");
        expectedResult.add("7");
        expectedResult.add("8");
        expectedResult.add("Fizz");
        expectedResult.add("Buzz");
        expectedResult.add("11");
        expectedResult.add("Fizz");
        expectedResult.add("13");
        expectedResult.add("14");
        expectedResult.add("FizzBuzz");
        assertTrue(expectedResult.equals(test.fizzBuzz(num)));
    }
}
