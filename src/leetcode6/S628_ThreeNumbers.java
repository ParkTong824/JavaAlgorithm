package leetcode6;

import java.util.Arrays;

public class S628_ThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int[] checkArr = new int[3];
        for (int i = 0 ; i < nums.length ; i++) {
            boolean isBig = false;
            for (int j = 0 ; j < checkArr.length ; j++) {
                if (nums[i]>checkArr[j]){
                    isBig = true;
                }
                if (isBig && nums[i]==checkArr[j]){
                    if (j>0) {
                        changeSort(checkArr,nums[i],j-1);
                    }
                    break;
                } else if (nums[i]<checkArr[j] && isBig){
                    changeSort(checkArr,nums[i],j);
                    break;
                }
            }
        }
        int answer = 1;
        for (int i = 0 ; i <checkArr.length ; i++) {
            answer *=checkArr[i];
        }
        return answer;
    }
    public static int[] changeSort(int[] check, int changeNum,int index) {
        int tempNum = 0;
        for (int i = index ; i >=0 ; i--) {
            tempNum = check[i];
            check[i] = changeNum;
            changeNum = tempNum;
        }
        return check;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3};
        System.out.println(maximumProduct(test));
    }
}
/*
Input: nums = [1,2,3]
Output: 6

Input: nums = [1,2,3,4]
Output: 24

Input: nums = [-1,-2,-3]
Output: -6
 */