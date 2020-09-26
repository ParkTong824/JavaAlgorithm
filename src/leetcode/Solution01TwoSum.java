package leetcode;

public class Solution01TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0 ; i < nums.length-1; i ++){
            for (int j = i+1 ; j < nums.length ; j++){
                if (target-nums[i]==nums[j]){
                    answer = new int[]{i, j};
                    break;
                }
            }
            if (answer!=null){
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] answer = twoSum(nums,target);
        System.out.println(answer[0]);
        System.out.println(answer[0]);
    }
}
/*
Input
[3,2,4]
6
 */