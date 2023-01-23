package test;

import leetcode.NonDecreasingSubsequences;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonDecreasingSubsequencesTest {
    NonDecreasingSubsequences test = new NonDecreasingSubsequences();

    @Test
    void onlyOneList(){
        int[] nums = {4,4,3,2,1};

        List<List<Integer>> expectedResult = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(4);

        expectedResult.add(list1);

        assertTrue(expectedResult.equals(test.findSubsequences(nums)));

    }
    @Test
    void allNumbersInList(){
        int[] nums = {4,6,7,7};

        List<List<Integer>> expectedResult = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        list2.add(7);

        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(6);
        list3.add(7);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(7);

        List<Integer> list5 = new ArrayList<>();
        list5.add(4);
        list5.add(7);
        list5.add(7);

        List<Integer> list6 = new ArrayList<>();
        list6.add(6);
        list6.add(7);

        List<Integer> list7 = new ArrayList<>();
        list7.add(6);
        list7.add(7);
        list7.add(7);

        List<Integer> list8 = new ArrayList<>();
        list8.add(7);
        list8.add(7);

        expectedResult.add(list1);
        expectedResult.add(list2);
        expectedResult.add(list3);
        expectedResult.add(list4);
        expectedResult.add(list5);
        expectedResult.add(list6);
        expectedResult.add(list7);
        expectedResult.add(list8);

        assertTrue(expectedResult.containsAll(test.findSubsequences(nums)));

    }

}