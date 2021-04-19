package leetcode;

public class S27_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int returnSize = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i]!=val){
                nums[returnSize] = nums[i];
                returnSize++;
            }
        }
        return returnSize;
    }

    public static void main(String[] args) {
        int[] num = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(num,val));
    }
}
/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length.
For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3]
Explanation: Your function should return length = 5,
with the first five elements of nums containing 0, 1, 3, 0, and 4.
Note that the order of those five elements can be arbitrary.
It doesn't matter what values are set beyond the returned length.
 */