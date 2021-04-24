package leetcode;

import java.util.Arrays;

public class S34_FindFirstLastPositionElement {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        boolean isFirst = false;
        boolean isLast = false;
        int firstIndex = 0;
        int lastIndex = nums.length-1;
        if (nums.length<=1){
            if (nums.length==0){
                return new int[]{-1, -1};
            } else {
                if (nums[0]==target){
                    return new int[]{0,0};
                } else {
                    return new int[]{-1,-1};
                }
            }
        }
        while (!isFirst || !isLast) {
            if (firstIndex>lastIndex){
                break;
            }
            if (!isFirst){
                if (nums[firstIndex]==target){
                    isFirst=true;
                    answer[0]=firstIndex;
                } else {
                    firstIndex++;
                }
            }
            if (!isLast){
                if (nums[lastIndex]==target){
                    isLast = true;
                    answer[1] = lastIndex;
                } else {
                    lastIndex--;
                }
            }
        }
        if (isFirst && isLast){
            return answer;
        } else if (!isFirst && !isLast) {
            return new int[]{-1,-1};
        } else if (!isFirst){
            answer[0] = answer[1];
            return answer;
        } else {
            answer[1] = answer[0];
            return answer;
        }
    }
}


/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Input: nums = [], target = 0
Output: [-1,-1]
 */