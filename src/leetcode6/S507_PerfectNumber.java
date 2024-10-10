package leetcode6;

import java.util.ArrayList;
import java.util.List;

public class S507_PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int checkNum = 1;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                checkNum+=i;
                checkNum+=num/i;
            }
        }

        return checkNum == num;
    }

    public static void main(String[] args) {
        System.out.println(new S507_PerfectNumber().checkPerfectNumber(28));
    }
}
/*
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.



Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:

Input: num = 7
Output: false
 */