package leetcode5;

import java.util.HashSet;
import java.util.Set;

public class S217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checkSet = new HashSet<>();
        for (int i : nums) {
            if (!checkSet.add(i)){
                return true;
            }
        }

        return false;
    }
}

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true

Explanation:
The element 1 occurs at the indices 0 and 3.

Input: nums = [1,2,3,4]
Output: false

Explanation:
All elements are distinct.

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */