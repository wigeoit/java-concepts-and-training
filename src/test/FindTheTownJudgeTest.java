package test;

import leetcode.FindTheTownJudge;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheTownJudgeTest {

    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();;

    @Test
    void judExistsAndItIs2(){
        int n = 3;
        int[][] trust = {{1,2},{2,3}};
        int expectedResult = -1;
        assertEquals(expectedResult, findTheTownJudge.findJudge(n,trust));
    }

}