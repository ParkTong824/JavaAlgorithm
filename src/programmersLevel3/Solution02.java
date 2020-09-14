package programmersLevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution02 {
    public static void main(String[] args) {
        int[] a = new int[4];

        System.out.println(a.length);
    }
    public static int solution(int[][] jobs) {
        int answer = 0;
        int currentTime = 0;
        int processtime = 0;
        List<Integer> minHeap = new ArrayList<>();
        Arrays.sort(jobs, ((o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1],o2[1]);
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        }));
        currentTime = jobs[0][0]+jobs[0][1];
        processtime = currentTime-jobs[0][0];
        int count = 1;
        while (count < jobs.length) {
            for (int i = count ; i < jobs.length ; i++){
                if (jobs[i][0]<=currentTime){
                    
                }
            }
        }

        return answer;
    }
}
