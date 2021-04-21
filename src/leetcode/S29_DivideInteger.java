package leetcode;

public class S29_DivideInteger {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -3;
        System.out.println(divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        if(dividend==0){
            return 0;
        } else if (dividend==divisor){
            return  1;
        }
        int answer = 0;
        boolean isPlus = ((dividend>0)==(divisor>0));
        boolean dividendPlus = (dividend>0);
        if (isPlus && dividend==Integer.MIN_VALUE && divisor==-1) {
            return Integer.MAX_VALUE;
        }

        if (!isPlus) {
            divisor = -divisor;
        }

        if (dividendPlus) {
            while (dividend>=divisor) {
                dividend -=divisor;
                answer++;
            }
        } else {
            while (dividend<=divisor) {
                dividend -=divisor;
                answer++;
            }
        }

        if (!isPlus) {
            answer = -answer;
        }
        return answer;
    }
}
/*
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = truncate(3.33333..) = 3.

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = truncate(-2.33333..) = -2.

Input: dividend = 0, divisor = 1
Output: 0

Input: dividend = 1, divisor = 1
Output: 1
 */