package test;

import leetcode.MaximumIceCreamBars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumIceCreamBarsTest {
    MaximumIceCreamBars test = new MaximumIceCreamBars();

    @Test
    void returnsFour(){
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        int expectedResult = 4;

        assertEquals(expectedResult, test.maxIceCream(costs, coins));
    }

    @Test
    void returnsZero(){
        int[] costs = {10,6,8,7,7,8};
        int coins = 5;
        int expectedResult = 0;

        assertEquals(expectedResult, test.maxIceCream(costs, coins));
    }

    @Test
    void returnsSix(){
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;
        int expectedResult = 6;

        assertEquals(expectedResult, test.maxIceCream(costs, coins));
    }

}
