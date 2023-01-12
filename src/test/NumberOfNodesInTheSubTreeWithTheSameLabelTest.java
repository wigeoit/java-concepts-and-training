package test;

import leetcode.NumberOfNodesInTheSubTreeWithTheSameLabel;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class NumberOfNodesInTheSubTreeWithTheSameLabelTest {
    NumberOfNodesInTheSubTreeWithTheSameLabel test = new NumberOfNodesInTheSubTreeWithTheSameLabel();

    @Test
    void sameLabelInOneOfTheChildrenOfTheRoot(){
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        String labels = "abaedcd";

        int[] expectedResult = {2,1,1,1,1,1,1};
        assertTrue(Arrays.equals(expectedResult, test.countSubTrees(n, edges, labels)));

    }
    @Test
    void allSameLabel(){
        int n = 4;
        int[][] edges = {{0,1},{1,2},{0,3}};
        String labels = "bbbb";

        int[] expectedResult = {4,2,1,1};
        assertTrue(Arrays.equals(expectedResult, test.countSubTrees(n, edges, labels)));

    }
}