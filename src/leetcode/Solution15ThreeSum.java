package leetcode;

import java.util.*;

public class Solution15ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<nums.length && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(k>=0 && nums[k]==nums[k+1]){
                        k--;
                    }
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer = threeSum(nums);

        System.out.println(answer.get(0).toString());
    }
}
/*
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Input: nums = []
Output: []

Input: nums = [0]
Output: []
 */