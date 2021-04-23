package leetcode;

public class S33_SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 4;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int midIndex = nums.length/2;
        if (nums[midIndex]==target){
            return midIndex;
        }
        if (nums.length==1){
            if (nums[0] == target){
                return 0;
            }else {
                return -1;
            }
        }
        if (nums[midIndex]>nums[0]) {
            if (nums[midIndex]>target) {
                return decreaseSearch(nums, target, midIndex);
            } else {
                return increaseSearch(nums, target, midIndex);
            }
        } else {  // 7812 3 456
            if (nums[midIndex]>target) {
                return decreaseSearch(nums, target, midIndex);
            } else {
                return increaseSearch(nums, target, midIndex);
            }
        }
    }
    public static int decreaseSearch(int[] nums, int target, int midIndex){
        int findIndex = midIndex-1;
        int answer = -1;
        while (findIndex!=midIndex){
            if (findIndex==nums.length){
                findIndex=nums.length-1;
            }
            if (nums[findIndex]==target){
                return findIndex;
            } else {
                int indexVal = nums[findIndex];
                findIndex--;
                if (findIndex<0){
                    findIndex=nums.length-1;
                }
                if (indexVal<nums[findIndex]){
                    return -1;
                }
            }
        }
        return answer;
    }
    public static int increaseSearch(int[] nums, int target, int midIndex){
        int findIndex = midIndex+1;
        int answer = -1;
        while (findIndex!=midIndex){
            if (findIndex==nums.length){
                findIndex=0;
            }
            if (nums[findIndex]==target){
                return findIndex;
            } else {
                int indexVal = nums[findIndex];
                findIndex++;
                if (findIndex==nums.length){
                    findIndex=0;
                }
                if (indexVal>nums[findIndex]){
                    return -1;
                }
            }
        }
        return answer;
    }
}
/*
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Input: nums = [1], target = 0
Output: -1
 */