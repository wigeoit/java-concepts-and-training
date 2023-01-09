package test;

import leetcode.GasStation_134;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GasStation_134_Test{

    GasStation_134 test = new GasStation_134();

    @Test
    public void returnsThree(){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        assertEquals(3, test.canCompleteCircuit(gas, cost));
    }

    @Test
    public void returnsMinusOne(){
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        assertEquals(-1, test.canCompleteCircuit(gas, cost));
    }

    @Test
    public void returnsFour(){
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};
        assertEquals(4, test.canCompleteCircuit(gas, cost));
    }

    @Test
    public void returnsAnotherMinusOne(){
        int[] gas = {4,0,1};
        int[] cost = {3,2,1};
        assertEquals(-1, test.canCompleteCircuit(gas, cost));
    }

    @Test
    public void returnsZero(){
        int[] gas = {3,1,1};
        int[] cost = {1,2,2};
        assertEquals(0, test.canCompleteCircuit(gas, cost));
    }
}
