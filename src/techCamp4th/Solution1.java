package techCamp4th;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int[] weights = {145,92,86};
        String[] head2head = {"NLW","WNL","LWN"};

        System.out.println(Arrays.toString(solution(weights,head2head)));
    }
    public static int[] solution(int[] weights, String[] head2head){
        int[] answer = new int[weights.length];
        int[][] rate = new int[weights.length][4];
        //[][0]: 승률 [1]:무거운 [2]:index
        for (int i = 0 ; i < head2head.length; i++){
            rate[i][2]=i;
            for (int j = 0 ; j < head2head.length; j++){
                if (j==i){
                    continue;
                }
                char isWin = head2head[i].charAt(j);
                if (isWin=='W'){
                    rate[i][0]++;
                    if (weights[i]<weights[j]){
                        rate[i][1]++;
                    }
                }
            }
        }
        Arrays.sort(rate, (o1, o2) -> {
            if (o1[0] == o2[0]){
                if (o1[1] == o2[1]){
                    return Integer.compare(o1[2], o2[2]);
                } else {
                    return Integer.compare(o1[1], o2[1]);
                }
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        for (int i = 0 ; i < answer.length ; i++){
            answer[i] = rate[rate.length-1-i][2]+1;
        }

        return answer;
    }
}
/*
[50,82,75,120]	["NLWL","WNLL","LWNW","WWLN"]	[3,4,1,2]
[145,92,86]	["NLW","WNL","LWN"]	[2,3,1]
[60,70,60]	["NNN","NNN","NNN"]	[2,1,3]
 */