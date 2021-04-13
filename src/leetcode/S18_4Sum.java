package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S18_4Sum {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answerList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length ; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int l = nums.length-1 ; l>= i ; l--){
                if (l<nums.length-1 && nums[l]==nums[l+1]){
                    continue;
                }
                int j = i+1;
                int k = l-1;

                while (j<k){
                    int compare = nums[i]+nums[j]+nums[k]+nums[l];
                    if (compare==target){
                        answerList.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        j++;
                        k--;
                        while (j<nums.length && nums[j]==nums[j-1]){
                            j++;
                        }
                        while (k>=0 && nums[k]==nums[k+1]){
                            k--;
                        }
                    }else if (compare<target){
                        j++;
                    }else {
                        k--;
                    }
                }
            }

        }

        return answerList;
    }
}
