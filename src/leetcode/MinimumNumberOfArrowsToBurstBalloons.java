package leetcode;

import java.util.*;

/*
    Link: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

    There are some spherical balloons taped onto a flat wall that represents the XY-plane.
    The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon
    whose horizontal diameter stretches between xstart and xend.
    You do not know the exact y-coordinates of the balloons.

    Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis.
    A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend.
    There is no limit to the number of arrows that can be shot.
    A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

    Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

    Example 1:
        Input: points = [[10,16],[2,8],[1,6],[7,12]]
        Output: 2
        Explanation: The balloons can be burst by 2 arrows:
        - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
        - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].

    Example 2:
        Input: points = [[1,2],[3,4],[5,6],[7,8]]
        Output: 4
        Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.

    Example 3:
        Input: points = [[1,2],[2,3],[3,4],[4,5]]
        Output: 2
        Explanation: The balloons can be burst by 2 arrows:
        - Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
        - Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
*/
public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));

        int result = 1;

        int previous = 0;

        for(int current = 1; current < points.length; current++){
            if(points[current][0] > points[previous][1]){
                result++;
                previous = current;
            }
        }
        return result;
    }

    public int findMinArrowShots2(int[][] points) {

        List<List<Integer>> balloonsList = new ArrayList<>();

        for (int[] point: points){
            List<Integer> newPoint = new ArrayList<>();
            newPoint.add(point[0]);
            newPoint.add(point[1]);
            balloonsList.add(newPoint);
        }

        return findMinArrowShotsRecursive(balloonsList, 0);
    }

    public int findMinArrowShotsRecursive(List<List<Integer>> points, int arrows) {
        int largerPointIndex = 0;
        int largerPointSize = 0;
        int minimumArrows = arrows;

        if(points.size()!=0){

            List<List<Integer>> pointsToDelete = new ArrayList<>();

            for(int i=0; i < points.size(); i++) {

                List<Integer> pointToDelete = points.get(i);
                int currStart = points.get(i).get(0);
                int currEnd = points.get(i).get(1);
                int currPointSize = currEnd - currStart + 1;

                if(currPointSize > largerPointSize){
                    largerPointIndex = i;
                    largerPointSize = currPointSize;

                }
            }

            List<Integer> pointOfComparison = points.get(largerPointIndex);
            int pointsBehind = largerPointIndex;
            int pointsAhead = points.size()-largerPointIndex-1;
            boolean alreadyExploded = false;

            int lastDeletedStart = -1;
            int nextDeletedStart = -1;

            while (pointsBehind>0){
                int prevStart = points.get(pointsBehind-1).get(0);
                int prevEnd = points.get(pointsBehind-1).get(1);

                //If any of the indexes of the point behind is in the range of the point of comparison
                //The point behind should be removed
                if(prevStart>= lastDeletedStart){

                    if((prevStart >= pointOfComparison.get(0) && prevStart <= pointOfComparison.get(1)) ||
                            (prevEnd >= pointOfComparison.get(0) && prevEnd <= pointOfComparison.get(1))){
                        lastDeletedStart = prevStart;
                        pointsToDelete.add(points.get(pointsBehind-1));
                    }
                }

                pointsBehind--;

            }
            int nextPoint = largerPointIndex+1;
            while (pointsAhead>0 && nextPoint <= pointsAhead ){
                int nextStart = points.get(nextPoint).get(0);
                int nextEnd = points.get(nextPoint).get(1);

                if(nextEnd >= nextDeletedStart) {
                    if ((nextStart >= pointOfComparison.get(0) && nextStart <= pointOfComparison.get(1))
                            || (nextEnd >= pointOfComparison.get(0) && nextEnd <= pointOfComparison.get(1))
                    ) {
                        nextDeletedStart = nextStart;
                        pointsToDelete.add(points.get(nextPoint));
                    }
                }
                nextPoint++;
            }
            pointsToDelete.add(pointOfComparison);
            points.removeAll(pointsToDelete);
            arrows++;
        }
        else{
            return minimumArrows;
        }
        return findMinArrowShotsRecursive(new ArrayList<>(points), arrows);
    }

    public int findMinArrowShots3(int[][] points) {
        Arrays.parallelSort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrowsNeeded = 0;
        int limit = -1;
        for (int[] point : points) {
            if (arrowsNeeded == 0 || point[0] > limit) {
                limit = point[1];
                ++arrowsNeeded;
            }
        }
        return arrowsNeeded;
    }

}
