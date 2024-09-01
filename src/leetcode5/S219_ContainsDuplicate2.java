package leetcode5;

import java.util.HashMap;
import java.util.Map;

public class S219_ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean answer = false;
        Map<Integer, Integer> checkIndexMap = new HashMap<>();
        Map<Integer, Boolean> checkBooleanMap = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if (checkIndexMap.containsKey(nums[i])) {
                if (i-checkIndexMap.get(nums[i]) > k) {
                    if (!checkBooleanMap.containsKey(nums[i])) {
                        checkBooleanMap.put(nums[i], false);
                    }
                } else {
                    answer = true;
                    checkBooleanMap.put(nums[i], true);
                }
                checkIndexMap.replace(nums[i], i);
            } else {
                checkIndexMap.put(nums[i], i);
            }
        }

        for (int key : checkBooleanMap.keySet()) {
            if (checkBooleanMap.get(key)) {
                return true;
            }
        }
        return answer;
    }
}
/*
Given an integer array nums and an integer k, return true if there are two distinct
indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 */