package leetcode5;

public class S495_TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int answer = 0;
        for (int i = 0 ; i < timeSeries.length ; i++) {
            if (i!=timeSeries.length-1&&timeSeries[i+1]-timeSeries[i]<duration) {
                answer+=timeSeries[i+1]-timeSeries[i];
            } else {
                answer+=duration;
            }
        }
        return answer;
    }
}
/*
Input: timeSeries = [1,4], duration = 2
Output: 4

Input: timeSeries = [1,2], duration = 2
Output: 3
 */
