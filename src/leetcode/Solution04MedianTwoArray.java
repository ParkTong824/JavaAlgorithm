package leetcode;

public class Solution04MedianTwoArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0;
        if (nums1.length==0){
            if (nums2.length%2==0){
                return answer = (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
            }else {
                return answer = nums2[nums2.length/2];
            }
        }else if (nums2.length==0){
            if (nums1.length%2==0){
                return answer = (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;
            }else {
                return answer = nums1[nums1.length/2];
            }
        }
        int numA = nums1[0];
        int numAIndex = 0;
        int numB = nums2[0];
        int numBIndex = 0;
        boolean isNumALength = false;
        boolean isNumBLength = false;
        int[] sumArr = new int[nums1.length+nums2.length];

        for (int i = 0 ; i < sumArr.length ; i++){
            if (isNumALength){
                sumArr[i] = numB;
                numBIndex++;
                if (numBIndex==nums2.length){
                    continue;
                }
                numB = nums2[numBIndex];
                continue;
            } else if (isNumBLength){
                sumArr[i] = numA;
                numAIndex++;
                if (numAIndex==nums1.length){
                    continue;
                }
                numA = nums1[numAIndex];
                continue;
            }
            if (numA<numB){
                sumArr[i] = numA;
                numAIndex++;
                if (numAIndex==nums1.length){
                    isNumALength=true;
                    continue;
                }
                numA = nums1[numAIndex];
            }else {
                sumArr[i] = numB;
                numBIndex++;
                if (numBIndex==nums2.length){
                    isNumBLength=true;
                    continue;
                }
                numB = nums2[numBIndex];
            }
        }
        if (sumArr.length%2==0){
            answer = (sumArr[sumArr.length/2]+sumArr[sumArr.length/2-1])/2.0;
        }else {
            answer = sumArr[sumArr.length/2];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2,3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
/*
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
