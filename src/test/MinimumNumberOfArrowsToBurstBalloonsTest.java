package test;

import leetcode.MinimumNumberOfArrowsToBurstBalloons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumNumberOfArrowsToBurstBalloonsTest {
    MinimumNumberOfArrowsToBurstBalloons test = new MinimumNumberOfArrowsToBurstBalloons();

    @Test
    void twoBalloons(){
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int expectedResult = 2;

        assertEquals(expectedResult, test.findMinArrowShots(points));

    }
    @Test
    void fourBalloons(){
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        int expectedResult = 4;

        assertEquals(expectedResult, test.findMinArrowShots(points));

    }
    @Test
    void againTwoBalloons(){
        int[][] points = {{1,2},{2,3},{3,4},{4,5}};
        int expectedResult = 2;

        assertEquals(expectedResult, test.findMinArrowShots(points));

    }
}
