package test;

import leetcode.MinimumTimeToCollectAllApples;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeToCollectAllApplesTest {

    MinimumTimeToCollectAllApples test = new MinimumTimeToCollectAllApples();

    @Test
    void returnsEight(){
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        List hasApple = new ArrayList<>();
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(true);
        hasApple.add(false);

        int expectedResult = 8;
        assertEquals(expectedResult, test.minTime(n, edges, hasApple) );
    }
    @Test
    void returnsSix(){
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        List hasApple = new ArrayList<>();
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(false);

        int expectedResult = 6;
        assertEquals(expectedResult, test.minTime(n, edges, hasApple) );
    }@Test
    void returnsZero(){
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        List hasApple = new ArrayList<>();
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(false);

        int expectedResult = 0;
        assertEquals(expectedResult, test.minTime(n, edges, hasApple) );
    }
}