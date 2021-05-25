package leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S57_InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {0,3};

        insert(intervals, newInterval);
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length==0){
            return new int[][]{{newInterval[0],newInterval[1]}};
        }
        Arrays.sort(intervals,((o1, o2) -> {
            if (o1[0]==o2[0]){
                return Integer.compare(o1[1],o2[1]);
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        }));
        List<int[]> answerList = new ArrayList<>();
        int[] result = new int[2];
        for (int i = 0 ; i< intervals.length ; i ++){
            if (newInterval[0]>=0) {
                if (intervals[i][0]<=newInterval[0] && intervals[i][1]>=newInterval[1]) {
                    newInterval[0]=-1;
                } else if (intervals[i][1]>=newInterval[0]){
                    if (intervals[i][1]<=newInterval[1]){
                        if (intervals[i][0]>=newInterval[0] && intervals[i][1]>=newInterval[1]){
                            intervals[i][0]=newInterval[0];
                            newInterval[0]=-1;
                        } else {
                            intervals[i][1]=newInterval[1];
                            if (intervals[i][0]>=newInterval[0]){
                                intervals[i][0]=newInterval[0];
                            }
                            newInterval[0]=-1;
                        }
                    }
                } else if (intervals[i][0]<=newInterval[1] && intervals[i][0]>=newInterval[0]) {
                    intervals[i][0]=newInterval[0];
                    newInterval[0]=-1;
                }
            }
            if (i==0){
                result = new int[]{intervals[0][0],intervals[0][1]};
            }
            if (result[1] < intervals[i][0]) {
                answerList.add(result);
                result =  new int[]{intervals[i][0],intervals[i][1]};
            } else {
                if (result[0] > intervals[i][0]) {
                    result[0] = intervals[i][0];
                }
                if (result[1] >= intervals[i][1]) {
                    continue;
                } else {
                    result[1] = intervals[i][1];
                }
            }
        }
        answerList.add(result);
        if (newInterval[0]>=0) {
            answerList.add(newInterval);
            Arrays.sort(intervals,((o1, o2) -> {
                if (o1[0]==o2[0]){
                    return Integer.compare(o1[1],o2[1]);
                } else {
                    return Integer.compare(o1[0],o2[0]);
                }
            }));
        }
        int[][] answer = new int[answerList.size()][2];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i][0] = answerList.get(i)[0];
            answer[i][1] = answerList.get(i)[1];
        }
        return answer;
    }
}
