package leetcode5;

public class S258_AddDigits {
    public int addDigits(int num) {
        return recursivePlus(num);
    }

    private int recursivePlus(int num) {
        int answer = 0;
        while (num >= 10) {
            answer += num%10;
            num /=10;
        }
        answer += num;
        if (answer >= 10) {
            answer = recursivePlus(answer);
        }
        return answer;
    }
}
/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.


Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Input: num = 0
Output: 0


Constraints:

0 <= num <= 231 - 1


Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */
