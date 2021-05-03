package leetcode;

import java.util.ArrayList;
import java.util.List;

public class S46_Permutations {
    public List<List> permute(int[] nums) {

        List<List> answer = new ArrayList<>();
        List<Integer> compareList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            compareList.add(nums[i]);
        }
        fillList(answer, new ArrayList<Integer>(), compareList);
        return answer;

    }

    public void fillList(List<List> answer, List<Integer> list, List<Integer> compareList) {
        if (compareList.size() == 0) {
            answer.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < compareList.size(); i++) {
            list.add(compareList.get(i));
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                curr.add(compareList.get(j));
            }
            for (int k = i + 1; k < compareList.size(); k++) {
                curr.add(compareList.get(k));
            }
            fillList(answer, list, curr);
            list.remove(list.size() - 1);
        }


    }
}
/*
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Input: nums = [0,1]
Output: [[0,1],[1,0]]

Input: nums = [1]
Output: [[1]]
 */