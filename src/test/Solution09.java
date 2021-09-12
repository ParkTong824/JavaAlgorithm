package test;

import java.util.ArrayList;
import java.util.List;

public class Solution09 {
    List<int[]> arrayList = new ArrayList<>();

    public int[] solution(int n, int[] info) {
        int[] answer = new int[info.length];
        int[] target = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = new int[n];

        makeOverlabCombination(n, result, target, 0, 0);
        int[] sumArray = new int[arrayList.size()];
        int[][] rion = new int[arrayList.size()][info.length];

        for(int i=0; i < arrayList.size(); i++){
            int[] tempArray = arrayList.get(i);
            for(int w=0; w<tempArray.length; w++){
                rion[i][10-tempArray[w]]++;
            }
        }

        int[] resultArray = new int[rion.length];
        for(int i=0; i < rion.length; i++){
            int[] rionArray = rion[i];
            int apeachScore = 0;
            int rionScore = 0;
            for(int w=0; w < info.length; w++){
                int apeachNum = info[w];
                int rionNum = rionArray[w];

                if(apeachNum == 0 && rionNum == 0)
                    continue;

                if(apeachNum >= rionNum){
                    apeachScore += (10 - w);
                }else{
                    rionScore += (10 - w);
                }
            }
            resultArray[i] = rionScore - apeachScore;
        }

        int maxIndex = -1;
        int maxSum = -1;
        for(int i=0; i < resultArray.length; i++){
            if(maxSum < resultArray[i]){
                maxSum = resultArray[i];
                maxIndex = i;
            }
        }

        return maxSum <= 0 ? new int[]{-1} : rion[maxIndex];
    }

    private void makeOverlabCombination(int n, int[] result, int[] target,int current, int start) {
        if (n == current) {
            int[] temp = new int[result.length];
            for (int i = 0; i < result.length; i++) {
                temp[i] = result[i];
            }
            arrayList.add(temp);
        } else {
            for (int i = start; i < target.length; i++) {
                result[current] = target[i];
                makeOverlabCombination(n, result, target, current + 1, i);
            }
        }
    }
}
