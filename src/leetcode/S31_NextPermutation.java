package leetcode;

import java.util.Arrays;

public class S31_NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int compareNum = -1;
        boolean isFinish = false;
        int[] head;
        int[] tail;
        for (int i = nums.length-1 ; i>=0 ; i--) {
            if (compareNum >nums[i]){
                compareNum = nums[i];
                for (int j = i+1 ; j<nums.length ; j++) {
                    if (j+1==nums.length){
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        head = Arrays.copyOf(nums,i+1);
                        tail = Arrays.copyOfRange(nums,i+1,nums.length);
                        Arrays.sort(tail);
                        for (int a = 0 ; a < head.length ; a++){
                            nums[a] = head[a];
                        }
                        int index = 0;
                        for (int a = head.length ; a < nums.length ; a++){
                            nums[a] = tail[index];
                            index++;
                        }
                        isFinish = true;
                        break;
                    } else {
                        if (compareNum>=nums[j+1]){
                            int temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                            head = Arrays.copyOf(nums,i+1);
                            tail = Arrays.copyOfRange(nums,i+1,nums.length);
                            Arrays.sort(tail);
                            for (int a = 0 ; a < head.length ; a++){
                                nums[a] = head[a];
                            }
                            int index = 0;
                            for (int a = head.length ; a < nums.length ; a++){
                                nums[a] = tail[index];
                                index++;
                            }
                            isFinish = true;
                            break;
                        }
                    }
                }
            } else {
                compareNum = nums[i];
            }
            if (isFinish){
                break;
            }
        }
        if (!isFinish){
            Arrays.sort(nums);
        }
    }
}
/*
Input: nums = [1,2,3]
Output: [1,3,2]

Input: nums = [3,2,1]
Output: [1,2,3]

Input: nums = [1,1,5]
Output: [1,5,1]

Input: nums = [1]
Output: [1]
 */