package leetcode;

import java.util.*;

public class S26_RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int answer = 0;
        int firstIndex = 1;
        int lastIndex = nums.length-2;
        Set<Integer> arrSet = new HashSet<>();
        if (nums[0]!=nums[nums.length-1]){
            answer=2;
            arrSet.add(nums[0]);
            arrSet.add(nums[nums.length-1]);
        }else {
            return 1;
        }
        while (firstIndex<=lastIndex){
            if (arrSet.add(nums[firstIndex])){
                answer++;
            }
            if (arrSet.add(nums[lastIndex])){
                answer++;
            }
            firstIndex++;
            lastIndex--;
        }
        List<Integer> sortArr = new ArrayList<>(arrSet);
        Collections.sort(sortArr);
        int i = 0;
        for (int num : sortArr){
            nums[i++] = num;
        }
        return answer;
    }
}
