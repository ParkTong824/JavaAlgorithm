package leetcode5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> answerSet = new HashSet<>();
        int[] sortNum1 = nums1.clone();
        int[] sortNum2 = nums2.clone();
        Arrays.sort(sortNum1);
        Arrays.sort(sortNum2);
        int oneIndex = 0;
        int twoIndex = 0;
        while (oneIndex < sortNum1.length && twoIndex < sortNum2.length) {
            if (sortNum1[oneIndex] == sortNum2[twoIndex]) {
                answerSet.add(sortNum1[oneIndex]);
                oneIndex++;
                twoIndex++;
            } else {
                if (sortNum1[oneIndex] > sortNum2[twoIndex]) {
                    twoIndex++;
                } else {
                    oneIndex++;
                }
            }
        }
        int[] answer = new int[answerSet.size()];
        int answerIndex = 0;
        for (int i : nums1) {
            if (answerSet.contains(i)) {
                answer[answerIndex] = i;
                answerSet.remove(i);
                answerIndex++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
    }
}
/*
Given two integer arrays nums1 and nums2, return an array of their
intersection
. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */