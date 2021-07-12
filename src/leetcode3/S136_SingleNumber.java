package leetcode3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class S136_SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> intMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (intMap.containsKey(nums[i])){
                intMap.put(nums[i],intMap.get(nums[i])+1);
            } else {
                intMap.put(nums[i],1);
            }
        }

        for (int key : intMap.keySet()){
            if (intMap.get(key)==1){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }
}
/*
Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */