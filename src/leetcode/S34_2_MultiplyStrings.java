package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S34_2_MultiplyStrings {
    public String multiply(String num1, String num2) {
        StringBuffer answerBuffer = new StringBuffer();
        int[] num1Arr = Arrays.stream(num1.split("")).mapToInt(Integer::parseInt).toArray();
        int[] num2Arr = Arrays.stream(num2.split("")).mapToInt(Integer::parseInt).toArray();
        int[] sumArr = new int[num1.length()];
        Queue<int[]> arrQue = new LinkedList<>();

        int upPlus = 0;
        for (int i = num2.length()-1 ; i >=0 ; i--) {
            int index = 0;
            if (!arrQue.isEmpty()){
                sumArr=arrQue.poll();
            }
            for (int j = num1.length()-1 ; j >=0 ; j--){
                if (j == num1.length()-1){
                    int multiple = num1Arr[j]*num2Arr[i]+upPlus;
                    upPlus = multiple/10;
                    answerBuffer.insert(0,upPlus%10);
                    continue;
                }
//                sumArr[index] =
            }
        }


    }
}
/*
Input: num1 = "2", num2 = "3"
Output: "6"

Input: num1 = "123", num2 = "456"
Output: "56088"
 */