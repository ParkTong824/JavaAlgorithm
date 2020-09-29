package leetcode;

public class Solution08Atoi {
    public static int myAtoi(String str) {
        int answer = 0;
        double doubleAnswer = 0;
        boolean isDouble = false;
        boolean isMinus = false;
        String result = "";
        String[] strArr = str.split(" ");

        for (int i = 0 ; i < strArr.length ; i++){
            if (strArr[i].equals("")){
                continue;
            }
            result = strArr[i];
            break;
        }
        try {
            doubleAnswer= Double.parseDouble(result);
            if (doubleAnswer<0){
                isMinus = true;
            }
            if (doubleAnswer%1>0){
                isDouble = true;
            }

        }catch (NumberFormatException e){
            return 0;
        }

        try {
            if (isDouble){
                answer = (int) doubleAnswer;
            }else {
                answer = Integer.parseInt(result);
            }

        }catch (NumberFormatException e){
            if (isMinus){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "3.14159";

        System.out.println(myAtoi(str));
    }
}
/*
Input: "42"
Output: 42

Input: "   -42"
Output: -42

Input: "4193 with words"
Output: 4193

Input: "words and 987"
Output: 0

Input: "-91283472332"
Output: -2147483648
 */
