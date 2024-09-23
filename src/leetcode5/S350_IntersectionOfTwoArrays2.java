package leetcode5;

import java.util.*;
import java.util.stream.Collectors;

public class S350_IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for ( int i : nums1 ) {
            numberMap.put(i, numberMap.getOrDefault(i, 0)+1);
        }
        for (int i : nums2) {
            if (numberMap.containsKey(i)) {
                result.add(i);
                int containCount = numberMap.get(i);
                if (containCount == 1) {
                    numberMap.remove(i);
                } else {
                    numberMap.put(i, containCount-1);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0 ; i < answer.length ; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}

/*

[54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41]

[17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20]

Output
[,,,84,84,48,84,54,62,67,27,60,0,61,94,84,55,55,60,76,35,84,28,4,9,86,12,89,41,21,65,33]
Expected
[54,21,73,84,60,18,62,59,89,89,41,55,27,65,94,61,12,76,35,48,0,60,84,9,28,55,4,67,86,33]


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