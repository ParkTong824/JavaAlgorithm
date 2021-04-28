package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S39_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target).toString());
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        recursiveFuntion(candidates, 0, target, new ArrayList<Integer>(), result);
        return result;
    }
    private static void recursiveFuntion(int[] candidates, int start, int currentTarget, List<Integer> soFar, List<List<Integer>> result)
    {
        if (currentTarget == 0)
        {
            result.add(new ArrayList<Integer>(soFar));
        }
        else
        {
            for (int i = start; i < candidates.length; i++)
            {
                if (candidates[i] <= currentTarget)
                {
                    soFar.add(candidates[i]);
                    recursiveFuntion(candidates, i, currentTarget-candidates[i], soFar, result);
                    soFar.remove(soFar.size()-1);
                }
            }
        }
    }
}
/*
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Input: candidates = [2], target = 1
Output: []

Input: candidates = [1], target = 1
Output: [[1]]

Input: candidates = [1], target = 2
Output: [[1,1]]
 */