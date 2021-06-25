package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S46_Permutations {
    public static List<List> permute(int[] nums) {
        return addArray(nums);
    }
    public static List<List> addArray(int[] nums){
        List<List> returnArr = new ArrayList<>();
        if (nums.length==1){
            returnArr.add(Arrays.asList(nums[0]));
            return returnArr;
        }
        int[] beforeNums = Arrays.copyOf(nums,nums.length-1);
        List<List> beforeArr = addArray(beforeNums);
        for (int i = nums.length-1 ; i>=0; i--){
            for (int j = 0 ; j < beforeArr.size() ; j++){
                List<Integer> addArr = new ArrayList<>(beforeArr.get(j));
                addArr.add(i,nums[nums.length-1]);
                returnArr.add(addArr);
            }
        }
        return returnArr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(permute(nums).toString());

    }
}
/*
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Input: nums = [0,1]
Output: [[0,1],[1,0]]

Input: nums = [1]
Output: [[1]]
 */