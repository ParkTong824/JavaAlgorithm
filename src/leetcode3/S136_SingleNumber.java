package leetcode3;

import java.util.*;

public class S136_SingleNumber {
    public static int singleNumber(int[] nums) {
        Set<Integer> checkSet = new HashSet<>();
        for (int num : nums) {
            if (!checkSet.add(num)){
                checkSet.remove(num);
            }
        }
        return (int) checkSet.toArray()[0];
    }

    public static void main(String[] args) {
        Set<Integer> check = new HashSet<>();
        int[] nums = {1};
        System.out.println(check.add(1));
        System.out.println(check.add(1));
    }
}
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */