package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S34_2_MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "91";
        String num2 = "999";

        System.out.println(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {
        StringBuffer answerBuffer = new StringBuffer();
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if (num1.length()<num2.length()){
            String temp = num2;
            num2 = num1;
            num1 = temp;
        }
        int[] num1Arr = Arrays.stream(num1.split("")).mapToInt(Integer::parseInt).toArray();
        int[] num2Arr = Arrays.stream(num2.split("")).mapToInt(Integer::parseInt).toArray();
        int[] sumArr = new int[num1.length()];

        int upPlus = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            int index = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int multiple = 0;
                if (index == 0) {
                    multiple = sumArr[index] + num1Arr[j] * num2Arr[i];
                    answerBuffer.insert(0, multiple % 10);
                    upPlus = multiple / 10;
                    index++;
                } else {
                    multiple = (num1Arr[j] * num2Arr[i]) + sumArr[index] + upPlus;
                    sumArr[index - 1] = multiple % 10;
                    upPlus = multiple / 10;
                    index++;
                }
                if (j == 0) {
                    sumArr[index-1] = upPlus;
                    upPlus=0;
                    index = 0;
                }
            }
        }
        for (int i = 0; i < sumArr.length; i++) {
            if (i==sumArr.length-1){
                sumArr[i] += upPlus;
                if (sumArr[i]!=0) {
                    answerBuffer.insert(0, sumArr[i]);
                }
                continue;
            }
            answerBuffer.insert(0, sumArr[i]);
        }

        return answerBuffer.toString();
    }
}
/*
Input: num1 = "2", num2 = "3"
Output: "6"

Input: num1 = "123", num2 = "456"
Output: "56088"
 */