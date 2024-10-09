package leetcode6;

public class S504_Base7 {
    public String convertToBase7(int num) {
        boolean isMinus = false;
        if (num < 0) {
            isMinus = true;
            num = -num;
        }
        StringBuilder res = new StringBuilder();
        while (num != 0) {
            res.append(num % 7);
            num /= 7;
        }
        String answer = res.isEmpty() ? "0" : res.reverse().toString();
        if (isMinus) {
            answer = "-" + answer;
        }

        return answer;
    }
    public static void main(String[] args) {
        S504_Base7 base7 = new S504_Base7();
        System.out.println(base7.convertToBase7(-7));
    }
}
/*
Given an integer num, return a string of its base 7 representation.



Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"


Constraints:

-107 <= num <= 107
 */