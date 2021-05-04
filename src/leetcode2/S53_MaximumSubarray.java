package leetcode2;

public class S53_MaximumSubarray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
            current = Math.max(nums[i],current+nums[i]);
            max=Math.max(max,current);
        }
        return max;
    }
}
/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [1]
Output: 1

Input: nums = [5,4,-1,7,8]
Output: 23
 */