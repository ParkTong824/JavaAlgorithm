package leetcode6;

import java.util.Arrays;

public class S594_LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        boolean isHS = false;
        int maxLength = 0;
        int tempNum = 1;
        int sameNumLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                tempNum++;
                sameNumLength++;
            } else if (nums[i] - nums[i - 1] == 1) {
                if (!isHS) {
                    isHS = true;
                } else {
                    maxLength = Math.max(maxLength, tempNum);
                    tempNum = sameNumLength+1;
                    sameNumLength = 1;
                }
            } else {
                if (isHS && tempNum > maxLength) {
                    maxLength = tempNum;
                    tempNum = 1;
                    sameNumLength = 1;
                    isHS = false;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        S594_LongestHarmoniousSubsequence solution = new S594_LongestHarmoniousSubsequence();
        System.out.println(solution.findLHS(nums));
    }
}
/*
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious
subsequence
 among all its possible subsequences.



Example 1:

Input: nums = [1,3,2,2,5,2,3,7]

Output: 5

Explanation:

The longest harmonious subsequence is [3,2,2,2,3].

Example 2:

Input: nums = [1,2,3,4]

Output: 2

Explanation:

The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

Example 3:

Input: nums = [1,1,1,1]

Output: 0

Explanation:

No harmonic subsequence exists.



Constraints:

1 <= nums.length <= 2 * 104
-109 <= nums[i] <= 109
 */
