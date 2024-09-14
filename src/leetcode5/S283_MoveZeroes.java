package leetcode5;

public class S283_MoveZeroes {
    public static void main(String[] args) {
        int[] test = {0,1,0,3,12};
        moveZeroes(test);
    }
    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (zeroCount > 0){
                nums[i-zeroCount] = nums[i];
            }
        }
        for (int i = 0 ; i < zeroCount ; i++) {
            nums[nums.length-1-i] = 0;
        }
    }
}
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?
 */