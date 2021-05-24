package leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S57_InsertInterval {
    public static void main(String[] args) {

    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,((o1, o2) -> {
            if (o1[0]==o2[0]){
                return Integer.compare(o1[1],o2[1]);
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        }));
        List<int[]> answerList = new ArrayList<>();
        int[] result = new int[]{intervals[0][0],intervals[0][1]};
        for (int i = 1 ; i< intervals.length ; i ++){
            if (newInterval[0]>=0) {
                if (intervals[i][1]>=newInterval[0]){
                    if (intervals[i][1]<=newInterval[1]){
                        intervals[i][1]=newInterval[1];
                        if (intervals[i][0]>=newInterval[0]){
                            intervals[i][0]=newInterval[0];
                        }
                        newInterval[0]=-1;
                    }
                } else if (intervals[i][1]<=newInterval[1])
            }
        }
    }
}
