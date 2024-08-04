package leetcode2;

import java.util.Arrays;

public class S88_MergeSortArr {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m =3;
        int[] nums2 = {2, 5, 6};
        int n =3;

        merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] answer = new int[m + n];
        int num1Index = 0;
        int num2Index = 0;
        while (num1Index < m || num2Index < n) {
            if (num1Index == m) {
                answer[num1Index+num2Index] = nums2[num2Index];
                num2Index++;
                continue;
            } else if (num2Index == n) {
                answer[num1Index+num2Index] = nums1[num1Index];
                num1Index++;
                continue;
            }

            if (nums1[num1Index] > nums2[num2Index]) {
                answer[num1Index+num2Index] = nums2[num2Index];
                num2Index++;
            } else {
                answer[num1Index+num2Index] = nums1[num1Index];
                num1Index++;
            }
        }
        System.arraycopy(answer, 0, nums1, 0, answer.length);
    }
}
/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
