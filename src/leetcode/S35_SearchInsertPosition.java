package leetcode;

public class S35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int finishIndex = nums.length-1;
        while (true) {
            int[] checkArr = isFront(nums,target,startIndex,finishIndex);
            startIndex = checkArr[0];
            finishIndex = checkArr[1];
            if (finishIndex-startIndex==1){
                return finishIndex;
            }
            if (checkArr[2]==0){
                if (nums[checkArr[1]]==target){
                    return checkArr[1];
                }
            }
        }


    }       //  1 3 5 6 7 8     4-0 /2 = 2

    public static int[] isFront(int[] nums, int target, int startIndex, int finishIndex){
        int[] returnArr;
        int searchIndex = (finishIndex - startIndex)/2;
        boolean isFront = nums[startIndex+searchIndex] >=target;
        if (isFront) {
            returnArr = new int[]{startIndex, startIndex+searchIndex, 0};
        } else {
            returnArr = new int[]{startIndex+searchIndex,finishIndex, 1};
        }
        return returnArr;
    }
}
/*
Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4

Input: nums = [1,3,5,6], target = 0
Output: 0

Input: nums = [1], target = 0
Output: 0
 */
