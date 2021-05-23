package leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S56_MergeInterval {
    public static int[][] merge(int[][] intervals) {
        int[] result = new int[2];
        List<int[]> resultList = new ArrayList<>();
        result[0] = intervals[0][0];
        result[1] = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (result[1] < intervals[i][0]) {
                resultList.add(result);
                result =  new int[]{intervals[i][0],intervals[i][1]};
            } else {
                if (result[0] > intervals[i][0]){
                    result[0] = intervals[i][0];
                }
                if (result[1] >= intervals[i][1]) {
                    continue;
                } else {
                    result[1] = intervals[i][1];
                }
            }
        }
        resultList.add(result);
        int[][] answer = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i][0] = resultList.get(i)[0];
            answer[i][1] = resultList.get(i)[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] interval = {{1, 4}, {0, 4}};
        System.out.println(Arrays.toString(merge(interval)[0]));
        System.out.println(Arrays.toString(merge(interval)[1]));
        System.out.println(Arrays.toString(merge(interval)[2]));
    }
}
/*
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */