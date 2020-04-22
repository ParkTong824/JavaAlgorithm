package programmersLevel2;

import java.util.Stack;

public class Solution02Tower {
    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};
        solution(heights);
    }
    public static int[] solution(int[] heights) {

        Stack<Integer> towerStack = new Stack<>();
        for (int i = heights.length-1 ; i > 0 ; i--){
            int towerHeights = heights[i];
            for (int j = i-1 ; j>=0 ; j--){
                if (towerHeights<heights[j]){
                    towerStack.add(j+1);
                    break;
                }else if(j==0){
                    towerStack.add(0);
                }
            }
            if (i==1){
                towerStack.add(0);
            }
        }
        int[] answer = new int[towerStack.size()];
        int answerIndex = 0;
        while (!towerStack.isEmpty()){
            answer[answerIndex] = towerStack.pop();
            answerIndex++;
        }
        return answer;
    }
}
/*
heights	return
[6,9,5,7,4]	[0,0,2,2,4]
[3,9,9,3,5,7,2]	[0,0,0,3,3,3,6]
[1,5,3,6,7,6,5]	[0,0,2,0,0,5,6]
 */