package leetcode;
/*
    There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

    You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station
    to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

    Given two integer arrays gas and cost, return the starting gas station's index if you can travel around
    the circuit once in the clockwise direction, otherwise return -1.
    If there exists a solution, it is guaranteed to be unique

    Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
    Output: 3
    Explanation:
    Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
    Travel to station 4. Your tank = 4 - 1 + 5 = 8
    Travel to station 0. Your tank = 8 - 2 + 1 = 7
    Travel to station 1. Your tank = 7 - 3 + 2 = 6
    Travel to station 2. Your tank = 6 - 4 + 3 = 5
    Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
    Therefore, return 3 as the starting index.
 */

import java.util.*;

public class GasStation_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int available = 0;
        int index = 0;

        for(int i=0; i < gas.length; i++){
            total += gas[i]-cost[i];
            available += gas[i]-cost[i];
            if(available < 0){
                available = 0;
                index = i + 1;
            }
        }
        return total < 0 ? -1: index;
    }

    //Different approach not optimal
    public int canCompleteCircuit2(int[] gas, int[] cost) {
        boolean notFinished = true;

        int startIndex = -1;
        int lastStartIndex = -1;

        List<Integer> evaluatedIndexes = new ArrayList<>();

        int endIndex = -1;
        boolean isGasEnough = true;

        while (notFinished){
            int currentGas = 0;
            int currentCost = 0;

            int maxGasIndex = 0;
            int maxGasValue = 0;

            //Finds the index with more gas
            for(int i = 0; i < gas.length; i++ ){
                Integer index = i;
                System.out.println("Evaluated index = " + index);

                if(evaluatedIndexes.contains(index)){

                }else {
                    if(gas[i] >= maxGasValue){
                        maxGasValue = gas[i];
                        maxGasIndex = i;
                        startIndex = maxGasIndex;
                    }
                }
            }

            System.out.println("Index = " + startIndex + " has more value: " + maxGasValue);

            if(evaluatedIndexes.contains(startIndex)){
                if (evaluatedIndexes.size() == gas.length) {
                    System.out.println("Evaluated Indexes List" + evaluatedIndexes);
                    return -1;
                }
            }else {
                System.out.println("Adding to list: " + startIndex);
                evaluatedIndexes.add(startIndex);
                System.out.println("startIndex = " + startIndex);

                System.out.println("currentGas at start = " + currentGas);
                System.out.println("currentCost at start = " + currentCost);

                boolean canContinue = false;

                //Starts checking with the next values
                for (int i = startIndex; i < gas.length; i++){

                    currentGas += gas[i];
                    System.out.println("Filling currentGas to = " + currentGas);
                    currentCost = cost[i];
                    System.out.println("To arrive to next station will cost - currentCost = " + currentCost);
                    if(currentGas - currentCost >= 0){
                        currentGas = currentGas - currentCost;
                        isGasEnough = true;
                        if(i+1 == gas.length){
                            canContinue = true;
                        }
                    }else{
                        isGasEnough = false;
                        break;
                        //return -1;
                    }

                    endIndex = i;
                }

                System.out.println("startIndex = " + startIndex);
                System.out.println("canContinue = " + canContinue);
                if(canContinue && startIndex == 0){
                    return startIndex;
                }


                if(canContinue && startIndex>0){

                    for (int i = 0; i < startIndex ; i++){
                        currentGas += gas[i];
                        System.out.println("Filling currentGas to = " + currentGas);
                        currentCost = cost[i];
                        System.out.println("To arrive to next station will cost - currentCost = " + currentCost);
                        if(currentGas - currentCost >= 0){
                            currentGas = currentGas - currentCost;
                            isGasEnough = true;
                        }else{
                            isGasEnough = false;
                            break;
                        }
                        endIndex = i;
                    }
                }else{
                    if(evaluatedIndexes.size() == gas.length){
                        return  -1;
                    }

                }

                System.out.println("endIndex = " + endIndex);
                System.out.println("currentGas = " + currentGas);
                System.out.println("isGasEnough = " + isGasEnough);
                if(endIndex+1 == startIndex && isGasEnough){
                    return  startIndex;
                }
            }
            System.out.println("notFinished = " + notFinished);
        }
        return -1;
    }
}
