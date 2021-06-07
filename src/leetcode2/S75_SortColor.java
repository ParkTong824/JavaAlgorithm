package leetcode2;

import java.util.Arrays;

public class S75_SortColor {
    public static void sortColors(int[] nums) {
        int pivotIndex = 0;
        while (pivotIndex<nums.length-1){
            for (int i = nums.length-1 ; i > pivotIndex ; i--){
                if (nums[pivotIndex]>nums[i]){
                    int temp = nums[pivotIndex];
                    nums[pivotIndex] = nums[i];
                    nums[i] = temp;
                }
            }
            pivotIndex++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

/*
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]

Input: nums = [1]
Output: [1]
 */
