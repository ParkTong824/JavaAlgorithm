package leetcode;

import java.util.Arrays;

public class S16_3SumCloset {
    public static void main(String[] args) {

    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = nums[0]+nums[1]+nums[nums.length-1];
        for (int i = 0 ; i< nums.length ; i++){
            if (i >0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int checkSum = nums[i]+nums[j]+nums[k];
                int compare = answer;
                if (checkSum==target){
                    return checkSum;
                }
                answer = (Math.abs(answer-target)>Math.abs(checkSum-target) ? checkSum : answer);
                if (Math.abs(compare-target)>Math.abs(checkSum-target)){
                    if (checkSum>target && k>0){
                        k--;
                        while (k>0 && nums[k]==nums[k+1]){
                            k--;
                        }
                    }else if (checkSum<target && j<nums.length-1){
                        j++;
                        while (j<nums.length-1 && nums[j]==nums[j-1]){
                            j++;
                        }
                    }
                } else if (checkSum>target && k>0){
                    k--;
                }else if (checkSum<target && j<nums.length-1){
                    j++;
                }
            }
        }
        return answer;
    }
}
