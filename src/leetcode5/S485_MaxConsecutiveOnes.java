package leetcode5;

public class S485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int checkNum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i]==0){
                answer= Math.max(answer, checkNum);
                checkNum = 0;
            } else {
                checkNum++;
            }
        }
        return Math.max(answer, checkNum);
    }
}
/*
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Input: nums = [1,0,1,1,0,1]
Output: 2
 */