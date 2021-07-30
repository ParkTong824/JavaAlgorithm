package leetcode4;

import java.util.Arrays;

public class S167_TwoSumArr {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0 ; i < numbers.length-1 ; i++){
            for (int j = i+1 ; j < numbers.length; j++){
                if (numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{0,1};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}

/*
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

Input: numbers = [2,3,4], target = 6
Output: [1,3]

Input: numbers = [-1,0], target = -1
Output: [1,2]
 */