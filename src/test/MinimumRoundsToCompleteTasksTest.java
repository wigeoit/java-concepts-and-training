package test;

import leetcode.MinimumRoundsToCompleteTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumRoundsToCompleteTasksTest {
    MinimumRoundsToCompleteTasks test = new MinimumRoundsToCompleteTasks();

    @Test
    void returnsFour(){
        int[] array = {2,2,3,3,2,4,4,4,4,4};
        int expectedResult = 4;

        assertEquals(expectedResult, test.minimumRounds(array));
    }
    @Test
    void returnsNegativeOne(){
        int[] array = {2,3,3};
        int expectedResult = -1;

        assertEquals(expectedResult, test.minimumRounds(array));
    }
}
