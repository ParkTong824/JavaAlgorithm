package programmersLevel1;

import java.util.Arrays;

public class Solution07MinNum {
    public static void main(String[] args) {

    }

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if (arr.length==1){
            answer = new int[]{-1};
            return answer;
        }
        int[] sortArr =new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            sortArr[i] = arr[i];
        }
        Arrays.sort(sortArr);
        int min = sortArr[0];
        int answerIndex = 0;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]==min){
                continue;
            }
            answer[answerIndex]=arr[i];
            answerIndex++;
        }
        return answer;
    }
}

/*
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
 */