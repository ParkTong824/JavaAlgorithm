package programmersLevel0;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution40 {
    public int solution(int[][] dots) {
        for (int i = 1 ; i < dots.length ; i++) {
            Set<Integer> checkSet = new HashSet<>(Arrays.asList(1, 2, 3));
            int[] checkArr = {Math.abs(dots[0][0]-dots[i][0]), Math.abs(dots[0][1] - dots[i][1])};
            checkSet.remove(i);
            int firstPivot = 0;
            int secondPivot = 0;
            for (int j : checkSet) {
                if (firstPivot == 0) {
                    firstPivot = j;
                } else {
                    secondPivot = j;
                }
            }
            int[] pivotArr = {Math.abs(dots[firstPivot][0]-dots[secondPivot][0]), Math.abs(dots[firstPivot][1] - dots[secondPivot][1])};
            if (checkArr[0] == pivotArr[0] && checkArr[1] == pivotArr[1]){
                return 1;
            }
            if ((checkArr[0] > pivotArr[0] && checkArr[1] > pivotArr[1]) || (checkArr[0] < pivotArr[0] && checkArr[1] < pivotArr[1])) {
                if ((double)checkArr[0]/checkArr[1] == (double) pivotArr[0] / pivotArr[1]){
                    return 1;
                }
            }

        }
        return 0;
    }
}
