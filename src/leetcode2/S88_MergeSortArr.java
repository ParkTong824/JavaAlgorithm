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
        if (nums1.length!=m) {
            if (nums1.length==n){
                nums1 = Arrays.copyOfRange(nums2,0,n);
            } else {
                int[] tempArr = nums1.clone();
                int firstIndex = 0;
                int secondIndex = 0;
                int firstNum;
                int secondNum;
                while (m>0||n>0){
                    if (m>0){
                        firstNum = tempArr[firstIndex];
                        if (n>0){
                            secondNum=nums2[secondIndex];
                            if (firstNum>secondNum){
                                nums1[firstIndex+secondIndex]=secondNum;
                                secondIndex++;
                                n--;
                            } else {
                                nums1[firstIndex+secondIndex]=firstNum;
                                firstIndex++;
                                m--;
                            }
                        } else {
                            nums1[firstIndex+secondIndex]=firstNum;
                            firstIndex++;
                        }
                    } else {
                        secondNum=nums2[secondIndex];
                        nums1[firstIndex+secondIndex]=secondNum;
                        secondIndex++;
                        n--;
                    }
                }
            }
        }

    }
}
/*
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
