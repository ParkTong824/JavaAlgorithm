package leetcode5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class S350_IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();

        List<Integer> arr = Arrays.stream(nums1).boxed().toList();
        List<Integer> arr2 = Arrays.stream(nums2).boxed().toList();

        num1.addAll(arr);
        num2.addAll(arr2);
        num1.retainAll(num2);

        return num1.stream().mapToInt(i -> i).toArray();
    }
}

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */