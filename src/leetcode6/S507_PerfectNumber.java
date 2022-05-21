package leetcode6;

import java.util.ArrayList;
import java.util.List;

public class S507_PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int checkNum = 2;
        List<Integer> divisorArr = new ArrayList<>();
        divisorArr.add(1);
        while (checkNum <= Math.sqrt(num)) {
            if (num%checkNum == 0) {
                divisorArr.add(checkNum);
                divisorArr.add(num/checkNum);
            }
            checkNum++;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
/*
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.

Input: num = 7
Output: false
 */