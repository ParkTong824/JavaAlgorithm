package leetcode4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class S169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int answer = 0;
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (numMap.containsKey(nums[i])) {
                numMap.replace(nums[i],numMap.get(nums[i])+1);
            } else {
                numMap.put(nums[i],1);
            }
        }
        for (int key : numMap.keySet()){
            if(answer==0){
                answer = key;
                continue;
            }
            answer = numMap.get(answer)>numMap.get(key)?answer:key;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
/*
Input: nums = [3,2,3]
Output: 3

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */