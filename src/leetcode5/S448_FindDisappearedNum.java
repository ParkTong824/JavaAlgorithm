package leetcode5;

import java.util.*;

public class S448_FindDisappearedNum {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> checkSet = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i++) {
            checkSet.add(i+1);
        }
        for (int i = 0 ; i <nums.length ; i++) {
            checkSet.remove(nums[i]);
        }
        List<Integer> answer = new ArrayList<>(checkSet);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums).toString());
    }
}
