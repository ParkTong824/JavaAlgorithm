package leetcode;

public class S45_JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int small = nums[0];
        int answer = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i]<small) {
                small= nums[i];
                answer++;
            }
        }
        return answer;
    }
}
/*
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
 Jump 1 step from index 0 to 1, then 3 steps to the last index.

Input: nums = [2,3,0,1,4]
Output: 2
 */
